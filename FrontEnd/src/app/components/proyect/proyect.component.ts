import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Proyects } from 'src/app/model/proyects';
import { ProyectsService } from 'src/app/service/proyects.service';

@Component({
  selector: 'app-proyect',
  templateUrl: './proyect.component.html',
  styleUrls: ['./proyect.component.css']
})
export class EditproyectsComponent implements OnInit {
  proyects: Proyects = null;
  
  constructor(
    private proyectsS: ProyectsService,
    private activatedRouter : ActivatedRoute,
    private router: Router
  ) { }

  ngOnInit(): void {
    const id = this.activatedRouter.snapshot.params['id'];
    this.proyectsS.detail(id).subscribe(
      data =>{
        this.proyects = data;
      }, err =>{
         alert("Error al modificar");
         this.router.navigate(['']);
      }
    )
  }

  onUpdate(): void{
    const id = this.activatedRouter.snapshot.params['id'];
    this.proyectsS.update(id, this.proyects).subscribe(
      data => {
        this.router.navigate(['']);
      }, err => {
        alert("Error al modificar la proyects");
        this.router.navigate(['']);
      }
    )
  }
}