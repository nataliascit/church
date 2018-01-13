package br.com.payment.management.core.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Entity which represents the table with the definition of a certain bead.
 *
 * @author wcustodio.
 */
@Entity
@Table(name = "BEAD")
public class Bead implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;

    @Column(name = "IDENTIFICATION_NUMBER")
    private Long identificationNumber;

    @ManyToOne
    @JoinColumn(name = "ID_CONTRIBUTOR")
    private Contributor contributor;

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

    public List<Contribution> getContributions() {
        return contributions;
    }

    public void setContributions(List<Contribution> contributions) {
        this.contributions = contributions;
    }
}
