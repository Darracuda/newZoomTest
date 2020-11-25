package org.example

class MeetingsApi(basePath: kotlin.String = "https://api.zoom.us/v2") : ApiClient(basePath) {
    /**
     * Create a meeting
     * Create a meeting for a user &lt;aside&gt;The expiration time of start_url is two hours. But for API users, the expiration time is 90 days.&lt;/aside&gt;
     * @param userId The user ID or email address
     * @param body Meeting object
     * @return InlineResponse2012
     */
    @Suppress("UNCHECKED_CAST")
    fun meetingCreate(userId: kotlin.String, body: kotlin.Any?) : InlineResponse2012 {
        val localVariableBody: kotlin.Any? = body
        val localVariableQuery: MultiValueMap = mapOf()

        val contentHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val acceptsHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf("Accept" to "application/json, application/xml")
        val localVariableHeaders: kotlin.collections.MutableMap<kotlin.String,kotlin.String> = mutableMapOf()
        localVariableHeaders.putAll(contentHeaders)
        localVariableHeaders.putAll(acceptsHeaders)

        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/users/{userId}/meetings".replace("{"+"userId"+"}", "$userId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<InlineResponse2012>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as InlineResponse2012
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }
}