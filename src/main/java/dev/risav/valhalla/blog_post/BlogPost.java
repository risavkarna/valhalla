package dev.risav.valhalla.blog_post;

import dev.risav.valhalla.blog_post_author.BlogPostAuthor;
import dev.risav.valhalla.blog_post_tag_arrow.BlogPostTagArrow;
import dev.risav.valhalla.space_time_coordinates.SpaceTimeCoordinates;
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
public class BlogPost {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue
    @UuidGenerator
    private UUID id;

    @Column(nullable = false, columnDefinition = "text")
    private String title;

    @Column(nullable = false, columnDefinition = "text")
    private String content;

    @Column(nullable = false, columnDefinition = "text")
    private String context;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "author_id", nullable = false)
    private BlogPostAuthor author;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "space_time_coordinates_id", nullable = false)
    private SpaceTimeCoordinates spaceTimeCoordinates;

    @OneToMany(mappedBy = "post")
    private Set<BlogPostTagArrow> postBlogPostTagArrows;

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

    public String getTitle() {
        return title;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(final String content) {
        this.content = content;
    }

    public String getContext() {
        return context;
    }

    public void setContext(final String context) {
        this.context = context;
    }

    public BlogPostAuthor getAuthor() {
        return author;
    }

    public void setAuthor(final BlogPostAuthor author) {
        this.author = author;
    }

    public SpaceTimeCoordinates getSpaceTimeCoordinates() {
        return spaceTimeCoordinates;
    }

    public void setSpaceTimeCoordinates(final SpaceTimeCoordinates spaceTimeCoordinates) {
        this.spaceTimeCoordinates = spaceTimeCoordinates;
    }

    public Set<BlogPostTagArrow> getPostBlogPostTagArrows() {
        return postBlogPostTagArrows;
    }

    public void setPostBlogPostTagArrows(final Set<BlogPostTagArrow> postBlogPostTagArrows) {
        this.postBlogPostTagArrows = postBlogPostTagArrows;
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
