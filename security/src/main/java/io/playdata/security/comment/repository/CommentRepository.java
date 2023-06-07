package io.playdata.security.comment.repository;

import io.playdata.security.comment.model.CommentDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<CommentDTO, Long> {
    List<CommentDTO> getCommentsByPostId(Long postId);
    void deleteCommentsByUsername(String username);
}
