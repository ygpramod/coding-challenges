package challenge

data class LongestUniformSubstring(val start: Int, val length: Int)

fun longestUniformSubstring(string: String): LongestUniformSubstring {
    var pair = LongestUniformSubstring(start = -1, length = 0)
    var i = 0
    while (i < string.length) {
        var length = 0
        for (j in i until string.length) {
            if (string[i] == string[j]) length += 1
            else {
                i = j - 1
                break
            }
            if (pair.length < length)
                pair = LongestUniformSubstring(start = i, length = length)
        }
        i++
    }
    return pair
}