fun main() {
    var beast: String? = readLine()
    var dish: String? = readLine()

    beast = beast!!.get(0)?.toString()
    dish = dish!!.get(0)?.toString()

    if (beast[0] == dish[0] && beast[beast.lastIndex] == dish[dish.lastIndex]) {
        println("món ăn của $beast đã được dọn lên")
    } else {
        println("chọn món $dish khác đi nhé ")
    }
}