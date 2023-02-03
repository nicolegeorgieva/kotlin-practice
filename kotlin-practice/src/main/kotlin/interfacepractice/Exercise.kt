package interfacepractice

fun main() {
    val rest1: Restaurant = LocalRestaurant()
    rest1.provideFood()
    rest1.provideBill()

    val rest2: Restaurant = FancyRestaurant()
    rest2.provideFood()
    rest2.provideBill()
}

interface Restaurant {
    fun provideFood()
    fun provideBill()
}

class LocalRestaurant : Restaurant {
    override fun provideFood() {
        println("Your local restaurant provides food and drinks.")
    }

    override fun provideBill() {
        println("Your bill is 70$.")
    }
}

class FancyRestaurant : Restaurant {
    override fun provideFood() {
        println("The most delicious food.")
    }

    override fun provideBill() {
        println("Your bill is 150$.")
    }
}