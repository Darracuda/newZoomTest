package org.example

import java.lang.Exception
import java.time.LocalDateTime

fun main(args: Array<String>) {
    val userId = "diane.kolpakova@gmail.com"
    val password = "123pas"
    val token = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJhdWQiOm51bGwsImlzcyI6ImctQ0M4VUdzVFdDNHpmRi0wbkdobWciLCJleHAiOjE2MDY5NDkyNDQsImlhdCI6MTYwNjM0NDQ0NH0.xqp3OwaL-QP74CYE9JSNXShG52p7P5sZFsJl3Xe6a4I"

    val apiInstance = MeetingsApi()
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
    val meeting = CreateMeetingRequest(
        topic = "meeting",
        type = 1,
        start_time = LocalDateTime.parse("2020-03-12T12:02:00"),
        timezone = "Europe/Moscow",
        password = password,
        agenda = "description",
        settings = meetingSettings,
    )
    try {
        val result : CreateMeetingResponse = apiInstance.createMeeting(token, userId, meeting)
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

