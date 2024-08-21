package dev.risav.valhalla.principal;

import dev.risav.valhalla.account.Account;
import dev.risav.valhalla.appointment.Appointment;
import dev.risav.valhalla.authenticator.Authenticator;
import dev.risav.valhalla.equipment.Equipment;
import dev.risav.valhalla.patient.Patient;
import dev.risav.valhalla.payment.Payment;
import dev.risav.valhalla.service.Service;
import dev.risav.valhalla.session.Session;
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
public class Principal {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue
    @UuidGenerator
    private UUID id;

    @Column(nullable = false, columnDefinition = "text")
    private String username;

    @Column(columnDefinition = "text")
    private String firstName;

    @Column(nullable = false, columnDefinition = "text")
    private String lastName;

    @Column(columnDefinition = "text")
    private String password;

    @Column
    private Integer phoneCode;

    @Column(columnDefinition = "text")
    private String phoneNumber;

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
    private String payerType;

    @Column(columnDefinition = "text")
    private String image;

    @Column(nullable = false)
    private OffsetDateTime createdAt;

    @Column(nullable = false)
    private OffsetDateTime updatedAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "created_by_id")
    private Principal createdBy;

    @OneToMany(mappedBy = "createdBy")
    private Set<Principal> createdByPrincipals;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "updated_by_id")
    private Principal updatedBy;

    @OneToMany(mappedBy = "updatedBy")
    private Set<Principal> updatedByPrincipals;

    @OneToMany(mappedBy = "user")
    private Set<Account> userAccounts;

    @OneToMany(mappedBy = "user")
    private Set<Session> userSessions;

    @OneToMany(mappedBy = "user")
    private Set<Authenticator> userAuthenticators;

    @OneToMany(mappedBy = "receiver")
    private Set<Payment> receiverPayments;

    @OneToMany(mappedBy = "createdBy")
    private Set<Payment> createdByPayments;

    @OneToMany(mappedBy = "updatedBy")
    private Set<Payment> updatedByPayments;

    @OneToMany(mappedBy = "createdBy")
    private Set<Appointment> createdByAppointments;

    @OneToMany(mappedBy = "updatedBy")
    private Set<Appointment> updatedByAppointments;

    @OneToMany(mappedBy = "createdBy")
    private Set<Patient> createdByPatients;

    @OneToMany(mappedBy = "updatedBy")
    private Set<Patient> updatedByPatients;

    @OneToMany(mappedBy = "createdBy")
    private Set<Equipment> createdByEquipments;

    @OneToMany(mappedBy = "updatedBy")
    private Set<Equipment> updatedByEquipments;

    @OneToMany(mappedBy = "createdBy")
    private Set<Service> createdByServices;

    @OneToMany(mappedBy = "updatedBy")
    private Set<Service> updatedByServices;

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

    public String getUsername() {
        return username;
    }

    public void setUsername(final String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(final String password) {
        this.password = password;
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

    public String getPayerType() {
        return payerType;
    }

    public void setPayerType(final String payerType) {
        this.payerType = payerType;
    }

    public String getImage() {
        return image;
    }

    public void setImage(final String image) {
        this.image = image;
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

    public Principal getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(final Principal createdBy) {
        this.createdBy = createdBy;
    }

    public Set<Principal> getCreatedByPrincipals() {
        return createdByPrincipals;
    }

    public void setCreatedByPrincipals(final Set<Principal> createdByPrincipals) {
        this.createdByPrincipals = createdByPrincipals;
    }

    public Principal getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(final Principal updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Set<Principal> getUpdatedByPrincipals() {
        return updatedByPrincipals;
    }

    public void setUpdatedByPrincipals(final Set<Principal> updatedByPrincipals) {
        this.updatedByPrincipals = updatedByPrincipals;
    }

    public Set<Account> getUserAccounts() {
        return userAccounts;
    }

    public void setUserAccounts(final Set<Account> userAccounts) {
        this.userAccounts = userAccounts;
    }

    public Set<Session> getUserSessions() {
        return userSessions;
    }

    public void setUserSessions(final Set<Session> userSessions) {
        this.userSessions = userSessions;
    }

    public Set<Authenticator> getUserAuthenticators() {
        return userAuthenticators;
    }

    public void setUserAuthenticators(final Set<Authenticator> userAuthenticators) {
        this.userAuthenticators = userAuthenticators;
    }

    public Set<Payment> getReceiverPayments() {
        return receiverPayments;
    }

    public void setReceiverPayments(final Set<Payment> receiverPayments) {
        this.receiverPayments = receiverPayments;
    }

    public Set<Payment> getCreatedByPayments() {
        return createdByPayments;
    }

    public void setCreatedByPayments(final Set<Payment> createdByPayments) {
        this.createdByPayments = createdByPayments;
    }

    public Set<Payment> getUpdatedByPayments() {
        return updatedByPayments;
    }

    public void setUpdatedByPayments(final Set<Payment> updatedByPayments) {
        this.updatedByPayments = updatedByPayments;
    }

    public Set<Appointment> getCreatedByAppointments() {
        return createdByAppointments;
    }

    public void setCreatedByAppointments(final Set<Appointment> createdByAppointments) {
        this.createdByAppointments = createdByAppointments;
    }

    public Set<Appointment> getUpdatedByAppointments() {
        return updatedByAppointments;
    }

    public void setUpdatedByAppointments(final Set<Appointment> updatedByAppointments) {
        this.updatedByAppointments = updatedByAppointments;
    }

    public Set<Patient> getCreatedByPatients() {
        return createdByPatients;
    }

    public void setCreatedByPatients(final Set<Patient> createdByPatients) {
        this.createdByPatients = createdByPatients;
    }

    public Set<Patient> getUpdatedByPatients() {
        return updatedByPatients;
    }

    public void setUpdatedByPatients(final Set<Patient> updatedByPatients) {
        this.updatedByPatients = updatedByPatients;
    }

    public Set<Equipment> getCreatedByEquipments() {
        return createdByEquipments;
    }

    public void setCreatedByEquipments(final Set<Equipment> createdByEquipments) {
        this.createdByEquipments = createdByEquipments;
    }

    public Set<Equipment> getUpdatedByEquipments() {
        return updatedByEquipments;
    }

    public void setUpdatedByEquipments(final Set<Equipment> updatedByEquipments) {
        this.updatedByEquipments = updatedByEquipments;
    }

    public Set<Service> getCreatedByServices() {
        return createdByServices;
    }

    public void setCreatedByServices(final Set<Service> createdByServices) {
        this.createdByServices = createdByServices;
    }

    public Set<Service> getUpdatedByServices() {
        return updatedByServices;
    }

    public void setUpdatedByServices(final Set<Service> updatedByServices) {
        this.updatedByServices = updatedByServices;
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
