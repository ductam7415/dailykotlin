fun main() {
    println("Vui lòng nhập con số của bạn")
    var n = readLine()!!.toInt()
    if (n > 2) {
        repeat(n - 1) {
            print(" ")
        }
        println("*")
        for (i in 3..n) {
            repeat(n - i + 1) {
                print(" ")
            }
            print("*")
            repeat(1 + 2 * (i - 3)) {
                print(" ")
            } 
            println("*")
        }
        repeat(n * 2 - 1) {
            print("*")
        }
    } else if (n == 2) {
        println(" " + "*")
        println("***")
    } else {
        println("chắc chỉ in ra đc thế này thôi")
        println("*")
    }
}

