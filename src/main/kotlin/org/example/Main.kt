package org.example

import java.lang.Exception
import java.time.LocalDateTime
import java.time.ZoneId
import java.time.ZoneOffset
import java.time.ZonedDateTime

fun main(args: Array<String>) {
    val topic = "Questions on new hardware"
    val agenda = "We will discuss how to install new hardware"
    val startTime = LocalDateTime.parse("2021-03-29T14:00:00")
    val durationInMinutes = 90

    createMeeting(topic, agenda, startTime, ZoneId.of("Europe/Moscow"), durationInMinutes)
}

fun createMeeting(topic: String, agenda: String, startTime: LocalDateTime, zoneId: ZoneId, durationInMinutes: Int){
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
            approval_type = MeetingSettings.ApprovalType.automaticallyApprove,
            audio = MeetingSettings.Audio.both,
            auto_recording = MeetingSettings.AutoRecording.local,
    )
    val request = CreateMeetingRequest(
            topic = topic,
            agenda = agenda,
            type = CreateMeetingRequest.MeetingType.scheduledMeeting,
            start_time = toUTC(startTime, zoneId),
            duration = durationInMinutes,
            password = password,
            settings = meetingSettings,
    )

    try {
        val response = apiInstance.createMeeting(token, userId, request)
        println("start time = " + toLocal(response.start_time, zoneId))
        println(response)
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

fun toUTC(input: LocalDateTime, zoneId: ZoneId): ZonedDateTime {
    val zdt = ZonedDateTime.of(input, zoneId)
    val zdt2 = zdt.withZoneSameInstant(ZoneOffset.UTC)
    return zdt2
}


fun toLocal(input: ZonedDateTime?, zoneId: ZoneId): LocalDateTime? {
    val zdt = input?.withZoneSameInstant(zoneId)
    val ldt = zdt?.toLocalDateTime()
    return ldt
}

