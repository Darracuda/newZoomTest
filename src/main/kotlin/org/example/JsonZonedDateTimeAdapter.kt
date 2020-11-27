package org.example

import com.squareup.moshi.*
import java.lang.Exception
import java.time.*
import java.time.format.DateTimeFormatter


class JsonZonedDateTimeAdapter : JsonAdapter<ZonedDateTime>() {

    override fun toJson(writer: JsonWriter, input: ZonedDateTime?) {
        val s = input?.format(DateTimeFormatter.ISO_INSTANT)
        writer.value(s)
    }

    override fun fromJson(reader: JsonReader): ZonedDateTime? {
        val s = reader.readJsonValue() as CharSequence
        if (!s.endsWith("Z")) {
            throw IllegalArgumentException("Unable to convert DateTime from Json")
        }
        val zdt = ZonedDateTime.parse(s)
        return zdt

    }
}
