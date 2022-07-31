package com.porfolioBER.BER.Controller;

import com.porfolioBER.BER.DTO.DTOSkills;
import com.porfolioBER.BER.Entity.Skills;
import com.porfolioBER.BER.Security.Controller.Mensaje;
import com.porfolioBER.BER.Service.SSkills;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/explab")
@CrossOrigin(origins = "http://localhost:4200")
public class CSkills {

    @Autowired
    SSkills sSkills;

    @GetMapping("/lista")
    public ResponseEntity<List<Skills>> list() {
        List<Skills> list = sSkills.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    @GetMapping("/detail/{id}")
    public ResponseEntity<Skills> getById(@PathVariable("id") int id) {
        if (!sSkills.existsById(id)) {
            return new ResponseEntity(new Mensaje("No existe"), HttpStatus.NOT_FOUND);
        }
        Skills skills = sSkills.getOne(id).get();
        return new ResponseEntity(skills, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id) {
        if (!sSkills.existsById(id)) {
            return new ResponseEntity(new Mensaje("No existe"), HttpStatus.NOT_FOUND);
        }
        sSkills.delete(id);
        return new ResponseEntity(new Mensaje("Eliminado"), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody DTOSkills dtoskills) {
        if (StringUtils.isBlank(dtoskills.getSkill())) {
            return new ResponseEntity(new Mensaje("Falta nombre"), HttpStatus.BAD_REQUEST);
        }

        Skills skills = new Skills(dtoskills.getSkill(), dtoskills.getPorcentaje());
        sSkills.save(skills);

        return new ResponseEntity(new Mensaje("Agregado"), HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody DTOSkills dtoskills) {
        if (!sSkills.existsById(id)) {
            return new ResponseEntity(new Mensaje("No existe"), HttpStatus.BAD_REQUEST);
        }

        Skills skills = sSkills.getOne(id).get();
        skills.setSkill(dtoskills.getSkill());
        skills.setPorcentaje((dtoskills.getPorcentaje()));

        sSkills.save(skills);
        return new ResponseEntity(new Mensaje("Actualizado"), HttpStatus.OK);

    }
}
