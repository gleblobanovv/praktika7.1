fun main() {
    var num1 = readLine()!!.ToDouble();
    var num2 = readLine()!!.ToDouble();
    var num3 = readLine()!!.ToDouble();

    var sredarifmet = (num1 + num2 + num3) / 3
    println("Среднее арифметическое: $sredarifmet")

    var sredgeom = Math.cbrt(num1 * num2 * num3)
    println("Среднее геометрическое: $sredgeom")
}