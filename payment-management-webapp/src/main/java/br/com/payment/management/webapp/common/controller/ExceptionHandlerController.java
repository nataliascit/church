package br.com.payment.management.webapp.common.controller;

import br.com.payment.management.core.common.exception.BusinessException;
import br.com.payment.management.webapp.common.model.ExceptionResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Controller responsible for handling all the exceptions for a better way of showing the messages.
 *
 * @author wcustodio
 */
@ControllerAdvice
public class ExceptionHandlerController {

    @ExceptionHandler(javax.validation.ConstraintViolationException.class)
    public ResponseEntity<ExceptionResponse> constraintViolationException(final javax.validation.ConstraintViolationException constraintViolationException) {
        final ExceptionResponse response = new ExceptionResponse(constraintViolationException);
        constraintViolationException.getConstraintViolations().forEach(violation -> response.getKeys().add(violation.getMessage()));
        final HttpStatus status = HttpStatus.valueOf(Integer.valueOf(response.getStatus()));
        return new ResponseEntity<>(response, status);
    }

    @ExceptionHandler(org.hibernate.exception.ConstraintViolationException.class)
    public ResponseEntity<ExceptionResponse> constraintViolationException(final org.hibernate.exception.ConstraintViolationException constraintViolationException) {
        final ExceptionResponse response = new ExceptionResponse(constraintViolationException, constraintViolationException.getConstraintName());
        final HttpStatus status = HttpStatus.valueOf(Integer.valueOf(response.getStatus()));
        return new ResponseEntity<>(response, status);
    }

    @ExceptionHandler(BusinessException.class)
    public ResponseEntity<ExceptionResponse> businessException(final BusinessException businessException) {
        final ExceptionResponse.Type type = ExceptionResponse.Type.valueOf(businessException.getType().name());
        final ExceptionResponse response = new ExceptionResponse(type, HttpStatus.BAD_REQUEST, businessException.getMessage(), businessException.getKey());
        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }
}
