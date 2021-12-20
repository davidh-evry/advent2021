private val simpleInput = """
    [1,1]
    [2,2]
    [3,3]
    [4,4]
""".trimIndent()

fun main() {
    val sfNumbers = parseInput(simpleInput)
}

private fun parseInput(simpleInput: String): List<Pair<Any, Any>> {
    simpleInput.split("\n").map(::parseSfNumber)
    TODO()
}

fun parseSfNumber(sfNumberString: String): Pair<Any, Any> {
    val integers = ArrayDeque<Int>()
    val pairs = ArrayDeque<Int>()
    var i = 0
    while (i < sfNumberString.length) {
        when (sfNumberString[i]) {
            '[' -> TODO()
            ']' -> TODO()
            ',' -> TODO()
            else -> {
                var j = i
                while (sfNumberString[i++].isDigit()) {
                }
                integers.add(sfNumberString.substring(i, j).toInt())
                i = j - 1
            }
        }
        i++
    }
    TODO()
}
