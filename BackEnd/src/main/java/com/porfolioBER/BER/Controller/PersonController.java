/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.porfolioBER.BER.Controller;

import com.porfolioBER.BER.Entity.Person;
import com.porfolioBER.BER.Interface.InterfacePersonService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
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
/**
 *
 * @author bruno
 */
public class PersonController {
    @Autowired InterfacePersonService interfacepersonservice;
    
    @GetMapping("personas/traer")
    public List<Person> getPerson(){
        return interfacepersonservice.getPerson();
    }
    
    @PostMapping("/personas/crear")
    public String createPerson(@RequestBody Person person){
        interfacepersonservice.savePerson(person);
        return "La persona fue creada";
    }
    
    @DeleteMapping("/personas/borrar/(id)")
    public String deletePerson(@PathVariable Long id){
        interfacepersonservice.deletePerson(id);
        return "La persona fue eliminada";
    }  

    @PutMapping("/personas/editar/(id)")
    public Person editPerson(@PathVariable Long id,
                             @RequestParam("nombre") String nuevoNombre,
                             @RequestParam("apellido") String nuevoApellido,
                             @RequestParam("img") String nuevoImg){
        Person person;
        person = interfacepersonservice.findPerson(id);
        
        person.setNombre(nuevoNombre);
        person.setApellido(nuevoApellido);
        person.setImg(nuevoImg);
        interfacepersonservice.savePerson(person);
        return person;
    }  
    @GetMapping("personas/traer/perfil")
    public Person findPerson(){
        return interfacepersonservice.findPerson((long)1);
    }
}
