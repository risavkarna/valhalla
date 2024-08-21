package dev.risav.valhalla.order;

import dev.risav.valhalla.concept.Concept;
import dev.risav.valhalla.encounter.Encounter;
import dev.risav.valhalla.order_frequency.OrderFrequency;
import dev.risav.valhalla.order_route.OrderRoute;
import dev.risav.valhalla.order_type.OrderType;
import dev.risav.valhalla.order_unit.OrderUnit;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.OffsetDateTime;
import java.util.UUID;
import org.hibernate.annotations.UuidGenerator;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;


@Entity
@Table(name = "\"Order\"")
@EntityListeners(AuditingEntityListener.class)
public class Order {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue
    @UuidGenerator
    private UUID id;

    @Column(nullable = false, columnDefinition = "text")
    private String uuid;

    @Column(nullable = false)
    private OffsetDateTime orderDatetime;

    @Column(nullable = false, columnDefinition = "text")
    private String instructions;

    @Column(nullable = false, columnDefinition = "text")
    private String dosage;

    @Column(nullable = false, columnDefinition = "text")
    private String route;

    @Column(nullable = false, columnDefinition = "text")
    private String frequency;

    @Column(nullable = false)
    private Boolean asNeeded;

    @Column(nullable = false)
    private Boolean prn;

    @Column(nullable = false)
    private Integer quantity;

    @Column(nullable = false, columnDefinition = "text")
    private String units;

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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_frequency_id")
    private OrderFrequency orderFrequency;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_route_id")
    private OrderRoute orderRoute;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_type_id")
    private OrderType orderType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_unit_id")
    private OrderUnit orderUnit;

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

    public OffsetDateTime getOrderDatetime() {
        return orderDatetime;
    }

    public void setOrderDatetime(final OffsetDateTime orderDatetime) {
        this.orderDatetime = orderDatetime;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(final String instructions) {
        this.instructions = instructions;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(final String dosage) {
        this.dosage = dosage;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(final String route) {
        this.route = route;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(final String frequency) {
        this.frequency = frequency;
    }

    public Boolean getAsNeeded() {
        return asNeeded;
    }

    public void setAsNeeded(final Boolean asNeeded) {
        this.asNeeded = asNeeded;
    }

    public Boolean getPrn() {
        return prn;
    }

    public void setPrn(final Boolean prn) {
        this.prn = prn;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(final Integer quantity) {
        this.quantity = quantity;
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(final String units) {
        this.units = units;
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

    public OrderFrequency getOrderFrequency() {
        return orderFrequency;
    }

    public void setOrderFrequency(final OrderFrequency orderFrequency) {
        this.orderFrequency = orderFrequency;
    }

    public OrderRoute getOrderRoute() {
        return orderRoute;
    }

    public void setOrderRoute(final OrderRoute orderRoute) {
        this.orderRoute = orderRoute;
    }

    public OrderType getOrderType() {
        return orderType;
    }

    public void setOrderType(final OrderType orderType) {
        this.orderType = orderType;
    }

    public OrderUnit getOrderUnit() {
        return orderUnit;
    }

    public void setOrderUnit(final OrderUnit orderUnit) {
        this.orderUnit = orderUnit;
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
