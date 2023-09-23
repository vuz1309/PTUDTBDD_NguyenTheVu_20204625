import example.myapp.Aquarium
import example.myapp.Plecostomus
import example.myapp.Shark
import example.myapp.TowerTank
import example.myapp.decor.Decoration
import java.util.*

fun feedTheFish() {
    val day = randomDay()
    val food = "pellets"
    println ("Today is $day and the fish eat $food")
}
fun randomDay() : String {
    val week = arrayOf ("Monday", "Tuesday", "Wednesday", "Thursday",
        "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(week.size)]
}

fun buildAquarium(){
    val aquarium6 = Aquarium(length = 25, width = 25, height = 40)
    aquarium6.printSize()
    val myTower = TowerTank(diameter = 25, height = 40)
    myTower.printSize()

}
fun makeFish() {
    val shark = Shark()
    val pleco = Plecostomus()
    println("Shark: ${shark.color}")
    shark.eat()
    println("Plecostomus: ${pleco.color}")
    pleco.eat()

}
fun makeDecorations() {
    val decoration1 = Decoration("granite")
    println(decoration1)

    val decoration2 = Decoration("slate")
    println(decoration2)

    val decoration3 = Decoration("slate")
    println(decoration3)

    println (decoration1.equals(decoration2))
    println (decoration3.equals(decoration2))

}

fun main(args: Array<String>) {
 
//    buildAquarium()
//    makeFish()
    makeDecorations()

}
