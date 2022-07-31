package com.porfolioBER.BER.Service;

import com.porfolioBER.BER.Entity.Redes;
import com.porfolioBER.BER.Repository.RRedes;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SRedes {

    @Autowired
    RRedes rRedes;

    public List<Redes> list() {
        return rRedes.findAll();
    }

    public Optional<Redes> getOne(int id) {
        return rRedes.findById(id);
    }

    public void save(Redes red) {
        rRedes.save(red);
    }

    public void deletePersona(Long id) {
        rRedes.deleteById(id);
    }
    public boolean existsById(int id) {
        return rRedes.existsById(id);
    }
}
