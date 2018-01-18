package br.com.payment.management.core.bean;

import java.time.LocalDate;
import java.util.List;

/**
 * Transition Object which represents the table with the definition of a certain campaign used by a {@link ChurchTO}.
 *
 * @author wcustodio.
 */
public class CampaignTO {

    private Long id;

    private String name;

    private LocalDate creationDate;

    private LocalDate initialDate;

    private LocalDate finalDate;

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