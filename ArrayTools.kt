

fun main() {
    println("Hello World")
    println(averageArray(arrayOf(1, 2, 2, 4, 4)))
    println(averageArray(arrayOf(1, -2, -2, 4, 4)))
    println(checkValueExistence(arrayOf(1, 2, 2, 4, 4), 8))
    println(reverseArray(arrayOf(1, 2, 3, 4, 5, 6, 7, 34, 28)))
    val ciphertext = caesarCipherFunc()
    println(ciphertext)
}

fun averageArray(inputArray: Array<Int>): Double {
    var listSum = 0.0
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
    var reversedList = MutableList<Int>(inputArray.size) { 0 }
    var index = inputArray.size - 1
    println(index)
    for (num in inputArray) {
        reversedList[index] = num
        index--
    }
    return reversedList
}

fun caesarCipherFunc(): String {
    try {
        val shiftedText = StringBuilder()
        println("Enter input string to encrypt")
        val stringValue = readLine()
        println("Enter the shift value")
        val shift = readLine()?.toInt()
        if (!stringValue.isNullOrEmpty() && shift != null) {
            for (char in stringValue) {
                if (char.isLetter()) {
                    val startOffset = if (char.isUpperCase()) 'A' else 'a'
                    val shiftedChar = (((char.toInt() - startOffset.toInt()) + shift) % 26 + startOffset.toInt()).toChar()
                    shiftedText.append(shiftedChar)
                } else {
                    shiftedText.append(char)
                }
            }
        }

        return shiftedText.toString()
    } catch (e: NumberFormatException) {
        return "Invalid input entered"
    }
}
