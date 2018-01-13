package br.com.payment.management.core.bean;

import java.util.List;

/**
 * Transition Object which represents the table with the definition of a certain proving type used by a {@link ContributorTO} when doing their {@link ContributionTO}.
 *
 * @author wcustodio.
 */
public class ProvingTypeTO {

    private Long id;

    private String name;

    private String mnemonic;

    private List<CampaignTO> campaigns;

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

    public List<CampaignTO> getCampaigns() {
        return campaigns;
    }

    public void setCampaigns(List<CampaignTO> campaigns) {
        this.campaigns = campaigns;
    }
}
