fun main() {
    println("Em xin trân trọng thông báo là mọi người thương em mọi người đừng làm khó e nữa. Thế nên mọi người nhập SỐ NGUYÊN DƯƠNG ĐC KO Ạ\n")

    var Month: Int = readLine()!!.toInt()

    if (Month > 0 && Month <= 12) {
        when (Month) {
            1 -> println("January, " + "là tháng thuộc quý 1 của năm")
            2 -> println("February, " + "là tháng thuộc quý 1 của năm")
            3 -> println("March, " + "là tháng thuộc quý 1 của năm")
            4 -> println("April, " + "là tháng thuộc quý 2 của năm")
            5 -> println("May, " + "là tháng thuộc quý 2 của năm")
            6 -> println("June, " + "là tháng thuộc quý 2 của năm")
            7 -> println("July, " + "là tháng thuộc quý 3 của năm")
            8 -> println("August, " + "là tháng thuộc quý 3 của năm")
            9 -> println("September, " + "là tháng thuộc quý 3 của năm")
            10 -> println("October, " + "là tháng thuộc quý 4 của năm")
            11 -> println("November, " + "là tháng thuộc quý 4 của năm")
            12 -> println("December, " + "là tháng thuộc quý 4 của năm")
        }
    } else if (Month < 0) {
        println("Trêu tôi đấy à THÁNG CÓ SỐ ÂM ôi trời ơi tôi đi chết đây")
    } else {
        println("LÀNG NƯỚC ƠI CÓ THÁNG $Month NÀY XIN NGƯỜI")
    }
}