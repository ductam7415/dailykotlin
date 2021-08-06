fun main() {
    println("Lưu ý là nếu bạn đã kinh qua 12 năm học thì bạn cũng thừa hiểu là KO THỂ NÀO ĐẠT ĐC ĐIỂM HƠN 10 MÀ ĐÚNG KO")
    println("Điền từ từ ko cần gian dối làm gì đâu, bắt đầu từ 1 miệng đến tiết và điểm học kì nhé")
    var ktmieng: Int = readLine()!!.toInt()
    var kt1tiet: Int = readLine()!!.toInt()
    var kthocki: Int = readLine()!!.toInt()

    if (kt1tiet <= 10) {
        println("điểm 1 tiết $kt1tiet đ")
        if (kthocki <= 10) {
            println("điểm học kì $kthocki đ")
            if (ktmieng <= 10) {
                println("điểm miệng $ktmieng đ")
                var diemtrunbinh: Int = 0
                diemtrunbinh = (ktmieng + kt1tiet * 2 + kthocki * 3) / 7
                if (diemtrunbinh > 8) {
                    println("Chúc mừng bạn với những nỗ lực trong học kì vừa rồi bạn đã đạt thành quả là học sinh giỏi ")
                } else {
                    if (diemtrunbinh > 6.5) {
                        println("chúc mừng bạn với những nỗ lực trong học kì vừa rồi bạn đã đạt kết quả là học sinh khá ")
                    }else
                    println("Với những nỗ lực trong học kì vừa rồi bạn đã đạt kết quả là học sinh trung bình hoặc yếu")
                }
            } else {
                println("thật luôn đó hả")
            }
        } else {
            println("bạn là quái vật luôn rồi ")
        }
    } else {
        println("bạn cho mình nhận của mình 2 lạy ")
    }
}