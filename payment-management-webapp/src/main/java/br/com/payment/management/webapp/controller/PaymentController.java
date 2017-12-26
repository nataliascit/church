package br.com.payment.management.webapp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
public class PaymentController {

  @RequestMapping(method = RequestMethod.GET)
  public ResponseEntity findAll() {
    return ResponseEntity.ok().build();
  }
}