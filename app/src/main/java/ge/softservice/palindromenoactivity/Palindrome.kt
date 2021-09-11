package ge.softservice.palindromenoactivity

    fun main(args: Array<String>) {
palindrome()
    }

fun palindrome() {
    val myText = "abba"
    val reversed = myText.reversed()
    if(myText == reversed) {
        println("That's palindrome")
    } else {
        println("that is not palindrome")
    }
}