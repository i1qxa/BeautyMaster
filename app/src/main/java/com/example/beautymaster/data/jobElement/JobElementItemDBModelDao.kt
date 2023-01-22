package com.example.beautymaster.data.jobElement

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.beautymaster.domain.jobElement.JobElementItem

@Dao
interface JobElementItemDBModelDao {

    @Query("SELECT * FROM JobElementItemDBModel")
    suspend fun getJobElementItemList(): LiveData<List<JobElementItemDBModel>>

    @Query("SELECT * FROM JobElementItemDBModel WHERE isService = 'true'")
    suspend fun getServiceList():LiveData<List<JobElementItemDBModel>>

    @Query("SELECT * FROM JobElementItemDBModel WHERE isService = 'false'")
    suspend fun getMaterialList():LiveData<List<JobElementItemDBModel>>

    @Query("SELECT * FROM JobElementItemDBModel WHERE id = :id")
    suspend fun getJobElementItem(id:Int): JobElementItemDBModel

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addJobElementItem(jobElementItem: JobElementItemDBModel)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun editJobElementItem(jobElementItem: JobElementItemDBModel)

    @Query("DELETE FROM JobElementItemDBModel WHERE id = :id")
    suspend fun deleteJobElementItem(id:Int)

}