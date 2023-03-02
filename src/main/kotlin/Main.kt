fun main() {
var Joy = Human("Joy",18,45)
    Joy.eat(10)
    println(Joy.weight)
    Joy.speak("I love coding")
    Joy.birthday(1)
    println(Joy.age)
    var person=User("Peter","Mbugua","Peter.Mbugua@gmail.com","0720487563","PETER.254")
    println(person.firstName)
    println(person.password)


}
class Human(var name:String,var age:Int,var weight:Int){
    fun eat(foodWeight:Int){
     println("I am eating $foodWeight kgs of food")
        weight+=foodWeight
    }
    fun speak(speech:String){
      println("I love coding")
    }
    fun birthday(x: Int){
        age+=1

    }



}
data class User(var firstName:String,var lastname:String,var email:String,var phoneNumber:String,var password:String)