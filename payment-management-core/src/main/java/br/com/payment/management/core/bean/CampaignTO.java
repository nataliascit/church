package br.com.payment.management.core.bean;

import java.util.Date;
import java.util.List;

/**
 * Transition Object which represents the table with the definition of a certain campaign used by a {@link ChurchTO}.
 *
 * @author wcustodio.
 */
public class CampaignTO {

    private Long id;

    private String name;

    private Date creationDate;

    private Date initialDate;

    private Date finalDate;

    private ChurchTO church;

    private ProvingTypeTO provingType;

    private List<ContributionTO> contributions;

    private List<BeadTO> beads;

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

    public ChurchTO getChurch() {
        return church;
    }

    public void setChurch(ChurchTO church) {
        this.church = church;
    }

    public ProvingTypeTO getProvingType() {
        return provingType;
    }

    public void setProvingType(ProvingTypeTO provingType) {
        this.provingType = provingType;
    }

    public List<ContributionTO> getContributions() {
        return contributions;
    }

    public void setContributions(List<ContributionTO> contributions) {
        this.contributions = contributions;
    }

    public List<BeadTO> getBeads() {
        return beads;
    }

    public void setBeads(List<BeadTO> beads) {
        this.beads = beads;
    }
}