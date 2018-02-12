package br.com.payment.management.webapp.campaign.validator;

import br.com.payment.management.core.campaign.model.Campaign;
import br.com.payment.management.core.campaign.service.CampaignServiceValidator;
import br.com.payment.management.core.church.model.Church;
import br.com.payment.management.core.common.exception.BusinessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 * Validator responsible for performing custom validations before deleting a {@link Campaign}.
 *
 * @author wcustodio
 */
@Component("beforeDeleteCampaignValidator")
public class BeforeDeleteCampaignValidator implements Validator {

    @Autowired
    private CampaignServiceValidator campaignServiceValidator;

    @Override
    public boolean supports(final Class<?> clazz) {
        return Campaign.class.equals(clazz);
    }

    @Override
    public void validate(final Object target, final Errors errors) {
        try {
            final Campaign campaign = (Campaign) target;
            this.campaignServiceValidator.validateBeforeDeletion(campaign);
        } catch (final BusinessException businessException) {
            errors.reject(businessException.getKey());
        }
    }
}