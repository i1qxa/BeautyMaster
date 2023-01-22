package com.example.beautymaster.data

import android.app.Application
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.beautymaster.data.customer.CustomerItemDBModel
import com.example.beautymaster.data.customer.CustomerItemDBModelDao
import com.example.beautymaster.data.job.JobItemDBModel
import com.example.beautymaster.data.job.JobItemDBModelDao
import com.example.beautymaster.data.jobBody.JobBodyItemDBModel
import com.example.beautymaster.data.jobBody.JobBodyItemDBModelDao
import com.example.beautymaster.data.jobElement.JobElementItemDBModel
import com.example.beautymaster.data.jobElement.JobElementItemDBModelDao
import com.example.beautymaster.data.jobElementPriceRegister.JobElementPriceRegisterDao
import com.example.beautymaster.data.jobElementPriceRegister.JobElementPriceRegisterItemDBModel
import kotlinx.coroutines.InternalCoroutinesApi
import kotlinx.coroutines.internal.synchronized

@Database(
    entities = [
        CustomerItemDBModel::class,
        JobItemDBModel::class,
        JobBodyItemDBModel::class,
        JobElementItemDBModel::class,
        JobElementPriceRegisterItemDBModel::class,
        ],
    version = 1, exportSchema = false
)

abstract class AppDatabase : RoomDatabase() {
    abstract fun customerItemDBModelDao(): CustomerItemDBModelDao
    abstract fun jobItemDBModelDao(): JobItemDBModelDao
    abstract fun jobBodyItemDBModelDao(): JobBodyItemDBModelDao
    abstract fun jobElementItemDBModelDao(): JobElementItemDBModelDao
    abstract fun jobElementPriceRegisterDao(): JobElementPriceRegisterDao

    companion object {
        private var INSTANCE: AppDatabase? = null
        private val LOCK = Any()
        private const val DB_NAME = "beauty_master_db"

        @OptIn(InternalCoroutinesApi::class)
        fun getInstance(application: Application): AppDatabase {
            INSTANCE?.let {
                return it
            }
            synchronized(LOCK) {
                INSTANCE?.let {
                    return it
                }
                val db = Room.databaseBuilder(
                    application,
                    AppDatabase::class.java,
                    DB_NAME
                ).build()
                INSTANCE = db
                return db
            }
        }
    }
}