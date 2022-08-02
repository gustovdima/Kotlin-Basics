Task on variable:

1. Suppose you have two variables a and b that store some numbers. Swap the values of these variables.
For example, if a = 3 and b = 5, then after executing the code, a will contain 5, and b will contain 3. 
Try to do it with the help of the third variable c.

fun main() {
    var (a, b) = readLine()!!.split(" ").map { it.toInt() }
    // Write only exchange actions here. Do not touch the lines above
    val c = a
    a = b
    b = c


        // Do not touch the lines below
        print("$a $b")
}
 
