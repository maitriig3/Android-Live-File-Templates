package ${PACKAGE_NAME}.remote.request

import com.google.gson.annotations.SerializedName

data class RequestSample(
    @SerializedName("versionsave")
    var versionsave: String,
    @SerializedName("sample")
    val sample: String,
)