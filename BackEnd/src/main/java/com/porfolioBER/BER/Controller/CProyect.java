package com.porfolioBER.BER.Controller;

import com.porfolioBER.BER.DTO.DTOProyect;
import com.porfolioBER.BER.Entity.Proyect;
import com.porfolioBER.BER.Security.Controller.Mensaje;
import com.porfolioBER.BER.Service.SProyect;
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
public class CProyect {

    @Autowired
    SProyect sProyect;

    @GetMapping("/lista")
    public ResponseEntity<List<Proyect>> list() {
        List<Proyect> list = sProyect.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    @GetMapping("/detail/{id}")
    public ResponseEntity<Proyect> getById(@PathVariable("id") int id) {
        if (!sProyect.existsById(id)) {
            return new ResponseEntity(new Mensaje("No existe"), HttpStatus.NOT_FOUND);
        }
        Proyect proyect = sProyect.getOne(id).get();
        return new ResponseEntity(proyect, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id) {
        if (!sProyect.existsById(id)) {
            return new ResponseEntity(new Mensaje("No existe"), HttpStatus.NOT_FOUND);
        }
        sProyect.delete(id);
        return new ResponseEntity(new Mensaje("Eliminado"), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody DTOProyect dtoproyect) {
        if (StringUtils.isBlank(dtoproyect.getNombreP())) {
            return new ResponseEntity(new Mensaje("Falta nombre"), HttpStatus.BAD_REQUEST);
        }
        if (sProyect.existsByNombreP(dtoproyect.getNombreP())) {
            return new ResponseEntity(new Mensaje("Ya existe"), HttpStatus.BAD_REQUEST);
        }

        Proyect proyect = new Proyect(dtoproyect.getNombreP(), dtoproyect.getDescripcionP(), dtoproyect.getImagenP());
        sProyect.save(proyect);

        return new ResponseEntity(new Mensaje("Agregado"), HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody DTOProyect dtoproyect) {
        if (!sProyect.existsById(id)) {
            return new ResponseEntity(new Mensaje("No existe"), HttpStatus.BAD_REQUEST);
        }
        if (sProyect.existsByNombreP(dtoproyect.getNombreP()) && sProyect.getByNombreP(dtoproyect.getNombreP()).get().getId() != id) {
            return new ResponseEntity(new Mensaje("Ya existe"), HttpStatus.BAD_REQUEST);
        }
        if (StringUtils.isBlank(dtoproyect.getNombreP())) {
            return new ResponseEntity(new Mensaje("Falta nombre"), HttpStatus.BAD_REQUEST);
        }

        Proyect proyect = sProyect.getOne(id).get();
        proyect.setNombreP(dtoproyect.getNombreP());
        proyect.setDescripcionP((dtoproyect.getDescripcionP()));
        proyect.setImagenP(dtoproyect.getImagenP());

        sProyect.save(proyect);
        return new ResponseEntity(new Mensaje("Actualizado"), HttpStatus.OK);

    } 
}
