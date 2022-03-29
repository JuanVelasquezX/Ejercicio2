class Videojuego : Entregado{
    var titulo : String
    var horasEstimadas : Int
    var entregado : Boolean
    var genero : String
    var compania : String

    constructor(){
        titulo = ""
        horasEstimadas = 3
        entregado = false
        genero = ""
        compania = ""
    }
    constructor(titulo : String, horasEstimadas : Int){
        this.titulo = titulo
        this.horasEstimadas = horasEstimadas
        entregado = false
        genero = ""
        compania = ""
    }
    constructor(titulo : String, horasEstimadas : Int, genero : String, compania : String){
        this.titulo = titulo
        this.horasEstimadas = horasEstimadas
        entregado = false
        this.genero = genero
        this.compania = compania
    }

    override fun entregar(){
        this.entregado = true
    }

    override fun devolver(){
        this.entregado = false
    }
    override fun isEntregado(): Boolean {
        return this.entregado
    }
}