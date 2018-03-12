package br.com.payment.management.core.contribution.model;

import br.com.payment.management.core.campaign.model.Campaign;
import br.com.payment.management.core.contributor.model.Contributor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Date;

/**
 * Entity which represents the table with the definition of a certain contribution associated to a specific {@link Campaign}.
 *
 * @author wcustodio
 */
@Entity
@Table(name = "CONTRIBUTION")
public class Contribution {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @NotNull(message = "application.contribution.messages.creationDate.empty")
    @Column(name = "CREATION_DATE")
    private Date creationDate;

    @NotNull(message = "application.contribution.messages.amount.empty")
    @Column(name = "AMOUNT")
    private Long amount;

    @NotNull(message = "application.contribution.messages.campaign.empty")
    @ManyToOne
    @JoinColumn(name = "ID_CAMPAIGN")
    private Campaign campaign;

    @NotNull(message = "application.contribution.messages.contributor.empty")
    @ManyToOne
    @JoinColumn(name = "ID_CONTRIBUTOR")
    private Contributor contributor;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public Campaign getCampaign() {
        return campaign;
    }

    public void setCampaign(Campaign campaign) {
        this.campaign = campaign;
    }

    public Contributor getContributor() {
        return contributor;
    }

    public void setContributor(Contributor contributor) {
        this.contributor = contributor;
    }
}
