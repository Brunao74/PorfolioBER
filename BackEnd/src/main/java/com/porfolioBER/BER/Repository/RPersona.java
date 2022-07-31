package com.porfolioBER.BER.Repository;

import com.porfolioBER.BER.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface RPersona extends JpaRepository<Persona,Long> {
}
