package com.elecam.ELECAM.Repository;

import com.elecam.ELECAM.Entity.Candidat;
import com.elecam.ELECAM.Entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidatRepository extends JpaRepository<Candidat, Long> {
}
