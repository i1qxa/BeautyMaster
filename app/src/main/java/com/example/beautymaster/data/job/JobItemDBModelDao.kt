package com.example.beautymaster.data.job

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.beautymaster.data.customer.CustomerItemDBModel
import com.example.beautymaster.domain.job.JobItem
import com.example.beautymaster.domain.job.JobItemWithCustomer

@Dao
interface JobItemDBModelDao {

    @Query("SELECT * FROM jobitemdbmodel WHERE customerId = :customerId")
    suspend fun getJobListForCustomer(customerId:Int): LiveData<List<JobItemWithCustomerDBModel>>

    @Query("SELECT * FROM jobitemdbmodel WHERE date >= :dateStart AND date <= :dateEnd")
    suspend fun getJobListInDateRange(dateStart:String, dateEnd:String): LiveData<List<JobItemWithCustomerDBModel>>

    @Query("SELECT * FROM jobitemdbmodel WHERE id = :id")
    suspend fun getJobItem(id:Int): JobItemWithCustomerDBModel

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addJobItem(jobItem: JobItemDBModel)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun editJobItem(jobItem: JobItemDBModel)

    @Query("DELETE FROM jobitemdbmodel WHERE id = :id")
    suspend fun deleteJobItem(id:Int)

}