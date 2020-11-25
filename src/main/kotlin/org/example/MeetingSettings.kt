package org.example

import com.squareup.moshi.Json

/**
 * Meeting Settings
 * @param host_video Start video when host joins meeting
 * @param participant_video Start video when participants join meeting
 * @param cn_meeting Host meeting in China
 * @param in_meeting Host meeting in India
 * @param join_before_host Allow participants to join the meeting before the host starts the meeting. Only used for scheduled or recurring meetings.
 * @param mute_upon_entry Mute participants upon entry
 * @param watermark Add watermark when viewing shared screen
 * @param use_pmi Use Personal Meeting ID. Only used for scheduled meetings and recurring meetings with no fixed time.
 * @param approval_type
 * @param registration_type Registration type. Used for recurring meeting with fixed time only.
 * @param audio Determine how participants can join the audio portion of the meeting
 * @param auto_recording
 * @param enforce_login Only signed-in users can join this meeting
 * @param enforce_login_domains Only signed-in users with specified domains can join meetings
 * @param alternative_hosts Alternative hosts emails or IDs. Multiple value separated by comma.
 * @param close_registration Close registration after event date
 * @param waiting_room Enable waiting room
 */
data class MeetingSettings (
    /* Start video when host joins meeting */
    val host_video: kotlin.Boolean? = null,
    /* Start video when participants join meeting */
    val participant_video: kotlin.Boolean? = null,
    /* Host meeting in China */
    val cn_meeting: kotlin.Boolean? = null,
    /* Host meeting in India */
    val in_meeting: kotlin.Boolean? = null,
    /* Allow participants to join the meeting before the host starts the meeting. Only used for scheduled or recurring meetings. */
    val join_before_host: kotlin.Boolean? = null,
    /* Mute participants upon entry */
    val mute_upon_entry: kotlin.Boolean? = null,
    /* Add watermark when viewing shared screen */
    val watermark: kotlin.Boolean? = null,
    /* Use Personal Meeting ID. Only used for scheduled meetings and recurring meetings with no fixed time. */
    val use_pmi: kotlin.Boolean? = null,
    val approval_type: kotlin.Int? = null,
    /* Registration type. Used for recurring meeting with fixed time only. */
    val registration_type: kotlin.Int? = null,
    /* Determine how participants can join the audio portion of the meeting */
    val audio: MeetingSettings.Audio? = null,
    val auto_recording: MeetingSettings.AutoRecording? = null,
    /* Only signed-in users can join this meeting */
    val enforce_login: kotlin.Boolean? = null,
    /* Only signed-in users with specified domains can join meetings */
    val enforce_login_domains: kotlin.String? = null,
    /* Alternative hosts emails or IDs. Multiple value separated by comma. */
    val alternative_hosts: kotlin.String? = null,
    /* Close registration after event date */
    val close_registration: kotlin.Boolean? = null,
    /* Enable waiting room */
    val waiting_room: kotlin.Boolean? = null
) {

    /**
     * Determine how participants can join the audio portion of the meeting
     * Values: both,telephony,voip
     */
    enum class Audio(val value: kotlin.String){

        @Json(name = "both") both("both"),

        @Json(name = "telephony") telephony("telephony"),

        @Json(name = "voip") voip("voip");

    }

    /**
     *
     * Values: local,cloud,none
     */
    enum class AutoRecording(val value: kotlin.String){

        @Json(name = "local") local("local"),

        @Json(name = "cloud") cloud("cloud"),

        @Json(name = "none") none("none");

    }

}
