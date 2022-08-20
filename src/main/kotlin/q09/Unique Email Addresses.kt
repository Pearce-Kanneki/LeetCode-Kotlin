package q09

/**
 * No.929
 */
class `Unique Email Addresses` {

    fun numUniqueEmails(emails: Array<String>): Int {
        val uniqueMails = mutableSetOf<String>()
        emails.forEach {
            val parts = it.split("@")
            val localName = parts[0].replace(".","")
            val plus = localName.indexOf('+')
            if (plus != -1) uniqueMails.add(localName.substring(0, plus) + "@" + parts[1])
            else uniqueMails.add(localName + "@" + parts[1])
        }
        return uniqueMails.size
    }
}