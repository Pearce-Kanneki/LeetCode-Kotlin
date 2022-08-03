package q07

import java.util.BitSet

/**
 * No.705
 */
class `Design HashSet` {

    /**
     * 較快的解
     */
    class MyHashSet() {

        private data class HashNode(val value: Int, var next: HashNode? = null)

        private val setArray = Array<HashNode?>(1000) { null }

        fun add(key: Int) {
            val hashCode = getHashCode(key)
            val hashNode = setArray[hashCode]
            val keyNode = HashNode(value = key)
            if (hashNode == null) {
                setArray[hashCode] = keyNode
            } else {
                var current = hashNode
                while (current != null) {
                    if (current.value == key) {
                        return
                    } else if (current.next != null) {
                        current = current.next
                    } else {
                        break
                    }
                }
                current?.next = keyNode
            }
        }

        fun remove(key: Int) {
            val hashCode = getHashCode(key)
            val hashNode = setArray[hashCode]
            if (hashNode == null) {
                return
            }


            if (hashNode.value == key) {
                setArray[hashCode] = hashNode.next
            } else {
                var current = hashNode
                var next = hashNode.next
                while (current != null && next != null && next.value != key) {
                    current = next
                    next = next.next
                }

                if (current != null) {
                    current.next = next?.next
                }
            }
        }

        fun contains(key: Int): Boolean {
            val hashCode = getHashCode(key)
            val hashNode = setArray[hashCode]
            if (hashNode != null) {
                var current = hashNode
                while (current != null) {
                    if (current.value == key) {
                        return true
                    }

                    current = current.next
                }
            }

            return false
        }

        private fun getHashCode(key: Int) : Int {
            var hash = 0
            var remainder = key % 1000
            var numerator = key / 1000
            while (numerator > 0) {
                hash += numerator * 31 + remainder
                numerator = numerator / 1000
                remainder = numerator % 1000
            }

            return (hash * 31 + remainder) % 1000
        }
    }

    /**
     *
     */
    val bitset = BitSet(1000001)

    fun add(key: Int) {
        bitset.set(key)
    }

    fun remove(key: Int) {
        bitset.clear(key)
    }

    fun contains(key: Int): Boolean {
        return bitset[key]
    }
}