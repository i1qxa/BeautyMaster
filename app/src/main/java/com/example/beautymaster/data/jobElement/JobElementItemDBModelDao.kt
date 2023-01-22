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
    suspend fun getJobElementItemList(): LiveData<List<JobElementItem>>

    @Query("SELECT * FROM JobElementItemDBModel WHERE id = :id")
    suspend fun getJobElementItem(id:Int): JobElementItem

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addJobElementItem(jobElementItem: JobElementItem)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun editJobElementItem(jobElementItem: JobElementItem)

    @Query("DELETE FROM JobElementItemDBModel WHERE id = :id")
    suspend fun deleteJobElementItem(id:Int)

}