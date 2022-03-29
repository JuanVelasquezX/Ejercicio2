import Serie
import Videojuego

fun main() {
    var seriesEntregadas = 0
    var vjEntregados = 0
    var series = arrayOf<Serie>()

    val serie1 = Serie("Serie A",5,"Drama","Vince")
    val serie2 = Serie("Serie B",8,"Fantasia","George")
    val serie3 = Serie("Serie C",4,"Comedia","David")
    val serie4 = Serie("Serie D",7,"Terror","Pedro")
    val serie5 = Serie("Serie E",9,"Anime","Mark")

    serie3.entregar()

    series = series.plus(serie1)
    series = series.plus(serie2)
    series = series.plus(serie3)
    series = series.plus(serie4)
    series = series.plus(serie5)

    for (i in series.indices){
        if(series[i].entregado == true){
            seriesEntregadas += 1
            series[i].devolver()
        }
    }

    var videojuegos = arrayOf<Videojuego>()

    val vj1 = Videojuego("Juego A",25,"Accion","Ubisoft")
    val vj2 = Videojuego("Juego B",58,"Fantasia","FromSoftware")
    val vj3 = Videojuego("Juego C",47,"Hack&Slash","Nintendo")
    val vj4 = Videojuego("Juego D",72,"Terror","FromSoftware")
    val vj5 = Videojuego("Juego E",19,"MOBA","Riot")


    vj3.entregar()

    videojuegos = videojuegos.plus(vj1)
    videojuegos = videojuegos.plus(vj2)
    videojuegos = videojuegos.plus(vj3)
    videojuegos = videojuegos.plus(vj4)
    videojuegos = videojuegos.plus(vj5)

    for (i in videojuegos.indices){
        if(videojuegos[i].entregado == true){
            vjEntregados += 1
            videojuegos[i].devolver()
        }
    }

    println("Series Entregadas: " + seriesEntregadas)
    println("Videojuegos Entregados: " + vjEntregados)

}