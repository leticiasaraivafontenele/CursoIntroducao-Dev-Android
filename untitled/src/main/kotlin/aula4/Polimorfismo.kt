interface dev{
    var salario: Float
    fun bonus():Float
}
class mobile(override var salario: Float):dev{
    override fun bonus(): Float {
        return salario*0.7f
    }

}
class games(override var salario: Float):dev{
    override fun bonus(): Float {
        return salario*0.6f
    }
}
class back(override var salario: Float):dev{
    override fun bonus(): Float {
        return salario*0.5f
    }
}
//sem polimorfismo
/*fun mostarsal(m:mobile){
    println(m.bonus())
}
fun mostarsal(g:games){
    println(g.bonus())
}
fun mostarsal(b:back){
    println(b.bonus())
}*/
//polimorfismo
fun mostarsal(d:dev){
    println(d.bonus())
}

fun main() {
    //var x:dev = dev(5000f)
    //println(x.salario)

    mostarsal(back(1000f))
    mostarsal(games(1000f))
    mostarsal(mobile(1000f))


}