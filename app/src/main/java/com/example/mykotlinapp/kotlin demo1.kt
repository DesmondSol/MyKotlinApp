
import java.util.Random //importing random package

class Person(val firstName: String, val lastName: String, var age: Int) { //class declaration with a default constructor

fun showDetail(){
    println("your first and last name is: $firstName $lastName")
    println("your age after 10 years becomes ${ageAfterTenYears()}")
}

fun ageAfterTenYears():Int{
 return age+10
}
}

class Calculator(var no1:Float,var no2:Float,var operation:Char){ 
    fun calculate():Float{
        
       return when(operation){
           '-' -> no1 - no2
           '+' -> no1 + no2
           '*' -> no1 * no2
           '/' -> no1 / no2
           else -> 0F
        }
    }
}
class Game(var guess:Int){
    fun rollDice(){
    
      var result=Random().nextInt(5)+1 //generates random no 0 to 5 so i made it increase in one that becomes 1 to 6
    if(guess==result){
        println("you have won")
    }else{
        println("the result is: $result good luck next time!!!")
    }
    }
}
fun main() {
    
val person = Person("Joe","Smith",30)  //creating an instance for person class
    person.showDetail() //calling showdetail function
    
    
 var answer=Calculator(20F,40F,'+').calculate()   
   println("answer is $answer")
    
 Game(2).rollDice()   
    
}