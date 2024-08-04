package ${PACKAGE_NAME}.di

import android.app.Application
#if (${Initiate_Retrofit} == "true")
import in_.mai3.initiateandroid.network.retrofit.InitializeRetrofit
import ${PACKAGE_NAME}.data.remote.ApiFunctions
import ${PACKAGE_NAME}.data.remote.EndPoints.BASE_URL
import ${PACKAGE_NAME}.data.remote.repository.NetworkRepository
#end
#if (${Initiate_Room_Database} == "true")
import ${PACKAGE_NAME}.data.local.room.AppDatabase
import androidx.room.Room
#end
#if (${Initiate_Shared_Preferences} == "true")
import ${PACKAGE_NAME}.data.local.preferences.PreferencesRepository
import ${PACKAGE_NAME}.data.local.preferences.PreferencesRepositoryImpl
import android.content.SharedPreferences
import android.content.SharedPreferences.Editor
import android.content.Context
#end
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    #if (${Initiate_Retrofit} == "true")
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

   #if (${Initiate_Room_Database} == "true")
   @Provides
   @Singleton
   fun providesAppDatabase(context: Application): AppDatabase{
       return Room.databaseBuilder(
           context,
           AppDatabase::class.java,
           "#[[$DATABASE_NAME$]]#"
       ).build()
   }
   #end
    
    #if (${Initiate_Shared_Preferences} == "true")
    @Provides
    @Singleton
    fun providesPreferences(context: Application): SharedPreferences{
        return context.getSharedPreferences("#[[$PREFERENCES_NAME$]]#", Context.MODE_PRIVATE)
    }

    @Provides
    @Singleton
    fun providesEditor(sharedPreferences: SharedPreferences): Editor{
        return sharedPreferences.edit()
    }

    @Provides
    @Singleton
    fun providesPreferenceRepository(sharedPreferences: SharedPreferences,editor: Editor): PreferencesRepository{
        return PreferencesRepositoryImpl(sharedPreferences, editor)
    }
    #end
}



