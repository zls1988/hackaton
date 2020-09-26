package ru.itrequest

import io.ktor.application.*
import io.ktor.response.*
import io.ktor.request.*
import io.ktor.routing.*
import io.ktor.http.*
import io.ktor.locations.*
import io.ktor.features.*
import com.fasterxml.jackson.databind.*
import io.ktor.jackson.*
import kotlin.test.*
import io.ktor.server.testing.*
import java.util.*

class ApplicationTest {
    @Test
    fun testRoot() {
//        withTestApplication({ module(testing = true) }) {
//            handleRequest(HttpMethod.Get, "/").apply {
//                assertEquals(HttpStatusCode.OK, response.status())
//                assertEquals("HELLO WORLD!", response.content)
//            }
//        }
        val date = Date().from("19.09.2020", "dd.MM.yyyy")
        val date1 = Date().from("19.09.2020 - 14:14:24", "dd.MM.yyyy - hh:mm:ss")
        print(date)
    }
}
