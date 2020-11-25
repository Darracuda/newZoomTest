package org.example

/**
 * Meeting object
 */
data class Meeting (
    /* Meeting topic */
    val topic: kotlin.String? = null,
    /* Meeting Type */
    val type: kotlin.Int? = null,
    /* Meeting start time. When using a format like \"yyyy-MM-dd'T'HH:mm:ss'Z'\", always use GMT time. When using a format like \"yyyy-MM-dd'T'HH:mm:ss\", you should use local time and you will need to specify the time zone. Only used for scheduled meetings and recurring meetings with fixed time. */

    val start_time: java.time.LocalDateTime? = null,
    /* Meeting duration (minutes). Used for scheduled meetings only */
    val duration: kotlin.Int? = null,
    /* Timezone to format start_time. For example, \"America/Los_Angeles\". For scheduled meetings only. Please reference our [timezone](#timezones) list for supported timezones and their formats. */
    val timezone: kotlin.String? = null,
    /* Password to join the meeting. Password may only contain the following characters: [a-z A-Z 0-9 @ - _ *]. Max of 10 characters. */
    val password: kotlin.String? = null,
    /* Meeting description */
    val agenda: kotlin.String? = null,
    /* Tracking fields */
    val tracking_fields: kotlin.Array<MeetingInfoTrackingFields>? = null,
    val settings: MeetingSettings? = null
) {

}