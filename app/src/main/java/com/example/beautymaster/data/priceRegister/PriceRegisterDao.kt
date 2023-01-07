package com.example.beautymaster.data.priceRegister

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.beautymaster.data.materials.MaterialItemDBModel

@Dao
interface PriceRegisterDao {

    @Query("SELECT * FROM MATERIALPRICEREGISTERITEMDBMODEL as reg " +
            "WHERE reg.date >= :dateStart AND reg.date <= :dateEnd")
    suspend fun getRegisterListInDateRange(dateStart:String, dateEnd:Int): LiveData<List<PriceRegisterItemDBModel>>

    @Query("SELECT reg.price FROM MATERIALPRICEREGISTERITEMDBMODEL as reg " +
            "WHERE reg.date <= :date AND reg.materialItem = :material ORDER BY reg.date LIMIT 1")
    suspend fun getLastPriceAtDate(date:String, material: MaterialItemDBModel):Int

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addRegisterRecord(record: PriceRegisterItemDBModel)

}