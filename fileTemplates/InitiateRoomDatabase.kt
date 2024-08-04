package ${PACKAGE_NAME}.data.local.room

import androidx.room.Database
import androidx.room.RoomDatabase
import ${PACKAGE_NAME}.data.local.room.dao.SampleDao
import ${PACKAGE_NAME}.data.local.room.entity.SampleEntity

@Database(entities = [SampleEntity::class], version = 1)
abstract class AppDatabase : RoomDatabase(){
    abstract fun sampleDao(): SampleDao

}