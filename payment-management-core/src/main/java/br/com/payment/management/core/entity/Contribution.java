package br.com.payment.management.core.entity;

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

    @NotNull(message = "contribution.creation.date.empty.error")
    @Column(name = "CREATION_DATE")
    private Date creationDate;

    @NotNull(message = "contribution.amount.empty.error")
    @Column(name = "AMOUNT")
    private Long amount;

    @NotNull(message = "contribution.campaign.empty.error")
    @ManyToOne
    @JoinColumn(name = "ID_CAMPAIGN")
    private Campaign campaign;

    @NotNull(message = "contribution.contributor.empty.error")
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
