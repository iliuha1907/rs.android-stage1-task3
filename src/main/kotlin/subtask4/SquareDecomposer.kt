package subtask4

class SquareDecomposer {

    // TODO: Complete the following function
   fun decomposeNumber(number: Int): Array<Int>? {
        return decomposeNumber2(number * number, number - 1)
    }

    fun decomposeNumber2(sqNumber: Int, number: Int): Array<Int>? {
        for (i in number downTo 1) {
            val value = i * i
            val diff = sqNumber - value


            if (diff == 0) return arrayOf(i)

            if (diff < 0) return null

            var sqrt = Math.sqrt(diff.toDouble()).toInt()

            if (sqrt >= i) sqrt = i - 1

            val decomposed = decomposeNumber2(diff, sqrt)

            if (decomposed != null) return concat(decomposed, arrayOf(i))
        }
        return null
    }

    fun concat(arr1: Array<Int> , arr2: Array<Int> ): Array<Int>? {
        val res = Array<Int>(arr1.size + arr2.size,{0})
        var k = 0
        for (i in arr1.indices) {
            res[k++] = arr1[i]
        }
        for (i in arr2.indices) {
            res[k++] = arr2[i]
        }
        return res
    }
}
