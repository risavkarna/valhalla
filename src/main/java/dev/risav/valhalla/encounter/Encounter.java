package dev.risav.valhalla.encounter;

import dev.risav.valhalla.encounter_type.EncounterType;
import dev.risav.valhalla.form.Form;
import dev.risav.valhalla.form_encounter.FormEncounter;
import dev.risav.valhalla.form_submission.FormSubmission;
import dev.risav.valhalla.location.Location;
import dev.risav.valhalla.obs.Obs;
import dev.risav.valhalla.order.Order;
import dev.risav.valhalla.patient.Patient;
import dev.risav.valhalla.provider.Provider;
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
public class Encounter {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue
    @UuidGenerator
    private UUID id;

    @Column(nullable = false, columnDefinition = "text")
    private String uuid;

    @Column(nullable = false)
    private OffsetDateTime startDatetime;

    @Column(nullable = false)
    private OffsetDateTime endDatetime;

    @Column(nullable = false)
    private Boolean voided;

    @Column(nullable = false, columnDefinition = "text")
    private String voidedBy;

    @Column(nullable = false)
    private OffsetDateTime dateVoided;

    @Column(nullable = false, columnDefinition = "text")
    private String voidReason;

    @Column(nullable = false, columnDefinition = "text")
    private String creator;

    @Column(nullable = false)
    private OffsetDateTime dateCreated;

    @Column(nullable = false, columnDefinition = "text")
    private String lastChangedBy;

    @Column(nullable = false)
    private OffsetDateTime lastChangedDate;

    @OneToMany(mappedBy = "encounter")
    private Set<FormEncounter> encounterFormEncounters;

    @OneToMany(mappedBy = "encounter")
    private Set<FormSubmission> encounterFormSubmissions;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "encounter_type_id", nullable = false)
    private EncounterType encounterType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "form_id", nullable = false)
    private Form form;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "location_id", nullable = false)
    private Location location;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "patient_id", nullable = false)
    private Patient patient;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "provider_id", nullable = false)
    private Provider provider;

    @OneToMany(mappedBy = "encounter")
    private Set<Obs> encounterObses;

    @OneToMany(mappedBy = "encounter")
    private Set<Order> encounterOrders;

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

    public OffsetDateTime getStartDatetime() {
        return startDatetime;
    }

    public void setStartDatetime(final OffsetDateTime startDatetime) {
        this.startDatetime = startDatetime;
    }

    public OffsetDateTime getEndDatetime() {
        return endDatetime;
    }

    public void setEndDatetime(final OffsetDateTime endDatetime) {
        this.endDatetime = endDatetime;
    }

    public Boolean getVoided() {
        return voided;
    }

    public void setVoided(final Boolean voided) {
        this.voided = voided;
    }

    public String getVoidedBy() {
        return voidedBy;
    }

    public void setVoidedBy(final String voidedBy) {
        this.voidedBy = voidedBy;
    }

    public OffsetDateTime getDateVoided() {
        return dateVoided;
    }

    public void setDateVoided(final OffsetDateTime dateVoided) {
        this.dateVoided = dateVoided;
    }

    public String getVoidReason() {
        return voidReason;
    }

    public void setVoidReason(final String voidReason) {
        this.voidReason = voidReason;
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

    public Set<FormEncounter> getEncounterFormEncounters() {
        return encounterFormEncounters;
    }

    public void setEncounterFormEncounters(final Set<FormEncounter> encounterFormEncounters) {
        this.encounterFormEncounters = encounterFormEncounters;
    }

    public Set<FormSubmission> getEncounterFormSubmissions() {
        return encounterFormSubmissions;
    }

    public void setEncounterFormSubmissions(final Set<FormSubmission> encounterFormSubmissions) {
        this.encounterFormSubmissions = encounterFormSubmissions;
    }

    public EncounterType getEncounterType() {
        return encounterType;
    }

    public void setEncounterType(final EncounterType encounterType) {
        this.encounterType = encounterType;
    }

    public Form getForm() {
        return form;
    }

    public void setForm(final Form form) {
        this.form = form;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(final Location location) {
        this.location = location;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(final Patient patient) {
        this.patient = patient;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(final Provider provider) {
        this.provider = provider;
    }

    public Set<Obs> getEncounterObses() {
        return encounterObses;
    }

    public void setEncounterObses(final Set<Obs> encounterObses) {
        this.encounterObses = encounterObses;
    }

    public Set<Order> getEncounterOrders() {
        return encounterOrders;
    }

    public void setEncounterOrders(final Set<Order> encounterOrders) {
        this.encounterOrders = encounterOrders;
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
