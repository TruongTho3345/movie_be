package com.movie.movie_be.repository;

import com.movie.movie_be.entity.Information;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActorResponsitory extends JpaRepository<Information, Long> {
}
