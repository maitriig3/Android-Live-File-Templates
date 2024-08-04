package ${PACKAGE_NAME}.data.local.room.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import ${PACKAGE_NAME}.data.local.room.entity.SampleEntity

@Dao
interface SampleDao {

    @Insert
    suspend fun insert(sampleEntity: SampleEntity)

    @Query("select * from sample")
    suspend fun get(): List<SampleEntity>


}