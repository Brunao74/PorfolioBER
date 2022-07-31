package com.porfolioBER.BER.Repository;

import com.porfolioBER.BER.Entity.Proyect;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RProyect extends JpaRepository<Proyect, Integer> {

    public Optional<Proyect> findByNombreP(String nombreP);

    public boolean existsByNombreP(String nombreP);
}
