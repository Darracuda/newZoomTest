package org.example

/**
 * Meeting object
 * @param topic Meeting topic
 * @param type Meeting Type
 * @param start_time Meeting start time
 * @param duration Meeting duration
 * @param timezone Timezone to format start_time
 * @param created_at Create time
 * @param agenda Agenda
 * @param start_url Start url
 * @param join_url Join url
 * @param password Meeting password
 * @param h323_password H.323/SIP room system password
 * @param tracking_fields Tracking fields
 * @param occurrences
 * @param settings
 */
data class MeetingInfo (
    /* Meeting topic */
    val topic: kotlin.String? = null,
    /* Meeting Type */
    val type: kotlin.Int? = null,
    /* Meeting start time */
    val start_time: java.time.LocalDateTime? = null,
    /* Meeting duration */
    val duration: kotlin.Int? = null,
    /* Timezone to format start_time */
    val timezone: kotlin.String? = null,
    /* Create time */
    val created_at: java.time.LocalDateTime? = null,
    /* Agenda */
    val agenda: kotlin.String? = null,
    /* Start url */
    val start_url: kotlin.String? = null,
    /* Join url */
    val join_url: kotlin.String? = null,
    /* Meeting password */
    val password: kotlin.String? = null,
    /* H.323/SIP room system password */
    val h323_password: kotlin.String? = null,
    /* Tracking fields */
    val tracking_fields: kotlin.Array<MeetingInfoTrackingFields>? = null,
    val occurrences: Occurrences? = null,
    val settings: MeetingSettings? = null
) {

}