package dev.risav.valhalla.blog_post;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BlogPostRepository extends JpaRepository<BlogPost, UUID> {
}
