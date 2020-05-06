package subtask5
import java.util.*
import kotlin.reflect.KClass

class TelephoneFinder {

    // TODO: Complete the following function
    fun findAllNumbersFromGivenNumber(number: String): Array<String>? {
       val result = ArrayList<String>()
        val keyboard = ArrayList<List<String>>()
        keyboard.add(ArrayList(Arrays.asList("8")))
        keyboard.add(ArrayList(Arrays.asList("2", "4")))
        keyboard.add(ArrayList(Arrays.asList("1", "5", "3")))
        keyboard.add(ArrayList(Arrays.asList("2", "6")))
        keyboard.add(ArrayList(Arrays.asList("1", "5", "7")))
        keyboard.add(ArrayList(Arrays.asList("2", "4", "6", "8")))
        keyboard.add(ArrayList(Arrays.asList("3", "5", "9")))
        keyboard.add(ArrayList(Arrays.asList("4", "8")))
        keyboard.add(ArrayList(Arrays.asList("0", "5", "7", "9")))
        keyboard.add(ArrayList(Arrays.asList("6", "8")))
        for (i in 0 until number.length) {
            if ('0' <= number[i] && number[i] <= '9') {
                val key = number[i] - '0'
                for (j in 0 until keyboard[key].size) {
                    val buf = number.substring(0, i) + keyboard[key][j] + number.substring(i + 1)
                    if (!result.contains(buf)) {
                        result.add(buf)
                    }
                }
            } else {
                return null
            }
        }
        return result.toTypedArray()
    }
}
