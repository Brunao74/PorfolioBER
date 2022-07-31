package com.porfolioBER.BER.Interface;

import com.porfolioBER.BER.Entity.Persona;
import java.util.List;

public interface InterfacePersonaService {

    public List<Persona> getPersona();

    public void savePersona(Persona persona);

    public void deletePersona(Long id);

    public Persona findPersona(Long id);
}
