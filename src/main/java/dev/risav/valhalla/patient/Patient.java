package dev.risav.valhalla.patient;

import dev.risav.valhalla.appointment.Appointment;
import dev.risav.valhalla.encounter.Encounter;
import dev.risav.valhalla.payment.Payment;
import dev.risav.valhalla.principal.Principal;
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
public class Patient {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue
    @UuidGenerator
    private UUID id;

    @Column(nullable = false)
    private UUID uuid;

    @Column(nullable = false, columnDefinition = "text")
    private String givenName;

    @Column(nullable = false, columnDefinition = "text")
    private String middleName;

    @Column(nullable = false, columnDefinition = "text")
    private String familyName;

    @Column(nullable = false)
    private String gender;

    @Column
    private OffsetDateTime birthdate;

    @Column
    private Integer phoneCode;

    @Column(columnDefinition = "text")
    private String phoneNumber;

    @Column(columnDefinition = "text")
    private String image;

    @Column(columnDefinition = "text")
    private String streetName;

    @Column(columnDefinition = "text")
    private String city;

    @Column(columnDefinition = "text")
    private String areaCode;

    @Column(nullable = false)
    private String country;

    @Column(columnDefinition = "text")
    private String email;

    @Column
    private OffsetDateTime emailVerified;

    @Column(nullable = false)
    private OffsetDateTime createdAt;

    @Column(nullable = false)
    private OffsetDateTime updatedAt;

    @OneToMany(mappedBy = "payer")
    private Set<Payment> payerPayments;

    @OneToMany(mappedBy = "patient")
    private Set<Appointment> patientAppointments;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "created_by_id")
    private Principal createdBy;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "updated_by_id")
    private Principal updatedBy;

    @OneToMany(mappedBy = "patient")
    private Set<Encounter> patientEncounters;

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

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(final UUID uuid) {
        this.uuid = uuid;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(final String givenName) {
        this.givenName = givenName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(final String middleName) {
        this.middleName = middleName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(final String familyName) {
        this.familyName = familyName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(final String gender) {
        this.gender = gender;
    }

    public OffsetDateTime getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(final OffsetDateTime birthdate) {
        this.birthdate = birthdate;
    }

    public Integer getPhoneCode() {
        return phoneCode;
    }

    public void setPhoneCode(final Integer phoneCode) {
        this.phoneCode = phoneCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(final String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getImage() {
        return image;
    }

    public void setImage(final String image) {
        this.image = image;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(final String streetName) {
        this.streetName = streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(final String city) {
        this.city = city;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(final String areaCode) {
        this.areaCode = areaCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(final String country) {
        this.country = country;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public OffsetDateTime getEmailVerified() {
        return emailVerified;
    }

    public void setEmailVerified(final OffsetDateTime emailVerified) {
        this.emailVerified = emailVerified;
    }

    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(final OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(final OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Set<Payment> getPayerPayments() {
        return payerPayments;
    }

    public void setPayerPayments(final Set<Payment> payerPayments) {
        this.payerPayments = payerPayments;
    }

    public Set<Appointment> getPatientAppointments() {
        return patientAppointments;
    }

    public void setPatientAppointments(final Set<Appointment> patientAppointments) {
        this.patientAppointments = patientAppointments;
    }

    public Principal getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(final Principal createdBy) {
        this.createdBy = createdBy;
    }

    public Principal getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(final Principal updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Set<Encounter> getPatientEncounters() {
        return patientEncounters;
    }

    public void setPatientEncounters(final Set<Encounter> patientEncounters) {
        this.patientEncounters = patientEncounters;
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
