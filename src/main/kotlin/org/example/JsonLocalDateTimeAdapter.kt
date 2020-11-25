package org.example

import com.squareup.moshi.*
import java.time.*


class JsonLocalDateTimeAdapter : JsonAdapter<LocalDateTime>() {

    override fun toJson(writer: JsonWriter, input: LocalDateTime?) {
        writer.value("ddd")
        val a = 3
    }

    override fun fromJson(p0: JsonReader): LocalDateTime? {
        return LocalDateTime.now()
    }
}
