fun main() {
    var a = readLine()!!.ToInt();
    var q = readLine()!!.ToInt();
    var k = readLine()!!.ToInt();
    var p = readLine()!!.ToInt();

    var sum = 0

    for (i in k..p) {
        sum += a * q.pow(i-1)
    }

    println("Сумма членов с номерами от $k до $p равна $sum")
}

