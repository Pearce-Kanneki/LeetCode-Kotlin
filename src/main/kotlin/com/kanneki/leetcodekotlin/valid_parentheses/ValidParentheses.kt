package com.kanneki.leetcodekotlin.valid_parentheses



class ValidParentheses {

    fun isValid(s: String): Boolean {

        val stack = ArrayDeque<Char>()
        s.forEach {
            when(it) {
                '(', '[', '{' -> stack.push(it)
                ')' -> if (stack.poll() != '(') return false
                '}' -> if (stack.poll() != '{') return false
                ']' -> if (stack.poll() != '[') return false
            }
        }

        return stack.isEmpty()

    }

    fun isValid2(s: String): Boolean {

        if(s.length % 2 != 0) return false
        val brackets = mapOf(')' to '(', '}' to '{', ']' to '[')

        val opened = arrayListOf<Char>()
        for(c in s) {
            if(c in brackets.values) {
                opened.add(c)
            } else if(opened.size == 0 || brackets.get(c) != opened.removeAt(opened.size - 1)) {
                return false
            }
        }
        return opened.isEmpty()

    }

    /**
     * 閱讀性較差
     */
    fun isValid3(s: String): Boolean {

        var tmp = s
        val stack = mutableListOf<String>()

        while (tmp.isNotEmpty()) {
            when(tmp.substring(0,1)) {
                "(","[","{" -> stack.add(tmp.substring(0,1))
                ")" -> {
                    if (stack.lastOrNull() != "("){
                        return false
                    } else {
                        stack.removeAt(stack.size - 1)
                    }

                }
                "]" -> {
                    if (stack.lastOrNull() != "["){
                        return false
                    } else {
                        stack.removeAt(stack.size - 1)
                    }

                }
                "}" -> {
                    if (stack.lastOrNull() != "{"){
                        return false
                    } else {
                        stack.removeAt(stack.size - 1)
                    }
                }
            }

            tmp = tmp.removeRange(0,1)
        }

        return stack.isNullOrEmpty()

    }
}