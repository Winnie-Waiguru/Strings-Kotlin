fun main() {
    newName("Akirachix") //Invoking function for ques 1


    var result=combine("Winfred", 35 )
    println(result)           //Invoking function for ques 2

    var answer= extent("A reader lives many live")
    println(answer)          //Invoking function for ques 3

    looping("Wangari")   //Invoking function for ques 4
}

fun newName(name:String) {
    println(name[0].toString() + name[2] + name[3])
}  // Ques: 1) Function that prints out a string composed of the first, third and fourth characters of given string

fun  combine(x:String, y:Int): String {
    var answer = ("Hi, my name is $x and I am $y years old")
    return answer
}    //Ques: 2) Function that takes in two parameters and returns a String

fun extent(statement:String): Int{
    return statement.length
} //Ques:3) Function that takes in String and retuns its length

fun looping(name:String){
    if (name=="Wangui"){
        println("That's me.")
    }
    else{
        println("I don't know who that is.")
    }
}