package br.com.payment.management.messaging.contribution.producer;

import br.com.payment.management.messaging.contribution.util.ContributionMessagingParameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
public class ContributionProducerService {

    @Autowired
    private JmsTemplate jmsTemplate;

    @Autowired
    private ContributionMessagingParameter contributionMessagingParameter;

    /**
     * Send the message used as base for the generation of a contribution's report.
     * @param message The message containing the data used as base for the generation.
     */
    public void send(final String message) {
        jmsTemplate.convertAndSend(contributionMessagingParameter.getQueueContributionReport(), message);
    }
}