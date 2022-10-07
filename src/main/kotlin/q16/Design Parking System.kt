package q16

/**
 * No.1603
 */
class ParkingSystem(big: Int, medium: Int, small: Int) {

    private val lots = arrayOf(big, medium, small)

    fun addCar(carType: Int): Boolean {
        return lots[carType - 1]-- > 0
    }
}