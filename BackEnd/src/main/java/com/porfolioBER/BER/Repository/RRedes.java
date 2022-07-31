package com.porfolioBER.BER.Repository;

import com.porfolioBER.BER.Entity.Redes;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface RRedes extends JpaRepository<Redes,Long> {
    
    public Optional<Redes> findById(int id);

    public boolean existsById(int id);
}