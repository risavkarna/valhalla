package dev.risav.valhalla.blog_post_tag;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BlogPostTagRepository extends JpaRepository<BlogPostTag, UUID> {
}
