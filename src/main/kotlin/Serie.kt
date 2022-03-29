class Serie : Entregado{

    var titulo : String
    var numTemporadas : Int
    var entregado : Boolean
    var genero : String
    var creador : String

    constructor(){
        titulo = ""
        numTemporadas = 3
        entregado = false
        genero = ""
        creador = ""
    }
    constructor(titulo : String, creador : String){
        this.titulo = titulo
        numTemporadas = 3
        entregado = false
        genero = ""
        this.creador = creador
    }
    constructor(titulo : String, numTemporadas : Int, genero : String, creador : String){
        this.titulo = titulo
        this.numTemporadas = numTemporadas
        entregado = false
        this.genero = genero
        this.creador = creador
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