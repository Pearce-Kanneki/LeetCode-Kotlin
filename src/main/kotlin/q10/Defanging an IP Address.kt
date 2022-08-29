package q10

/**
 * No.1108
 */
class `Defanging an IP Address` {
    
    /**
     *
     */
    fun defangIPaddr(address: String): String {
        val b = StringBuilder()
        for(ch in address) {
            b.append(if(ch == '.') "[.]" else ch)
        }
        return b.toString()
    }

    /**
     *
     */
    fun defangIPaddr1(address: String): String {
        return address.replace(".","[.]")
    }
}