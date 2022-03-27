fun main(){
    var transportation = Car("Mazda","Mazda MX_5 Miata","Red",2)
    transportation.carry(3)
    transportation.identity()
    transportation.parkingFees(2)



}





//1.Create a class Car with the following attributes: make, model, color, capacity.
//It has these functions:
//-carry(people: Int) : Prints out “Carrying $peoplepassengers” if the
//number of people is within its capacity else it prints out “Over capacity
//by $x people” where x is the number of people exceeding its capacity
//(3 points)
//-identity() : Prints out the color, make and modelin the following
//format e.g:  “I am a white subaru legacy”(1 point)
//-calculateParkingFees(hours: Int) : Calculates andreturns the
//parking fees by multiplying the hours by 20(1 point)

class Car(var make: String, var model: String, var color: String, var capacity: Int){
    fun carry(people: Int) {
        var x = people - capacity
        if (people <= 5) {
            println("Carrying $people passengers")
        } else {
            println("Over capacity by $x people")


        }

    }
     fun identity(){
         println("I am a $color $make $model")
     }

    fun parkingFees(hours: Int): Int{
        var happyHours = hours * 20
        println("The parking fees is $happyHours")
        return happyHours



}


}


//2.Create a class Bus with the same attributes and functions as the Car class.
//In addition, it has another method calledmaxTripFare(fare: Double) that
//calculates and returns the maximum amount of fare that can be collected per
//trip.(2 points)
//The bus’calculateParkingFees method returns the productof hours and
//the capacity of the bus(3 points)
//Make use of inheritance to avoid duplication. Also be sure to instantiate both classes