package dev.risav.valhalla.authenticator;

import dev.risav.valhalla.principal.Principal;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import java.time.OffsetDateTime;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;


@Entity
@EntityListeners(AuditingEntityListener.class)
public class Authenticator {

    @Id
    @Column(nullable = false, updatable = false)
    @SequenceGenerator(
            name = "primary_sequence",
            sequenceName = "primary_sequence",
            allocationSize = 1,
            initialValue = 10000
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "primary_sequence"
    )
    private Long id;

    @Column(nullable = false, columnDefinition = "text")
    private String credentialId;

    @Column(nullable = false, columnDefinition = "text")
    private String providerAccountId;

    @Column(nullable = false, columnDefinition = "text")
    private String credentialPublicKey;

    @Column(nullable = false)
    private Integer counter;

    @Column(nullable = false, columnDefinition = "text")
    private String credentialDeviceType;

    @Column(nullable = false)
    private Boolean credentialBackedUp;

    @Column(columnDefinition = "text")
    private String transports;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private Principal user;

    @CreatedDate
    @Column(nullable = false, updatable = false)
    private OffsetDateTime dateCreated;

    @LastModifiedDate
    @Column(nullable = false)
    private OffsetDateTime lastUpdated;

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getCredentialId() {
        return credentialId;
    }

    public void setCredentialId(final String credentialId) {
        this.credentialId = credentialId;
    }

    public String getProviderAccountId() {
        return providerAccountId;
    }

    public void setProviderAccountId(final String providerAccountId) {
        this.providerAccountId = providerAccountId;
    }

    public String getCredentialPublicKey() {
        return credentialPublicKey;
    }

    public void setCredentialPublicKey(final String credentialPublicKey) {
        this.credentialPublicKey = credentialPublicKey;
    }

    public Integer getCounter() {
        return counter;
    }

    public void setCounter(final Integer counter) {
        this.counter = counter;
    }

    public String getCredentialDeviceType() {
        return credentialDeviceType;
    }

    public void setCredentialDeviceType(final String credentialDeviceType) {
        this.credentialDeviceType = credentialDeviceType;
    }

    public Boolean getCredentialBackedUp() {
        return credentialBackedUp;
    }

    public void setCredentialBackedUp(final Boolean credentialBackedUp) {
        this.credentialBackedUp = credentialBackedUp;
    }

    public String getTransports() {
        return transports;
    }

    public void setTransports(final String transports) {
        this.transports = transports;
    }

    public Principal getUser() {
        return user;
    }

    public void setUser(final Principal user) {
        this.user = user;
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
