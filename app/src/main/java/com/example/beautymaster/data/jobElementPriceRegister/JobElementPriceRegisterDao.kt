package com.example.beautymaster.data.jobElementPriceRegister

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.beautymaster.data.jobElement.JobElementItemDBModel

@Dao
interface JobElementPriceRegisterDao {

    @Query(
        "SELECT * FROM JobElementPriceRegisterItemDBModel as reg " +
                "WHERE reg.date >= :dateStart AND reg.date <= :dateEnd"
    )
    suspend fun getRegisterListInDateRange(dateStart: String, dateEnd: Int)
            : LiveData<List<JobElementPriceRegisterItemDBModel>>

    @Query(
        "SELECT reg.price FROM JobElementPriceRegisterItemDBModel as reg " +
                "WHERE reg.date <= :date AND reg.jobElementId = :jobElementId ORDER BY reg.date LIMIT 1"
    )
    suspend fun getLastPriceAtDate(date: String, jobElementId: Int): Int

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addRegisterRecord(record: JobElementPriceRegisterItemDBModel)

    @Query("DELETE FROM JobElementPriceRegisterItemDBModel WHERE id = :recordId")
    suspend fun deleteRegisterRecord(recordId: Int)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun editRegisterRecord(record: JobElementPriceRegisterItemDBModel)

}