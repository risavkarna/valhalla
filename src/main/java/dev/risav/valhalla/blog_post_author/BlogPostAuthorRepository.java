package dev.risav.valhalla.blog_post_author;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BlogPostAuthorRepository extends JpaRepository<BlogPostAuthor, UUID> {
}
