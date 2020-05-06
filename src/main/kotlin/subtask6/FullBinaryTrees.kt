package subtask6

class FullBinaryTrees {

    // TODO: Complete the following function
    fun stringForNodeCount(count: Int): String {
        if(count == 1){
            return "[[0]]"
        }
        if(count%2==0 || count == 0){
            return "[]"
        }
        return "[]"
    }
}
