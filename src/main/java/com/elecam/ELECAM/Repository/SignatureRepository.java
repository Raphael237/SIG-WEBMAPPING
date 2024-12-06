package com.elecam.ELECAM.Repository;

import com.elecam.ELECAM.Entity.Region;
import com.elecam.ELECAM.Entity.Signature;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SignatureRepository extends JpaRepository<Signature, Long> {
}
