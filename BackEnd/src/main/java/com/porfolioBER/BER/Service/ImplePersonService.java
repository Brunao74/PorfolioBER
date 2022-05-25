/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.porfolioBER.BER.Service;

import com.porfolioBER.BER.Entity.Person;
import com.porfolioBER.BER.Interface.InterfacePersonService;
import com.porfolioBER.BER.Repository.InterfacePersonRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
/**
 *
 * @author bruno
 */
public class ImplePersonService implements InterfacePersonService {

    @Autowired InterfacePersonRepository interfacepersonrepository;
    @Override
    public List<Person> getPerson() {
        List<Person> person = interfacepersonrepository.findAll();
        return person;
    }

    @Override
    public void savePerson(Person person) {
        interfacepersonrepository.save(person);
        }

    @Override
    public void deletePerson(Long id) {
        interfacepersonrepository.deleteById(id);
                }

    @Override
    public Person findPerson(Long id) {
        Person person = interfacepersonrepository.findById(id).orElse(null);
        return person;
    }
    
}
