package ${PACKAGE_NAME}.remote.repository

import android.content.Context
import com.mai3.initiateandroid.network.retrofit.NetworkResult
import com.mai3.initiateandroid.network.retrofit.parseResult
import ${PACKAGE_NAME}.remote.ApiFunctions
import ${PACKAGE_NAME}.remote.request.RequestSample

class NetworkRepository(private val apiFunctions: ApiFunctions, private val context: Context) {


    suspend fun <T> invokeNetworkCall(module: String,task: String, request: Any): NetworkResult<T> {
        return parseResult(
            apiFunctions.sample(task,request as RequestSample)
        )
    }

}