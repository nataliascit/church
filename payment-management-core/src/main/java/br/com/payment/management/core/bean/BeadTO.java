package br.com.payment.management.core.bean;

import java.util.List;

/**
 * Transition Object which represents the table with the definition of a certain bead.
 *
 * @author wcustodio.
 */
public class BeadTO {

    private Long id;

    private Long identificationNumber;

    private ContributorTO contributor;

    private CampaignTO campaign;

    private List<ContributionTO> contributions;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(Long identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public ContributorTO getContributor() {
        return contributor;
    }

    public void setContributor(ContributorTO contributor) {
        this.contributor = contributor;
    }

    public CampaignTO getCampaign() {
        return campaign;
    }

    public void setCampaign(CampaignTO campaign) {
        this.campaign = campaign;
    }

    public List<ContributionTO> getContributions() {
        return contributions;
    }

    public void setContributions(List<ContributionTO> contributions) {
        this.contributions = contributions;
    }
}
