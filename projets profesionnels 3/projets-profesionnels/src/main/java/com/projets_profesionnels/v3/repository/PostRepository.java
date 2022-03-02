package com.projets_profesionnels.v3.repository;

import com.projets_profesionnels.v3.model.Post;
import com.projets_profesionnels.v3.model.Sub;
import com.projets_profesionnels.v3.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findAllBySubreddit(Sub subreddit);

    List<Post> findByUser(User user);
}