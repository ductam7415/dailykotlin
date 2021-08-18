fun main() {
    println("Vui lòng nhập con số của bạn")
    var i = readLine()!!.toInt()
    if (i>1) {
        repeat(i) {
            print("*")
        }
        print("\n")
        repeat(i - 2) {
            print("*")
            repeat(i - 2) {
                print(" ")
            }
            println("*")
        }
        repeat(i) {
            print("*")
        }
    }else{
        println("chắc chỉ in ra đc thế này thôi")
        println("*")
    }
}
