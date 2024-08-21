package dev.risav.valhalla.concept;

import dev.risav.valhalla.concept_answer.ConceptAnswer;
import dev.risav.valhalla.concept_class.ConceptClass;
import dev.risav.valhalla.concept_data_type.ConceptDataType;
import dev.risav.valhalla.concept_map.ConceptMap;
import dev.risav.valhalla.concept_name.ConceptName;
import dev.risav.valhalla.concept_numeric.ConceptNumeric;
import dev.risav.valhalla.concept_proposal.ConceptProposal;
import dev.risav.valhalla.concept_set.ConceptSet;
import dev.risav.valhalla.concept_source.ConceptSource;
import dev.risav.valhalla.concept_word.ConceptWord;
import dev.risav.valhalla.field.Field;
import dev.risav.valhalla.obs.Obs;
import dev.risav.valhalla.order.Order;
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
public class Concept {

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
    private String dataType;

    @Column(nullable = false, columnDefinition = "text")
    private String classs;

    @Column(nullable = false)
    private Boolean isRetired;

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

    @OneToMany(mappedBy = "concept")
    private Set<Field> conceptFields;

    @OneToMany(mappedBy = "concept")
    private Set<Obs> conceptObses;

    @OneToMany(mappedBy = "concept")
    private Set<Order> conceptOrders;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "concept_class_id")
    private ConceptClass conceptClass;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "concept_datatype_id")
    private ConceptDataType conceptDatatype;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "concept_map_id")
    private ConceptMap conceptMap;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "concept_set_id")
    private ConceptSet conceptSet;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "concept_source_id")
    private ConceptSource conceptSource;

    @OneToMany(mappedBy = "answerConcept")
    private Set<ConceptAnswer> answerConceptConceptAnswers;

    @OneToMany(mappedBy = "concept")
    private Set<ConceptAnswer> conceptConceptAnswers;

    @OneToMany(mappedBy = "concept")
    private Set<ConceptName> conceptConceptNames;

    @OneToMany(mappedBy = "concept")
    private Set<ConceptNumeric> conceptConceptNumerics;

    @OneToMany(mappedBy = "concept")
    private Set<ConceptProposal> conceptConceptProposals;

    @OneToMany(mappedBy = "concept")
    private Set<ConceptWord> conceptConceptWords;

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

    public String getDataType() {
        return dataType;
    }

    public void setDataType(final String dataType) {
        this.dataType = dataType;
    }

    public String getClasss() {
        return classs;
    }

    public void setClasss(final String classs) {
        this.classs = classs;
    }

    public Boolean getIsRetired() {
        return isRetired;
    }

    public void setIsRetired(final Boolean isRetired) {
        this.isRetired = isRetired;
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

    public Set<Field> getConceptFields() {
        return conceptFields;
    }

    public void setConceptFields(final Set<Field> conceptFields) {
        this.conceptFields = conceptFields;
    }

    public Set<Obs> getConceptObses() {
        return conceptObses;
    }

    public void setConceptObses(final Set<Obs> conceptObses) {
        this.conceptObses = conceptObses;
    }

    public Set<Order> getConceptOrders() {
        return conceptOrders;
    }

    public void setConceptOrders(final Set<Order> conceptOrders) {
        this.conceptOrders = conceptOrders;
    }

    public ConceptClass getConceptClass() {
        return conceptClass;
    }

    public void setConceptClass(final ConceptClass conceptClass) {
        this.conceptClass = conceptClass;
    }

    public ConceptDataType getConceptDatatype() {
        return conceptDatatype;
    }

    public void setConceptDatatype(final ConceptDataType conceptDatatype) {
        this.conceptDatatype = conceptDatatype;
    }

    public ConceptMap getConceptMap() {
        return conceptMap;
    }

    public void setConceptMap(final ConceptMap conceptMap) {
        this.conceptMap = conceptMap;
    }

    public ConceptSet getConceptSet() {
        return conceptSet;
    }

    public void setConceptSet(final ConceptSet conceptSet) {
        this.conceptSet = conceptSet;
    }

    public ConceptSource getConceptSource() {
        return conceptSource;
    }

    public void setConceptSource(final ConceptSource conceptSource) {
        this.conceptSource = conceptSource;
    }

    public Set<ConceptAnswer> getAnswerConceptConceptAnswers() {
        return answerConceptConceptAnswers;
    }

    public void setAnswerConceptConceptAnswers(
            final Set<ConceptAnswer> answerConceptConceptAnswers) {
        this.answerConceptConceptAnswers = answerConceptConceptAnswers;
    }

    public Set<ConceptAnswer> getConceptConceptAnswers() {
        return conceptConceptAnswers;
    }

    public void setConceptConceptAnswers(final Set<ConceptAnswer> conceptConceptAnswers) {
        this.conceptConceptAnswers = conceptConceptAnswers;
    }

    public Set<ConceptName> getConceptConceptNames() {
        return conceptConceptNames;
    }

    public void setConceptConceptNames(final Set<ConceptName> conceptConceptNames) {
        this.conceptConceptNames = conceptConceptNames;
    }

    public Set<ConceptNumeric> getConceptConceptNumerics() {
        return conceptConceptNumerics;
    }

    public void setConceptConceptNumerics(final Set<ConceptNumeric> conceptConceptNumerics) {
        this.conceptConceptNumerics = conceptConceptNumerics;
    }

    public Set<ConceptProposal> getConceptConceptProposals() {
        return conceptConceptProposals;
    }

    public void setConceptConceptProposals(final Set<ConceptProposal> conceptConceptProposals) {
        this.conceptConceptProposals = conceptConceptProposals;
    }

    public Set<ConceptWord> getConceptConceptWords() {
        return conceptConceptWords;
    }

    public void setConceptConceptWords(final Set<ConceptWord> conceptConceptWords) {
        this.conceptConceptWords = conceptConceptWords;
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
