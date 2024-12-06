package com.elecam.ELECAM.Repository;

import com.elecam.ELECAM.Entity.Region;
import com.elecam.ELECAM.Entity.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {
}
