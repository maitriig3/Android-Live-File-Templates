package ${PACKAGE_NAME}.data.remote

import in_.mai3.initiateandroid.network.retrofit.NetworkData
import ${PACKAGE_NAME}.data.remote.EndPoints.SAMPLE
import ${PACKAGE_NAME}.data.remote.request.RequestSample
import ${PACKAGE_NAME}.data.remote.response.ResponseSample
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST
import retrofit2.http.Query

interface ApiFunctions {

    @POST(SAMPLE)
    suspend fun sample(
        @Query("task") task: String,
        @Body requestSample: RequestSample
    ): Response<NetworkData<ResponseSample>>


}