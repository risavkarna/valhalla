package dev.risav.valhalla.space_time_coordinates;

import dev.risav.valhalla.blog_post.BlogPost;
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
public class SpaceTimeCoordinates {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue
    @UuidGenerator
    private UUID id;

    @Column(nullable = false)
    private Double latitude;

    @Column(nullable = false)
    private Double longitude;

    @Column(nullable = false)
    private Double startTime;

    @Column
    private Double pauseTime;

    @Column(nullable = false)
    private Double stopTime;

    @Column(nullable = false, columnDefinition = "text")
    private String timezone;

    @Column(nullable = false)
    private UUID blogPostId;

    @OneToMany(mappedBy = "spaceTimeCoordinates")
    private Set<BlogPost> spaceTimeCoordinatesBlogPosts;

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

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(final Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(final Double longitude) {
        this.longitude = longitude;
    }

    public Double getStartTime() {
        return startTime;
    }

    public void setStartTime(final Double startTime) {
        this.startTime = startTime;
    }

    public Double getPauseTime() {
        return pauseTime;
    }

    public void setPauseTime(final Double pauseTime) {
        this.pauseTime = pauseTime;
    }

    public Double getStopTime() {
        return stopTime;
    }

    public void setStopTime(final Double stopTime) {
        this.stopTime = stopTime;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(final String timezone) {
        this.timezone = timezone;
    }

    public UUID getBlogPostId() {
        return blogPostId;
    }

    public void setBlogPostId(final UUID blogPostId) {
        this.blogPostId = blogPostId;
    }

    public Set<BlogPost> getSpaceTimeCoordinatesBlogPosts() {
        return spaceTimeCoordinatesBlogPosts;
    }

    public void setSpaceTimeCoordinatesBlogPosts(
            final Set<BlogPost> spaceTimeCoordinatesBlogPosts) {
        this.spaceTimeCoordinatesBlogPosts = spaceTimeCoordinatesBlogPosts;
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
