package br.com.payment.management.core.bean;

import java.time.LocalDate;

/**
 * Transition Object which represents the table with the definition of a certain contribution associated to a specific {@link CampaignTO}.
 *
 * @author wcustodio.
 */
public class ContributionTO {

    private Long id;

    private LocalDate creationDate;

    private Long amount;

    private CampaignTO campaign;

    private ContributorTO contributor;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public CampaignTO getCampaign() {
        return campaign;
    }

    public void setCampaign(CampaignTO campaign) {
        this.campaign = campaign;
    }

    public ContributorTO getContributor() {
        return contributor;
    }

    public void setContributor(ContributorTO contributor) {
        this.contributor = contributor;
    }
}
