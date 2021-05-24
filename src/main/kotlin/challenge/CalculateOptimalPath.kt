package challenge

fun calculateOptimalPath(array: Array<IntArray>): Int {
    val rows = array.size
    var startFrom = 0
    var total = 0
    for (i in rows - 1 downTo 0) {
        val columns = array[i].size
        for (j in startFrom until columns) {
            total += array[i][j]
            if (i - 1 >= 0 && j + 1 < columns) {
                if (array[i][j + 1] > array[i - 1][j])
                    continue
                startFrom = j
                break
            }
            if (i >= 0) {
                startFrom = if (j + 1 == columns) j else j + 1
                if (i == 0) continue else break
            }
        }
    }
    return total
}