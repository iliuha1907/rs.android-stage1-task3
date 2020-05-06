package subtask2

class Combinator {

    // TODO: Complete the following function
    fun checkChooseFromArray(array: Array<Int>): Int? {
       if (array[0] == array[1]) {
            return 1
        }
        val n = array[1]
        var m = 1
        var nFact: Long = 1
        var mFact: Long = 1
        val nmFact: Long = 1
        for (i in 2 until n + 1) {
            nFact *= i.toLong()
        }
        do {
            nFact = 1
            mFact = 1
            m++
            val nm = n - m
            if (nm == 0) {
                return null
            }
            val diff = n - nm
            var temp = n
            for (i in 0 until diff) {
                nFact *= temp.toLong()
                temp--
            }

            for (i in 2 until m + 1) {
                mFact *= i.toLong()
            }

        } while (nFact / mFact != array[0].toLong())
        return m
    }
}
