fun main (){
    var first_Num = readLine()!!.ToInt();
    var fifth_Num = readLine()!!.ToInt();
    var n = readLine()!!.ToInt();

    var commonDifference = (fifth_Num - first_Num) / 4
    var nthNum = first_Num + (n-1) * commonDifference
    var sum_Of_Num = (n * (2 * first_Num + (n-1) * commonDifference)) / 2

    println("Член прогрессии с номером $n равен $nthNum")
    println("Сумма $n членов прогрессии равна $sum_Of_Num")
}