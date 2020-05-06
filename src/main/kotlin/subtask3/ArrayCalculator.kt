package subtask3

class ArrayCalculator {

    // TODO: Complete the following function
    fun maxProductOf(numberOfItems: Int, itemsFromArray: Array<Any>): Int {
       var numberOfItems = numberOfItems
        val filtered = ArrayList<Int>()
        for (i in itemsFromArray.indices) {
            if (itemsFromArray[i]!!::class == Int::class) {
                filtered.add(itemsFromArray[i] as Int)
            }
        }
        Collections.sort(filtered) { o1, o2 -> Math.abs(o1!!) - Math.abs(o2!!) }
        var prod = 1
        var isUnder0 = false
        var temp = 1
        for (i in filtered.size - 1 downTo -1 + 1) {
            if (numberOfItems == 0) {
                break
            }
            if (filtered[i] < 0) {
                if (numberOfItems > i) {
                    prod *= filtered[i]
                    numberOfItems--
                    continue
                }
                if (!isUnder0) {
                    temp = filtered[i]
                    isUnder0 = true
                } else {
                    if (numberOfItems > 1) {
                        prod *= temp * filtered[i]
                        isUnder0 = false
                        numberOfItems -= 2
                    }
                }

            } else {
                prod *= filtered[i]
                numberOfItems--
            }


        }
        return if (prod == 1) 0 else prod
    }
}
