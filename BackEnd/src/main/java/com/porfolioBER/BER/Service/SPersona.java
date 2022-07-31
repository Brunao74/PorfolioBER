package com.porfolioBER.BER.Service;

import com.porfolioBER.BER.Entity.Persona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.porfolioBER.BER.Repository.RPersona;
import com.porfolioBER.BER.Interface.IPersona;

@Service
public class SPersona implements IPersona {

    @Autowired
    RPersona rPersona;

    @Override
    public List<Persona> getPersona() {
        List<Persona> persona = rPersona.findAll();
        return persona;
    }

    @Override
    public void savePersona(Persona persona) {
        rPersona.save(persona);
    }

    @Override
    public void deletePersona(Long id) {
        rPersona.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
        Persona persona = rPersona.findById(id).orElse(null);
        return persona;
    }

}
