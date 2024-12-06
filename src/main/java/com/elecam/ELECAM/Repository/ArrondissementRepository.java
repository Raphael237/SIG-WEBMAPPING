package com.elecam.ELECAM.Repository;

import com.elecam.ELECAM.Entity.Arrondissement;
import com.elecam.ELECAM.Entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArrondissementRepository extends JpaRepository<Arrondissement, Long> {
}
