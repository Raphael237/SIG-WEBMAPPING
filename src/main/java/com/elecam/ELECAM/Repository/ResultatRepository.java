package com.elecam.ELECAM.Repository;

import com.elecam.ELECAM.Entity.Region;
import com.elecam.ELECAM.Entity.Resultat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResultatRepository extends JpaRepository<Resultat, Long> {
}
