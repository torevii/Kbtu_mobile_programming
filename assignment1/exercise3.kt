fun f_add(p_num1: Int, p_num2: Int): Int {
    return p_num1 + p_num2
}

val f_multiply: (Int, Int) -> Int = { x, y -> x * y }

fun f_apply(p_num1: Int, p_num2: Int, operation: (Int, Int) -> Int): Int {
    return operation(p_num1, p_num2)
}

fun main() {
    var v_num1: Int = 4
    var v_num2: Int = 6
    val result1 = f_add(v_num1, v_num2)
    println("num1 = $v_num1, num2 = $v_num2, result = $result1")

    val result2 = f_multiply(v_num1, v_num2)
    println("num1 = $v_num1, num2 = $v_num2, result = $result2")

    v_num1 = 5
    v_num2 = 9
    val result3 = f_apply(v_num1, v_num2, f_multiply)
    println("num1 = $v_num1, num2 = $v_num2, result = $result3")

    val result4 = f_apply(v_num1, v_num2, { x, y -> x + y })
    println("num1 = $v_num1, num2 = $v_num2, result = $result4")
}