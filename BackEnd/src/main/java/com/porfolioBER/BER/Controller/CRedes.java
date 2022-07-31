package com.porfolioBER.BER.Controller;

import com.porfolioBER.BER.DTO.DTORedes;
import com.porfolioBER.BER.Entity.Redes;
import com.porfolioBER.BER.Security.Controller.Mensaje;
import com.porfolioBER.BER.Service.SRedes;
import java.util.List;
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
public class CRedes {

    @Autowired
    SRedes sRedes;

    @GetMapping("/lista")
    public ResponseEntity<List<Redes>> list() {
        List<Redes> list = sRedes.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    @GetMapping("/detail/{id}")
    public ResponseEntity<Redes> getById(@PathVariable("id") int id) {
        if (!sRedes.existsById(id)) {
            return new ResponseEntity(new Mensaje("No existe"), HttpStatus.NOT_FOUND);
        }
        Redes redes = sRedes.getOne(id).get();
        return new ResponseEntity(redes, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id) {
        if (!sRedes.existsById(id)) {
            return new ResponseEntity(new Mensaje("No existe"), HttpStatus.NOT_FOUND);
        }
        sRedes.delete(id);
        return new ResponseEntity(new Mensaje("Eliminado"), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody DTORedes dtoredes) {
       
        Redes redes = new Redes(dtoredes.getEmail() , dtoredes.getFacebook(), dtoredes.getGithub(), dtoredes.getLinkedin() );
        sRedes.save(redes);

        return new ResponseEntity(new Mensaje("Agregado"), HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody DTORedes dtoredes) {
        if (!sRedes.existsById(id)) {
            return new ResponseEntity(new Mensaje("No existe"), HttpStatus.BAD_REQUEST);
        }
        
        Redes redes = sRedes.getOne(id).get();
        redes.setEmail(dtoredes.getEmail());
        redes.setFacebook(dtoredes.getFacebook());
        redes.setGithub(dtoredes.getGithub());
        redes.setLinkedin(dtoredes.getLinkedin() );

        sRedes.save(redes);
        return new ResponseEntity(new Mensaje("Actualizado"), HttpStatus.OK);

    } 
}
