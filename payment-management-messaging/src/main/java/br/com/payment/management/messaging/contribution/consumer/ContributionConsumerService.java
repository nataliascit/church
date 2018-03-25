package br.com.payment.management.messaging.contribution.consumer;

import br.com.payment.management.messaging.contribution.producer.ContributionProducerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

@Service
public class ContributionConsumerService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ContributionProducerService.class);

    @JmsListener(destination = "${spring.activemq.queue.contribution.report}")
    public void receive(String message) {
        LOGGER.info("received message='{}'", message);
    }
}