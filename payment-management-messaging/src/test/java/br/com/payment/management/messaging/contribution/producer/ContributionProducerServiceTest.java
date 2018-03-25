package br.com.payment.management.messaging.contribution.producer;

import br.com.payment.management.messaging.contribution.common.configuration.BaseTestRunner;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class ContributionProducerServiceTest extends BaseTestRunner {

    @Autowired
    private ContributionProducerService contributionProducerService;

    @Test
    public void send() {
        this.contributionProducerService.send("Test 123...");
    }
}