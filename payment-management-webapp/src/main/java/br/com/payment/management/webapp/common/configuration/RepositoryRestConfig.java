package br.com.payment.management.webapp.common.configuration;

import br.com.payment.management.core.bead.model.Bead;
import br.com.payment.management.core.campaign.model.Campaign;
import br.com.payment.management.core.church.model.Church;
import br.com.payment.management.core.contribution.model.Contribution;
import br.com.payment.management.core.contributor.model.Contributor;
import br.com.payment.management.core.provingType.model.ProvingType;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;

/**
 * Class responsible for configuring the behavior for all RestRepositories.
 *
 * @author William Custodio
 */
@Configuration
public class RepositoryRestConfig extends RepositoryRestConfigurerAdapter {

    @Override
    public void configureRepositoryRestConfiguration(final RepositoryRestConfiguration config) {
        config.exposeIdsFor(Bead.class);
        config.exposeIdsFor(Campaign.class);
        config.exposeIdsFor(Church.class);
        config.exposeIdsFor(Contribution.class);
        config.exposeIdsFor(Contributor.class);
        config.exposeIdsFor(ProvingType.class);
    }
}