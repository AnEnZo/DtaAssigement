package com.example.DtaAssigement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.DtaAssigement.entity.Position;

import java.util.Optional;

@Repository
public interface PositionRepository extends JpaRepository<Position, Long> {
    boolean existsByName(String name);
    Optional<Position> findByName(String name);
}

