package dev.risav.valhalla.form;

import dev.risav.valhalla.encounter.Encounter;
import dev.risav.valhalla.field.Field;
import dev.risav.valhalla.form_encounter.FormEncounter;
import dev.risav.valhalla.form_resource.FormResource;
import dev.risav.valhalla.form_submission.FormSubmission;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import java.time.OffsetDateTime;
import java.util.Set;
import java.util.UUID;
import org.hibernate.annotations.UuidGenerator;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;


@Entity
@EntityListeners(AuditingEntityListener.class)
public class Form {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue
    @UuidGenerator
    private UUID id;

    @Column(nullable = false, columnDefinition = "text")
    private String uuid;

    @Column(nullable = false, columnDefinition = "text")
    private String name;

    @Column(nullable = false, columnDefinition = "text")
    private String description;

    @Column(nullable = false, columnDefinition = "text")
    private String version;

    @Column(nullable = false)
    private Boolean retired;

    @Column(nullable = false, columnDefinition = "text")
    private String retiredBy;

    @Column(nullable = false)
    private OffsetDateTime dateRetired;

    @Column(nullable = false, columnDefinition = "text")
    private String retiredReason;

    @Column(nullable = false, columnDefinition = "text")
    private String creator;

    @Column(nullable = false)
    private OffsetDateTime dateCreated;

    @Column(nullable = false, columnDefinition = "text")
    private String lastChangedBy;

    @Column(nullable = false)
    private OffsetDateTime lastChangedDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "field_id")
    private Field field;

    @OneToMany(mappedBy = "form")
    private Set<FormEncounter> formFormEncounters;

    @OneToMany(mappedBy = "form")
    private Set<FormResource> formFormResources;

    @OneToMany(mappedBy = "form")
    private Set<FormSubmission> formFormSubmissions;

    @OneToMany(mappedBy = "form")
    private Set<Encounter> formEncounters;

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

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(final String version) {
        this.version = version;
    }

    public Boolean getRetired() {
        return retired;
    }

    public void setRetired(final Boolean retired) {
        this.retired = retired;
    }

    public String getRetiredBy() {
        return retiredBy;
    }

    public void setRetiredBy(final String retiredBy) {
        this.retiredBy = retiredBy;
    }

    public OffsetDateTime getDateRetired() {
        return dateRetired;
    }

    public void setDateRetired(final OffsetDateTime dateRetired) {
        this.dateRetired = dateRetired;
    }

    public String getRetiredReason() {
        return retiredReason;
    }

    public void setRetiredReason(final String retiredReason) {
        this.retiredReason = retiredReason;
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

    public Field getField() {
        return field;
    }

    public void setField(final Field field) {
        this.field = field;
    }

    public Set<FormEncounter> getFormFormEncounters() {
        return formFormEncounters;
    }

    public void setFormFormEncounters(final Set<FormEncounter> formFormEncounters) {
        this.formFormEncounters = formFormEncounters;
    }

    public Set<FormResource> getFormFormResources() {
        return formFormResources;
    }

    public void setFormFormResources(final Set<FormResource> formFormResources) {
        this.formFormResources = formFormResources;
    }

    public Set<FormSubmission> getFormFormSubmissions() {
        return formFormSubmissions;
    }

    public void setFormFormSubmissions(final Set<FormSubmission> formFormSubmissions) {
        this.formFormSubmissions = formFormSubmissions;
    }

    public Set<Encounter> getFormEncounters() {
        return formEncounters;
    }

    public void setFormEncounters(final Set<Encounter> formEncounters) {
        this.formEncounters = formEncounters;
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
