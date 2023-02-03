package interfacepractice

fun main() {
    val dealer = CarDealer()

    var myCar = dealer.rentAffordableCar()
    myCar.rent()

    myCar = dealer.rentLuxuryCar()
    myCar.rent()
}

interface RentalCar {
    var price: Int
    fun rent()
}

class AffordableCar : RentalCar {
    override var price = 1000
    override fun rent() {
        println("The affordable car costs $price.")
    }
}

class LuxuryCar : RentalCar {
    override var price = 5000

    override fun rent() {
        println("The luxury car costs $price.")
    }
}

class CarDealer {
    fun rentAffordableCar(): RentalCar {
        return AffordableCar()
    }

    fun rentLuxuryCar(): RentalCar {
        return LuxuryCar()
    }
}