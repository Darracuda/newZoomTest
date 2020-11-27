package org.example

import java.time.ZonedDateTime

/**
 *
 * @param MeetingInfo
 * @param host_id ID of the user set as host of meeting
 * @param id Meeting ID, also known as meeting number
 * @param uuid Meeting unique ID
 */
data class CreateMeetingResponse (
    //val MeetingInfo: MeetingInfo? = null,
    /* ID of the user set as host of meeting */
    val host_id: String? = null,
    /* Meeting ID, also known as meeting number */
    val id: String? = null,
    /* Meeting unique ID */
    val uuid: String? = null,
    /* Meeting start time */
    val start_time: ZonedDateTime? = null,
    /* Create time */
    val created_at: ZonedDateTime? = null,
    /* Start url */
    val start_url: String? = null,
    /* Join url */
    val join_url: String? = null,
    val encrypted_password: String? = null,
    val pstn_password: String? = null,
    val host_email: String? = null,
)

