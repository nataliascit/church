package br.com.payment.management.core.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Entity which represents the table with the definition of a certain proving type used by a {@link Contributor} when doing their {@link Contribution}.
 *
 * @author wcustodio
 */
@Entity
@Table(name = "PROVING_TYPE")
public class ProvingType implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "MNEMONIC")
    private String mnemonic;

    @OneToMany(mappedBy = "provingType")
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

    public String getMnemonic() {
        return mnemonic;
    }

    public void setMnemonic(String mnemonic) {
        this.mnemonic = mnemonic;
    }

    public List<Campaign> getCampaigns() {
        return campaigns;
    }

    public void setCampaigns(List<Campaign> campaigns) {
        this.campaigns = campaigns;
    }
}
