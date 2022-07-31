export class Educacion {
    id?: number;
    titulo: string;
    descripcionE: string;
    anioinicio: string;
    aniofin: string;
    instituto: string;

    constructor(nombreE: string, descripcionE: string, anionicio: string, aniofin: string, instituto: string) {
        this.titulo = this.titulo;
        this.descripcionE = descripcionE;
        this.aniofin = aniofin;
        this.anioinicio = anionicio;
        this.instituto = instituto;
    }
}