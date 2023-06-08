

fun main() {
    println("Hello World")
    println(averageArray(arrayOf(1, 2, 2, 4, 4)))
    println(averageArray(arrayOf(1, -2, -2, 4, 4)))
    println(checkValueExistence(arrayOf(1, 2, 2, 4, 4), 8))
    println(reverseArray(arrayOf(1, 2, 3, 4, 5, 6, 7)))
}

fun averageArray(inputArray: Array<Int>): Double {
    var listSum = 0.0
    // val x: IntArray = intArrayOf(1, 2,2,4,4)
    for (datax in inputArray) {
        listSum += datax
    }
    return listSum / inputArray.size
}

fun checkValueExistence(valueList: Array<Int>, value: Int): Boolean {
    for (x in valueList) {
        if (x == value) {
            return true
        }
    }
    return false
}

fun reverseArray(inputArray: Array<Int>): MutableList<Int> {
    // val result = Array(inputArray.size) { 0 }
    // println(inputArray)
    var list1 = MutableList<Int>(inputArray.size) { 0 }
    // print(list1)
    list1.add(1)
    // val stack = ArrayDeque<Int>()
    // var index = inputArray.size - 1
    // for (num in inputArray) {
    //     print("adding")
    //     list1.add(index--, num)
    //     index--
    // }
    // var index = 0
    // while (stack.isNotEmpty()) {
    //     result[index++] = stack.removeLast()
    // }
    return list1
}
