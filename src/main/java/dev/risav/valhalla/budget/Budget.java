package dev.risav.valhalla.budget;

import dev.risav.valhalla.budget_bud_user.BudgetBudUser;
import dev.risav.valhalla.budget_entry.BudgetEntry;
import dev.risav.valhalla.report.Report;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
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
public class Budget {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue
    @UuidGenerator
    private UUID id;

    @Column(nullable = false)
    private OffsetDateTime createdAt;

    @Column(nullable = false)
    private OffsetDateTime updatedAt;

    @Column(nullable = false)
    private Integer fiscalYear;

    @Column
    private UUID reportId;

    @OneToMany(mappedBy = "budget")
    private Set<BudgetEntry> budgetBudgetEntries;

    @OneToMany(mappedBy = "budget")
    private Set<Report> budgetReports;

    @OneToMany(mappedBy = "budget")
    private Set<BudgetBudUser> budgetBudgetBudUsers;

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

    public Integer getFiscalYear() {
        return fiscalYear;
    }

    public void setFiscalYear(final Integer fiscalYear) {
        this.fiscalYear = fiscalYear;
    }

    public UUID getReportId() {
        return reportId;
    }

    public void setReportId(final UUID reportId) {
        this.reportId = reportId;
    }

    public Set<BudgetEntry> getBudgetBudgetEntries() {
        return budgetBudgetEntries;
    }

    public void setBudgetBudgetEntries(final Set<BudgetEntry> budgetBudgetEntries) {
        this.budgetBudgetEntries = budgetBudgetEntries;
    }

    public Set<Report> getBudgetReports() {
        return budgetReports;
    }

    public void setBudgetReports(final Set<Report> budgetReports) {
        this.budgetReports = budgetReports;
    }

    public Set<BudgetBudUser> getBudgetBudgetBudUsers() {
        return budgetBudgetBudUsers;
    }

    public void setBudgetBudgetBudUsers(final Set<BudgetBudUser> budgetBudgetBudUsers) {
        this.budgetBudgetBudUsers = budgetBudgetBudUsers;
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
