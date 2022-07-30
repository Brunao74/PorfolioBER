package com.porfolioBER.BER.Security.Repository;

import com.porfolioBER.BER.Security.Entity.Rol;
import com.porfolioBER.BER.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iRolRepository extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
