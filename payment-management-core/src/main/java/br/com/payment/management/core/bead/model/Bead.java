package br.com.payment.management.core.bead.model;

import br.com.payment.management.core.campaign.model.Campaign;
import br.com.payment.management.core.contribution.model.Contribution;
import br.com.payment.management.core.contributor.model.Contributor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Entity which represents the table with the definition of a certain bead.
 *
 * @author wcustodio
 */
@Entity
@Table(name = "BEAD")
public class Bead {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @NotNull(message = "bead.identification.number.empty.error")
    @Column(name = "IDENTIFICATION_NUMBER")
    private Long identificationNumber;

    @NotNull(message = "bead.contributor.empty.error")
    @ManyToOne
    @JoinColumn(name = "ID_CONTRIBUTOR")
    private Contributor contributor;

    @NotNull(message = "bead.campaign.empty.error")
    @ManyToOne
    @JoinColumn(name = "ID_CAMPAIGN")
    private Campaign campaign;

    @OneToMany
    @JoinTable(
            name = "BEAD_CONTRIBUTION",
            joinColumns = @JoinColumn(name = "ID_BEAD"),
            inverseJoinColumns = @JoinColumn(name = "ID_CONTRIBUTION")
    )
    private List<Contribution> contributions;

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

    public Contributor getContributor() {
        return contributor;
    }

    public void setContributor(Contributor contributor) {
        this.contributor = contributor;
    }

    public Campaign getCampaign() {
        return campaign;
    }

    public void setCampaign(Campaign campaign) {
        this.campaign = campaign;
    }

    public List<Contribution> getContributions() {
        return contributions;
    }

    public void setContributions(List<Contribution> contributions) {
        this.contributions = contributions;
    }
}