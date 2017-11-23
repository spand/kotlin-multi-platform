package org.example.kotlin

import org.example.common.Foo

val app: Appendable = StringBuilder()

class Fooster {
    fun get(){
        Foo("Wee", app)
    }
}
