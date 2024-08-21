package dev.risav.valhalla.payment;

import dev.risav.valhalla.patient.Patient;
import dev.risav.valhalla.principal.Principal;
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
public class Payment {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue
    @UuidGenerator
    private UUID id;

    @Column(nullable = false)
    private String paymentMethod;

    @Column(nullable = false)
    private Integer totalPayableAmount;

    @Column(nullable = false)
    private Integer discountApplied;

    @Column(nullable = false)
    private Integer paidAmount;

    @Column(nullable = false, columnDefinition = "text")
    private String reasonForVisit;

    @Column(nullable = false)
    private OffsetDateTime createdAt;

    @Column(nullable = false)
    private OffsetDateTime updatedAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "payer_id", nullable = false)
    private Patient payer;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "receiver_id", nullable = false)
    private Principal receiver;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "created_by_id")
    private Principal createdBy;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "updated_by_id")
    private Principal updatedBy;

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

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(final String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Integer getTotalPayableAmount() {
        return totalPayableAmount;
    }

    public void setTotalPayableAmount(final Integer totalPayableAmount) {
        this.totalPayableAmount = totalPayableAmount;
    }

    public Integer getDiscountApplied() {
        return discountApplied;
    }

    public void setDiscountApplied(final Integer discountApplied) {
        this.discountApplied = discountApplied;
    }

    public Integer getPaidAmount() {
        return paidAmount;
    }

    public void setPaidAmount(final Integer paidAmount) {
        this.paidAmount = paidAmount;
    }

    public String getReasonForVisit() {
        return reasonForVisit;
    }

    public void setReasonForVisit(final String reasonForVisit) {
        this.reasonForVisit = reasonForVisit;
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

    public Patient getPayer() {
        return payer;
    }

    public void setPayer(final Patient payer) {
        this.payer = payer;
    }

    public Principal getReceiver() {
        return receiver;
    }

    public void setReceiver(final Principal receiver) {
        this.receiver = receiver;
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
