package vn.edu.hust.soict.sv.rolldice

class Dice(val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}