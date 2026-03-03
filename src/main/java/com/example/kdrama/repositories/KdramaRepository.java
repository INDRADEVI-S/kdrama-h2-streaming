package com.example.kdrama.repositories;

import com.example.kdrama.models.Kdrama;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KdramaRepository extends JpaRepository<Kdrama, Long> {
}
