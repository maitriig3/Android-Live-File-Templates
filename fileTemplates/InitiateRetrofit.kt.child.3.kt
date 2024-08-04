package ${PACKAGE_NAME}.data.remote.response

import com.google.gson.annotations.SerializedName

data class ResponseSample(
    @SerializedName("sample")
    val sample: String,
)
