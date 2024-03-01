class mat(){
    //escopo classe e escopo objeto
    companion object M{//escopo classe
        val pi =3.1415
        fun adc(){}
        init {
            println("iniciando companion")
        }
    }
    object obj01{
        val t = 7
        val pi = 3.1415
        init {
            println("iniciando obj1")
        }

    }
    object obj02{
        val h = 7
        val pi = 3.1415
        init {
            println("iniciando obj2")
        }
    }
    object obj03{
        val l = 7
        val pi = 3.1415
        init {
            println("iniciando obj3")
        }
    }
}

fun main() {
    //println(mat.pi)
    //m.pi
    var m :mat = mat()

    println("acessando objeto 01: ${mat.obj01.t}")
    println("acessando objeto 02: ${mat.obj02.h}")
    println("acessando objeto 03: ${mat.obj03.l}")

    mat.pi
    mat.pi
    mat.pi
    mat.pi
    mat.pi
}