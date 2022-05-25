/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.porfolioBER.BER.Interface;
import com.porfolioBER.BER.Entity.Person;
import java.util.List;
/**
 *
 * @author bruno
 */
public interface InterfacePersonService {
    public List<Person> getPerson();
    public void savePerson (Person person);
    public void deletePerson(Long id);
    public Person findPerson(Long id);
}
