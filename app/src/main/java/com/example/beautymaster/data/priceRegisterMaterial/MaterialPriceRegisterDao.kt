package com.example.beautymaster.data.priceRegisterMaterial

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.beautymaster.data.materials.MaterialItemDBModel
import kotlinx.coroutines.flow.Flow

@Dao
interface MaterialPriceRegisterDao {

    @Query("SELECT * FROM MATERIALPRICEREGISTERITEMDBMODEL as reg " +
            "WHERE reg.date >= :dateStart AND reg.date <= :dateEnd")
    suspend fun getRegisterListInDateRange(dateStart:String, dateEnd:Int): Flow<List<MaterialPriceRegisterItemDBModel>>

    @Query("SELECT reg.price FROM MATERIALPRICEREGISTERITEMDBMODEL as reg " +
            "WHERE reg.date <= :date AND reg.materialItem = :material ORDER BY reg.date LIMIT 1")
    suspend fun getLastPriceAtDate(date:String, material: MaterialItemDBModel):Int

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addRegisterRecord(record: MaterialPriceRegisterItemDBModel)

}