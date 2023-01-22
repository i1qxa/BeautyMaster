package com.example.beautymaster.data.jobBody

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.beautymaster.domain.jobBody.JobBodyItem

@Dao
interface JobBodyItemDBModelDao {
    @Query("SELECT * FROM jobbodyitemdbmodel WHERE jobId = :jobId")
    suspend fun getJobBodyList(jobId:Int):LiveData<List<JobBodyItemDBModel>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addJobBodyItem(item: JobBodyItemDBModel)

    @Delete
    suspend fun deleteJobBodyItem(itemId:Int)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun editJobBodyItem(item: JobBodyItemDBModel)
}