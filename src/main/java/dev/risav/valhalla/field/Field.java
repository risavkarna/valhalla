package dev.risav.valhalla.field;

import dev.risav.valhalla.concept.Concept;
import dev.risav.valhalla.field_answer.FieldAnswer;
import dev.risav.valhalla.field_option.FieldOption;
import dev.risav.valhalla.form.Form;
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
public class Field {

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
    private String fieldType;

    @Column(nullable = false, columnDefinition = "text")
    private String creator;

    @Column(nullable = false)
    private OffsetDateTime dateCreated;

    @Column(nullable = false, columnDefinition = "text")
    private String lastChangedBy;

    @Column(nullable = false)
    private OffsetDateTime lastChangedDate;

    @OneToMany(mappedBy = "field")
    private Set<Form> fieldForms;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "concept_id", nullable = false)
    private Concept concept;

    @OneToMany(mappedBy = "field")
    private Set<FieldAnswer> fieldFieldAnswers;

    @OneToMany(mappedBy = "field")
    private Set<FieldOption> fieldFieldOptions;

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

    public String getFieldType() {
        return fieldType;
    }

    public void setFieldType(final String fieldType) {
        this.fieldType = fieldType;
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

    public Set<Form> getFieldForms() {
        return fieldForms;
    }

    public void setFieldForms(final Set<Form> fieldForms) {
        this.fieldForms = fieldForms;
    }

    public Concept getConcept() {
        return concept;
    }

    public void setConcept(final Concept concept) {
        this.concept = concept;
    }

    public Set<FieldAnswer> getFieldFieldAnswers() {
        return fieldFieldAnswers;
    }

    public void setFieldFieldAnswers(final Set<FieldAnswer> fieldFieldAnswers) {
        this.fieldFieldAnswers = fieldFieldAnswers;
    }

    public Set<FieldOption> getFieldFieldOptions() {
        return fieldFieldOptions;
    }

    public void setFieldFieldOptions(final Set<FieldOption> fieldFieldOptions) {
        this.fieldFieldOptions = fieldFieldOptions;
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
