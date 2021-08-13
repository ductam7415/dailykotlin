fun main(){
    println("Đọc đầu bài thì mọi người thấy nhập số trước rồi mới đến chuỗi nhé")
    var number = readLine()!!.toInt()
    var string = readLine()!!.toString()
    repeat(number){
        print("$string")
    }

}