package ${PACKAGE_NAME}.di

import android.app.Application
#if (${InitiateRetrofit} == "true")
import com.mai3.initiateandroid.network.retrofit.InitializeRetrofit
import ${PACKAGE_NAME}.remote.ApiFunctions
import ${PACKAGE_NAME}.remote.EndPoints.BASE_URL
import ${PACKAGE_NAME}.remote.repository.NetworkRepository
#end
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    #if (${InitiateRetrofit} == "true")
    @Provides
    @Singleton
    fun providesRetrofitBuilder(): ApiFunctions {
        return InitializeRetrofit.retrofitBuilder(
            BASE_URL,
            ApiFunctions::class.java
        )
    }
   
    @Provides
    @Singleton
    fun providesNetworkRepository(apiFunctions: ApiFunctions, context: Application): NetworkRepository {
        return NetworkRepository(apiFunctions,context)
    }
    #end

   
    
}



