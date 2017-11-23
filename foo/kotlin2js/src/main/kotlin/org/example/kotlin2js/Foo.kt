package org.example.kotlin2js

import org.example.common.Foo
import kotlin.browser.window

fun main(args: Array<String>) {
    val foo = Foo("Wee", StringBuilder())
    window.alert(foo.toString())
}
