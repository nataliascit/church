package br.com.payment.management.core.campaign.model;

import br.com.payment.management.core.bead.model.Bead;
import br.com.payment.management.core.church.model.Church;
import br.com.payment.management.core.contribution.model.Contribution;
import br.com.payment.management.core.provingType.model.ProvingType;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;

/**
 * Entity which represents the table with the definition of a certain campaign used by a {@link Church}.
 *
 * @author William Custodio
 */
@Entity
@Table(name = "CAMPAIGN",
        uniqueConstraints = @UniqueConstraint(name = "UK_CAMPAIGN_NAME", columnNames = "NAME")
)
public class Campaign {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @NotEmpty(message = "application.campaign.messages.name.empty")
    @Column(name = "NAME")
    private String name;

    @NotNull(message = "application.campaign.messages.creationDate.empty")
    @Column(name = "CREATION_DATE")
    private LocalDate creationDate;

    @Column(name = "INITIAL_DATE")
    private LocalDate initialDate;

    @Column(name = "FINAL_DATE")
    private LocalDate finalDate;

    @NotNull(message = "application.campaign.messages.church.empty")
    @ManyToOne
    @JoinColumn(name = "ID_CHURCH")
    private Church church;

    @NotNull(message = "application.campaign.messages.provingType.empty")
    @ManyToOne
    @JoinColumn(name = "ID_PROVING_TYPE")
    private ProvingType provingType;

    @OneToMany
    @JoinColumn(name="ID_CAMPAIGN", referencedColumnName = "ID")
    private List<Contribution> contributions;

    @OneToMany
    @JoinColumn(name="ID_CAMPAIGN", referencedColumnName = "ID")
    private List<Bead> beads;

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

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public LocalDate getInitialDate() {
        return initialDate;
    }

    public void setInitialDate(LocalDate initialDate) {
        this.initialDate = initialDate;
    }

    public LocalDate getFinalDate() {
        return finalDate;
    }

    public void setFinalDate(LocalDate finalDate) {
        this.finalDate = finalDate;
    }

    public Church getChurch() {
        return church;
    }

    public void setChurch(Church church) {
        this.church = church;
    }

    public ProvingType getProvingType() {
        return provingType;
    }

    public void setProvingType(ProvingType provingType) {
        this.provingType = provingType;
    }

    public List<Contribution> getContributions() {
        return contributions;
    }

    public void setContributions(List<Contribution> contributions) {
        this.contributions = contributions;
    }

    public List<Bead> getBeads() {
        return beads;
    }

    public void setBeads(List<Bead> beads) {
        this.beads = beads;
    }
}