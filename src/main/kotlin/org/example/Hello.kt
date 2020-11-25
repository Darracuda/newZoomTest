package org.example

import java.lang.Exception
import java.time.LocalDateTime

fun main(args: Array<String>) {
    val apiInstance = MeetingsApi()
    val userId : kotlin.String = "diane.kolpakova@gmail.com" // kotlin.String | The user ID or email address
    val meetingSettings = MeetingSettings(
        host_video = true,
        participant_video = true,
        cn_meeting = false,
        in_meeting = false,
        join_before_host = true,
        mute_upon_entry = true,
        watermark = false,
        use_pmi = false,
        approval_type = 0,
        audio = MeetingSettings.Audio.both,
        auto_recording = MeetingSettings.AutoRecording.local,
    )
    val meeting = Meeting(
        topic = "meeting",
        type = 1,
        start_time = LocalDateTime.parse("2020-03-12T12:02:00"),
        timezone = "Europe/Moscow",
        password = "123pas",
        agenda = "description",
        settings = meetingSettings,
    )
    val body = meeting // object | Meeting object
    try {
        val result : InlineResponse2012 = apiInstance.meetingCreate(userId, body)
        println(result)
    } catch (e: ClientException) {
        println("4xx response calling MeetingsApi#meetingCreate")
        e.printStackTrace()
    } catch (e: ServerException) {
        println("5xx response calling MeetingsApi#meetingCreate")
        e.printStackTrace()
    } catch (e: Exception) {
        println("error")
        e.printStackTrace()
    }
}

