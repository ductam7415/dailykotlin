fun main() {
    println("Lưu ý là nếu bạn đã kinh qua 18 năm cuộc đời thì bạn cũng thừa hiểu là KO THỂ NÀO NGÀY THÁNG NĂM ÂM MÀ ĐÚNG KO")
    println("bắt đầu từ năm đến tháng nhé")

    var nam: Int = readLine()!!.toInt()
    var thang: Int = readLine()!!.toInt()

    if (thang <= 12) {
        if (nam % 4 == 0) {
            if (thang == 4) {
                println("Tháng $thang năm $nam có tất cả là 30 ngày")
            }
            if (thang == 6) {
                println("Tháng $thang năm $nam có tất cả là 30 ngày")
            }
            if (thang == 9) {
                println("Tháng $thang năm $nam có tất cả là 30 ngày")
            }
            if (thang == 11) {
                println("Tháng $thang năm $nam có tất cả là 30 ngày")
            }
            if (thang == 2) {
                println("Tháng $thang năm $nam tất cả là 29 ngày")
            }
            if (thang == 1) {
                println("Tháng $thang năm $nam có tất cả là 31 ngày")
            }
            if (thang == 3) {
                println("Tháng $thang năm $nam có tất cả là 31 ngày")
            }
            if (thang == 5) {
                println("Tháng $thang năm $nam có tất cả là 31 ngày")
            }
            if (thang == 7) {
                println("Tháng $thang năm $nam có tất cả là 31 ngày")
            }
            if (thang == 8) {
                println("Tháng $thang năm $nam có tất cả là 31 ngày")
            }
            if (thang == 10) {
                println("Tháng $thang năm $nam có tất cả là 31 ngày")
            }
            if (thang == 12) {
                println("Tháng $thang năm $nam có tất cả là 31 ngày")
            }
        } else {
            if (thang == 4) {
                println("Tháng $thang năm $nam có tất cả là 30 ngày")
            }
            if (thang == 6) {
                println("Tháng $thang năm $nam có tất cả là 30 ngày")
            }
            if (thang == 9) {
                println("Tháng $thang năm $nam có tất cả là 30 ngày")
            }
            if (thang == 11) {
                println("Tháng $thang năm $nam có tất cả là 30 ngày")
            }
            if (thang == 2) {
                println("Tháng $thang năm $nam có tất cả là 28 ngày")
            }
            if (thang == 1) {
                println("Tháng $thang năm $nam có tất cả là 31 ngày")
            }
            if (thang == 3) {
                println("Tháng $thang năm $nam có tất cả là 31 ngày")
            }
            if (thang == 5) {
                println("Tháng $thang năm $nam có tất cả là 31 ngày")
            }
            if (thang == 7) {
                println("Tháng $thang năm $nam có tất cả là 31 ngày")
            }
            if (thang == 8) {
                println("Tháng $thang năm $nam có tất cả là 31 ngày")
            }
            if (thang == 10) {
                println("Tháng $thang năm $nam có tất cả là 31 ngày")
            }
            if (thang == 12) {
                println("Tháng $thang năm $nam có tất cả là 31 ngày")
            }
        }
    }
}