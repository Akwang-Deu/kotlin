fun main() {
    greetingName("Akwang")
    var y = modulus(num1 = 6 , num2 = 4)
    println(y)
    var x = add(num3 = 80.7, num4 = 50, num5 = 40, num6 = 20)
    println(x)
    interestingFactAboutMe()


}
fun greetingName(name: String){
    val name ="Hello ${name}"
    println(name)

}
fun modulus(num1:Int, num2:Int):Int{
    var modulus = num1 % num2
    return modulus

}
fun add(num3:Double, num4:Int, num5:Int, num6:Int):Double{
    var add = num3 + num4 +num5 + num6
    return add

}
fun interestingFactAboutMe(){
    var fact = "I can play basketball"
    println(fact)





}