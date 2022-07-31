import { TimestampProvider } from "rxjs";

export class Experiencia {
    id? : number;
    empresa : string;
    descripcionX : string;
    cargo: string;
    anioinicio: string;
    aniofin: string;
    tipo: string;



    constructor(empresa: string, descripcionX: string, cargo: string, anioinicio: string, aniofin: string, tipo: string ){
        this.cargo = cargo;
        this.tipo = tipo;
        this.empresa = empresa;
        this.anioinicio = anioinicio;
        this.aniofin = aniofin;
        this.descripcionX = descripcionX;
    }
}