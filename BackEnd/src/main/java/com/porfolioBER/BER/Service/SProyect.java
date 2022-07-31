package com.porfolioBER.BER.Service;

import com.porfolioBER.BER.Entity.Proyect;
import com.porfolioBER.BER.Repository.RProyect;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SProyect {

    @Autowired
    RProyect rProyect;

    public List<Proyect> list() {
        return rProyect.findAll();
    }

    public Optional<Proyect> getOne(int id) {
        return rProyect.findById(id);
    }

    public Optional<Proyect> getByNombreP(String nombreP) {
        return rProyect.findByNombreP(nombreP);
    }

    public void save(Proyect proyect) {
        rProyect.save(proyect);
    }

    public void delete(int id) {
        rProyect.deleteById(id);
    }

    public boolean existsById(int id) {
        return rProyect.existsById(id);
    }

    public boolean existsByNombreP(String nombreP) {
        return rProyect.existsByNombreP(nombreP);
    }
}
