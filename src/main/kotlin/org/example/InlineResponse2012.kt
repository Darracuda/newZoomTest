package org.example

/**
 *
 * @param MeetingInfo
 * @param host_id ID of the user set as host of meeting
 * @param id Meeting ID, also known as meeting number
 * @param uuid Meeting unique ID
 */
data class InlineResponse2012 (
    val MeetingInfo: MeetingInfo? = null,
    /* ID of the user set as host of meeting */
    val host_id: kotlin.String? = null,
    /* Meeting ID, also known as meeting number */
    val id: kotlin.String? = null,
    /* Meeting unique ID */
    val uuid: kotlin.String? = null
) {

}