fun main(){
     namesArray("Brenda","Waeni","Mumbua","Liz")
    cities("harare","mumbai", "dodoma")
    elements()

    println(towns("Machakos","Nairobi","Kisumu"))
}
//1. Create a function that takes in 4 strings and creates an array out of them then
//prints out the array
fun namesArray(name1:String, name2: String, name3: String,name4:String) {
    var namesArray = arrayOf(name1, name2, name3,name4)
    println(namesArray.contentToString())
}
//Create a function that given an array below:
//
//var cities = arrayOf(“harare”, “mumbai”, “dodoma”, “jakarta”)
//prints out the names of the cities in the correct grammatical case.
fun cities(city1:String, city2:String,city3:String){
    var cities= arrayOf( city1,city2,city3)
    println(cities.map{it.capitalize()})
}
//Create one function that given the below array:
//
//var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
//(i) prints out the sum of the second and fifth elements (1 point)
//(ii) prints out the index of 158 (1 point)
//(iii) prints out the elements in ascending order
fun  elements(){
    var elements= arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
    var sum = elements[1]+ elements[4]
    println(sum)
//print out the indexof 158
    println(elements.indexOf(158))

    //print out elements in ascending order
    println(elements.sortedArray().contentToString())

}
//Create a function that takes in 3 names and returns a string array containing
//all 3 names.
fun towns (towns1:String, towns2:String,towns3:String):String{
    var towns= arrayOf(towns1,towns2,towns3)
    return towns.contentToString()
}
