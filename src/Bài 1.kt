fun main() {
    println("Em xin trân trọng thông báo là mọi người thương em mọi người đừng làm khó e nữa. Thế nên mọi người nhập SỐ NGUYÊN DƯƠNG ĐC KO Ạ\n")

    println("Ko biết mọi người thế nào chứ em thấy đạp xe hơn 24 tiếng và uống tới 12 lít nước ko phải là ý hay đâu cơ mà nếu mọi người có thể thì e cũng ko cấm \n")

    var NumberOfLiters: Int = 0
    var Time: Float = readLine()!!.toFloat()

    if (Time > 0 && Time <= 24) {
        NumberOfLiters = (Time * 0.5 - Time % 0.5).toInt()
        println("Số lít nước người đạp xe phải uống là $NumberOfLiters lit ")
    }else if(Time <0 ){
        println("Well có lẽ là mọi người đạp âm cả tiến độ đề ra luôn ko bất nhờ mấy ha")
    }else if(Time >24) {
        println("Khoẻ quá mọi ngày uống hơn 12 lít nước luôn ko ăn cũng ko ngủ chỉ đạp xe")
    }else{
        println("Are you ready! Start")
    }
}