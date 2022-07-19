package q04

/**
 * No.434
 */
class `Number of Segments in a String` {

    fun countSegments(s: String): Int {
        var segmentCount = 0

        for(i in s.indices){
            if((i == 0 || s[i - 1] == ' ') && s[i] != ' '){
                segmentCount++
            }
        }
        return segmentCount
    }

    fun countSegments1(s: String): Int {

        return s.trim().split(' ').filter { it != "" }.size
    }
}