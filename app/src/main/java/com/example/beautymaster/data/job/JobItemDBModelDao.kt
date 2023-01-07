package com.example.beautymaster.data.job

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.beautymaster.data.customer.CustomerItemDBModel
import com.example.beautymaster.domain.job.JobItem

@Dao
interface JobItemDBModelDao {

    @Query("SELECT * FROM jobitemdbmodel WHERE customer = :customer")
    suspend fun getJobListForCustomer(customer:CustomerItemDBModel): LiveData<List<JobItem>>

    @Query("SELECT * FROM jobitemdbmodel WHERE date >= :dateStart AND date <= :dateEnd")
    suspend fun getJobListInDateRange(dateStart:String, dateEnd:String): LiveData<List<JobItem>>

    @Query("SELECT * FROM jobitemdbmodel WHERE id = :id")
    suspend fun getJobItem(id:Int): JobItem

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addJobItem(jobItem: JobItem)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun editJobItem(jobItem: JobItem)

    @Query("DELETE FROM jobitemdbmodel WHERE id = :id")
    suspend fun deleteJobItem(id:Int)

}