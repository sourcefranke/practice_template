package com.github.sourcefranke.practice.template

import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat

class LogicTest {

    @Test
    fun test() {
        assertThat(helloWorld()).isEqualTo("Hello World!")
        assertThat(helloWorld("Ok")).isEqualTo("Hello Ok!")
    }
}
