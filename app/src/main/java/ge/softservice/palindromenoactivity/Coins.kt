package ge.softservice.palindromenoactivity

fun main(args: Array<String>) {
coins()
}

fun coins() {


    val insertedDigit = 20
    var mainAmount = 0
    var myRemainder = 0

    if (insertedDigit >= 50) {
        mainAmount = insertedDigit / 50
        myRemainder = insertedDigit%50
        if (myRemainder>=20) {
            mainAmount = mainAmount + myRemainder/20
           myRemainder = myRemainder%20
        }
        if (myRemainder>=10) {
            mainAmount +=1
            myRemainder = myRemainder%10
        }
        if (myRemainder >=5) {
            mainAmount +=1
            myRemainder = myRemainder%5
        }
        if (myRemainder >=1) {
            mainAmount = mainAmount + myRemainder
        }
            println("you need $mainAmount coins")
    }

    if (insertedDigit in 20..49) {
        mainAmount = insertedDigit / 20
        myRemainder = insertedDigit%20
        if (myRemainder>=10) {
            mainAmount +=1
            myRemainder = myRemainder%10
        }
        if (myRemainder >=5) {
            mainAmount +=1
            myRemainder = myRemainder%5
        }
        if (myRemainder >=1) {
            mainAmount = mainAmount + myRemainder
        }
        println("you need $mainAmount coins")
    }
    if (insertedDigit in 10..19) {
        mainAmount = insertedDigit / 10
        myRemainder = insertedDigit%10
        if (myRemainder >=5) {
            mainAmount +=1
            myRemainder = myRemainder%5
        }
        if (myRemainder >=1) {
            mainAmount = mainAmount + myRemainder
        }
        println("you need $mainAmount coins")
    }
    if (insertedDigit in 5..9) {
        mainAmount = insertedDigit / 5
        myRemainder = insertedDigit%5
        if (myRemainder >=1) {
            mainAmount = mainAmount + myRemainder
        } else
        println("you need $mainAmount coins")
    }
    if (insertedDigit in 1..4) {
        mainAmount = insertedDigit / 1
        myRemainder = insertedDigit%1
       // if (myRemainder >=1) {
            mainAmount = mainAmount + myRemainder
       // }
        println("you need $mainAmount coins")
    }
}