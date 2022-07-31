export class persona{
    id?: number;
    nombre: String;
    apellido: String;
    img: String;
    titulo: String;
    nacion: String;

    constructor(nombre: String, apellido: String, img: String, titulo: String, nacion: String){
        this.nombre = nombre;
        this.apellido = apellido;
        this.img = img;
        this.titulo = titulo;
        this.nacion =nacion;

    }
}