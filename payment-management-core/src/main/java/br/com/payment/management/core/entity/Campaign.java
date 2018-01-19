package br.com.payment.management.core.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.List;

/**
 * Entity which represents the table with the definition of a certain campaign used by a {@link Church}.
 *
 * @author wcustodio
 */
@Entity
@Table(name = "CAMPAIGN")
public class Campaign implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "CREATION_DATE")
    private Date creationDate;

    @Column(name = "INITIAL_DATE")
    private Date initialDate;

    @Column(name = "FINAL_DATE")
    private Date finalDate;

    @ManyToOne
    @JoinColumn(name = "ID_CHURCH")
    private Church church;

    @ManyToOne
    @JoinColumn(name = "ID_PROVING_TYPE")
    private ProvingType provingType;

    @OneToMany(mappedBy = "campaign")
    private List<Contribution> contributions;

    @OneToMany(mappedBy = "campaign")
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

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getInitialDate() {
        return initialDate;
    }

    public void setInitialDate(Date initialDate) {
        this.initialDate = initialDate;
    }

    public Date getFinalDate() {
        return finalDate;
    }

    public void setFinalDate(Date finalDate) {
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