package br.com.payment.management.core.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Entity which represents the table with the definition of the main entity owner of all {@link Contribution}.
 *
 * @author wcustodio
 */
@Entity
@Table(name = "CHURCH")
public class Church implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @OneToMany
    @JoinColumn(name="ID_CHURCH", referencedColumnName = "ID")
    private List<Campaign> campaigns;

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

    public List<Campaign> getCampaigns() {
        return campaigns;
    }

    public void setCampaigns(List<Campaign> campaigns) {
        this.campaigns = campaigns;
    }
}