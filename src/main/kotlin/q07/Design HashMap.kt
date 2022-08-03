package q07

/**
 * No.706
 */
class `Design HashMap` {

    val arr = arrayOfNulls<Int>(1000001)

    fun put(key: Int, value: Int) {
        arr[key] = value
    }

    fun get(key: Int): Int {
        return arr[key] ?: -1
    }

    fun remove(key: Int) {
        arr[key] = null
    }
}