package ge.softservice.palindromenoactivity

fun main() {
notContains()
   // solution(myArray)
}

var myArray  = intArrayOf(-5, 10, 3, 15, 2, 1)

fun  notContains() {
    val sortedArray = myArray.sorted()
    val positiveList: MutableList<Int> = ArrayList()

    for (i in sortedArray) {
        if(i>0) {
            positiveList.add(i)
        }
    }
/*for (i in positiveList) {
    var temp = 0
    if ()
}*/
    println(sortedArray)
    println(positiveList)
}