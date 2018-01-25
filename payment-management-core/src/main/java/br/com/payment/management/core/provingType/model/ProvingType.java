package br.com.payment.management.core.provingType.model;

import br.com.payment.management.core.campaign.model.Campaign;
import br.com.payment.management.core.contribution.model.Contribution;
import br.com.payment.management.core.contributor.model.Contributor;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.util.List;

/**
 * Entity which represents the table with the definition of a certain proving type used by a {@link Contributor} when doing their {@link Contribution}.
 *
 * @author wcustodio
 */
@Entity
@Table(name = "PROVING_TYPE")
public class ProvingType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @NotEmpty(message = "proving.type.name.empty.error")
    @Column(name = "NAME")
    private String name;

    @NotEmpty(message = "proving.type.mnemonic.empty.error")
    @Column(name = "MNEMONIC")
    private String mnemonic;

    @OneToMany
    @JoinColumn(name="ID_PROVING_TYPE", referencedColumnName = "ID")
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
