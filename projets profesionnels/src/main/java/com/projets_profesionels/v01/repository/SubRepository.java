package com.projets_profesionels.v01.repository;

import com.projets_profesionels.v01.model.Sub;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SubRepository extends JpaRepository<Sub, Long> {

    Optional<Sub> findByName(String contentName);
}