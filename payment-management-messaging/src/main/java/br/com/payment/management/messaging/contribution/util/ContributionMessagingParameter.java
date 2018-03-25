package br.com.payment.management.messaging.contribution.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ContributionMessagingParameter {

    @Value("${spring.activemq.queue.contribution.report}")
    private String queueContributionReport;

    /**
     * Get the configuration property used to define the name of the queue responsible for generating the report.
     * @return The value of the property.
     */
    public String getQueueContributionReport() {
        return queueContributionReport;
    }
}
