package org.example

/**
 *
 * @param MeetingInfo
 * @param host_id ID of the user set as host of meeting
 * @param id Meeting ID, also known as meeting number
 * @param uuid Meeting unique ID
 */
data class CreateMeetingResponse (
    val MeetingInfo: MeetingInfo? = null,
    /* ID of the user set as host of meeting */
    val host_id: kotlin.String? = null,
    /* Meeting ID, also known as meeting number */
    val id: kotlin.String? = null,
    /* Meeting unique ID */
    val uuid: kotlin.String? = null,
    /* Meeting start time */
    //val start_time: java.time.LocalDateTime? = null,
    /* Create time */
    //val created_at: java.time.LocalDateTime? = null,
    /* Start url */
    val start_url: kotlin.String? = null,
    /* Join url */
    val join_url: kotlin.String? = null,
) {

}