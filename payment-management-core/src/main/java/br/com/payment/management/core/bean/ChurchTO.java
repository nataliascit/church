package br.com.payment.management.core.bean;

import java.util.List;

/**
 * Transition Object which represents the table with the definition of the main entity owner of all {@link ContributionTO}.
 *
 * @author wcustodio.
 */
public class ChurchTO {

    private Long id;

    private String name;

    private List<CampaignTO> campaigns;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<CampaignTO> getCampaigns() {
        return campaigns;
    }

    public void setCampaigns(List<CampaignTO> campaigns) {
        this.campaigns = campaigns;
    }
}