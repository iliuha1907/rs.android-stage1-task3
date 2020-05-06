package subtask1

class PolynomialConverter {

    // TODO: Complete the following function
    fun convertToStringFrom(numbers: Array<Int>): String? {
       val sb = StringBuilder()
        val last = numbers.size - 1
        for (i in numbers.indices) {
            if (numbers[i] == 0) {
                continue
            }
            if (numbers[i] > 0) {
                if (i != 0) {
                    if (Math.abs(numbers[i]) == 1) {
                        sb.append(" + ")
                    } else {
                        sb.append(" + " + Math.abs(numbers[i]))
                    }
                } else {
                    sb.append(Math.abs(numbers[i]))
                }
            } else {
                if (Math.abs(numbers[i]) == 1) {
                    sb.append(" - ")
                } else {
                    sb.append(" - " + Math.abs(numbers[i]))
                }
            }
            val deg = last - i
            if (deg > 1) {
                sb.append("x^$deg")
            } else if (deg == 1) {
                sb.append("x")
            }
        }
        return if (sb.toString() == "") null else sb.toString()
    }
}
