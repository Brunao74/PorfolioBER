package com.porfolioBER.BER.Controller;

import com.porfolioBER.BER.Entity.Persona;
import com.porfolioBER.BER.Interface.InterfacePersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class PersonaController {

    @Autowired
    InterfacePersonaService interfacepersonaService;

    @GetMapping("personas/traer")
    public List<Persona> getPersona() {
        return interfacepersonaService.getPersona();
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/personas/crear")
    public String createPersona(@RequestBody Persona persona) {
        interfacepersonaService.savePersona(persona);
        return "creado";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/personas/eliminar/(id)")
    public String deletePersona(@PathVariable Long id) {
        interfacepersonaService.deletePersona(id);
        return "eliminado";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/personas/editar/(id)")
    public Persona editPersona(@PathVariable Long id,
            @RequestParam("nombre") String nuevoNombre,
            @RequestParam("apellido") String nuevoApellido,
            @RequestParam("img") String nuevoImg,
            @RequestParam("titulo") String nuevoTitulo,
            @RequestParam("nacion") String nuevoNacion) {
        Persona persona = interfacepersonaService.findPersona(id);
        persona.setNombre(nuevoNombre);
        persona.setApellido(nuevoApellido);
        persona.setImg(nuevoImg);
        persona.setTitulo(nuevoTitulo);
        persona.setNacion(nuevoNacion);
        interfacepersonaService.savePersona(persona);
        return persona;
    }

    @GetMapping("/personas/traer/perfil")
    public Persona findPersona() {
        return interfacepersonaService.findPersona((long) 1);
    }
}
