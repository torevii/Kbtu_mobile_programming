fun f_programm(p_num: Int) {
    if (p_num > 0) {
        println("positive")
    } else if (p_num < 0) {
        println("negative")
    } else {
        println("zero")
    }
}

fun main() {

    println("#1.")
    val v_num: Int = 1
    val vdouble: Double = 1.1
    val vtring: String = "Hello World!"
    val vbool: Boolean = true

    println("Integer = $v_num, Double = $vdouble, Boolean = $vbool, String = $vtring")

    println("#2")
    f_programm(1)
    f_programm(0)
    f_programm(-1)

    println("#3")
    for (i in 1..10) {
        println(i)
    }
    var i = 1
    while (i <= 10) {
        println(i)
        i++
    }

    println("#4")
    val vlist = listOf(1, 2, 3, 4, 5)
    var vsum = 0
    for (i in 0..vlist.size - 1) {
        println(vlist[i])
        vsum += vlist[i]
    }
    println("sum = $vsum")
}