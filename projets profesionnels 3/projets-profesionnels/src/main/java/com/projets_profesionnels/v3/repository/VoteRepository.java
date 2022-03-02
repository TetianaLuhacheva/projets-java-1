package com.projets_profesionnels.v3.repository;

import com.projets_profesionnels.v3.model.Post;
import com.projets_profesionnels.v3.model.User;
import com.projets_profesionnels.v3.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VoteRepository extends JpaRepository<Vote, Long> {
    Optional<Vote> findTopByPostAndUserOrderByVoteIdDesc(Post post, User currentUser);
}