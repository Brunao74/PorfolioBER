package com.porfolioBER.BER.Controller;

import com.porfolioBER.BER.DTO.DTOEducacion;
import com.porfolioBER.BER.Entity.Educacion;
import com.porfolioBER.BER.Security.Controller.Mensaje;
import com.porfolioBER.BER.Service.SEducacion;
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
@RequestMapping("/educacion")
@CrossOrigin(origins = "http://localhost:4200")
public class CEducacion {

    @Autowired
    SEducacion sEducacion;

    @GetMapping("/lista")
    public ResponseEntity<List<Educacion>> list() {
        List<Educacion> list = sEducacion.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    @GetMapping("/detail/{id}")
    public ResponseEntity<Educacion> getById(@PathVariable("id") int id) {
        if (!sEducacion.existsById(id)) {
            return new ResponseEntity(new Mensaje("No existe el ID"), HttpStatus.BAD_REQUEST);
        }

        Educacion educacion = sEducacion.getOne(id).get();
        return new ResponseEntity(educacion, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id) {
        if (!sEducacion.existsById(id)) {
            return new ResponseEntity(new Mensaje("No existe"), HttpStatus.NOT_FOUND);
        }
        sEducacion.delete(id);
        return new ResponseEntity(new Mensaje("Eliminado"), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody DTOEducacion dtoeducacion) {
        if (StringUtils.isBlank(dtoeducacion.getTitulo())) {
            return new ResponseEntity(new Mensaje("Falta titulo"), HttpStatus.BAD_REQUEST);
        }
        if (sEducacion.existsByTitulo(dtoeducacion.getTitulo())) {
            return new ResponseEntity(new Mensaje("Ese titulo existe"), HttpStatus.BAD_REQUEST);
        }

        Educacion educacion = new Educacion(dtoeducacion.getTitulo(), dtoeducacion.getDescripcionE(), dtoeducacion.getAniofin(),
                dtoeducacion.getAnioinicio(), dtoeducacion.getInstituto());
        sEducacion.save(educacion);
        return new ResponseEntity(new Mensaje("Creado"), HttpStatus.OK);

    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody DTOEducacion dtoeducacion) {
        if (!sEducacion.existsById(id)) {
            return new ResponseEntity(new Mensaje("No existe"), HttpStatus.NOT_FOUND);
        }
        if (sEducacion.existsByTitulo(dtoeducacion.getTitulo()) && sEducacion.getByTitulo(dtoeducacion.getTitulo()).get().getId() != id) {
            return new ResponseEntity(new Mensaje("Ya existe"), HttpStatus.BAD_REQUEST);
        }
        if (StringUtils.isBlank(dtoeducacion.getTitulo())) {
            return new ResponseEntity(new Mensaje("Falta titulo"), HttpStatus.BAD_REQUEST);
        }

        Educacion educacion = sEducacion.getOne(id).get();

        educacion.setTitulo(dtoeducacion.getTitulo());
        educacion.setDescripcionE(dtoeducacion.getDescripcionE());
        educacion.setAniofin(dtoeducacion.getAniofin());
        educacion.setAnioinicio(dtoeducacion.getAnioinicio());
        educacion.setInstituto(dtoeducacion.getInstituto());

        sEducacion.save(educacion);

        return new ResponseEntity(new Mensaje("Actualizado"), HttpStatus.OK);
    }
}
