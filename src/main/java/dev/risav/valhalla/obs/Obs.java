package dev.risav.valhalla.obs;

import dev.risav.valhalla.concept.Concept;
import dev.risav.valhalla.encounter.Encounter;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.time.OffsetDateTime;
import java.util.UUID;
import org.hibernate.annotations.UuidGenerator;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;


@Entity
@EntityListeners(AuditingEntityListener.class)
public class Obs {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue
    @UuidGenerator
    private UUID id;

    @Column(nullable = false, columnDefinition = "text")
    private String uuid;

    @Column(nullable = false)
    private OffsetDateTime obsDatetime;

    @Column(nullable = false)
    private OffsetDateTime valueDatetime;

    @Column(nullable = false)
    private Double valueNumeric;

    @Column(nullable = false, columnDefinition = "text")
    private String valueText;

    @Column(nullable = false, columnDefinition = "text")
    private String creator;

    @Column(nullable = false)
    private OffsetDateTime dateCreated;

    @Column(nullable = false, columnDefinition = "text")
    private String lastChangedBy;

    @Column(nullable = false)
    private OffsetDateTime lastChangedDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "concept_id", nullable = false)
    private Concept concept;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "encounter_id", nullable = false)
    private Encounter encounter;

    @CreatedDate
    @Column(nullable = false, updatable = false)
    private OffsetDateTime dateCreated;

    @LastModifiedDate
    @Column(nullable = false)
    private OffsetDateTime lastUpdated;

    public UUID getId() {
        return id;
    }

    public void setId(final UUID id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(final String uuid) {
        this.uuid = uuid;
    }

    public OffsetDateTime getObsDatetime() {
        return obsDatetime;
    }

    public void setObsDatetime(final OffsetDateTime obsDatetime) {
        this.obsDatetime = obsDatetime;
    }

    public OffsetDateTime getValueDatetime() {
        return valueDatetime;
    }

    public void setValueDatetime(final OffsetDateTime valueDatetime) {
        this.valueDatetime = valueDatetime;
    }

    public Double getValueNumeric() {
        return valueNumeric;
    }

    public void setValueNumeric(final Double valueNumeric) {
        this.valueNumeric = valueNumeric;
    }

    public String getValueText() {
        return valueText;
    }

    public void setValueText(final String valueText) {
        this.valueText = valueText;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(final String creator) {
        this.creator = creator;
    }

    public OffsetDateTime getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(final OffsetDateTime dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getLastChangedBy() {
        return lastChangedBy;
    }

    public void setLastChangedBy(final String lastChangedBy) {
        this.lastChangedBy = lastChangedBy;
    }

    public OffsetDateTime getLastChangedDate() {
        return lastChangedDate;
    }

    public void setLastChangedDate(final OffsetDateTime lastChangedDate) {
        this.lastChangedDate = lastChangedDate;
    }

    public Concept getConcept() {
        return concept;
    }

    public void setConcept(final Concept concept) {
        this.concept = concept;
    }

    public Encounter getEncounter() {
        return encounter;
    }

    public void setEncounter(final Encounter encounter) {
        this.encounter = encounter;
    }

    public OffsetDateTime getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(final OffsetDateTime dateCreated) {
        this.dateCreated = dateCreated;
    }

    public OffsetDateTime getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(final OffsetDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

}
