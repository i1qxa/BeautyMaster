package com.example.beautymaster.data.materialPriceRegister

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.beautymaster.data.materials.MaterialItemDBModel

@Dao
interface MaterialPriceRegisterDao {

    @Query("SELECT * FROM MaterialPriceRegisterItemDBModel as reg " +
            "WHERE reg.date >= :dateStart AND reg.date <= :dateEnd")
    suspend fun getRegisterListInDateRange(dateStart:String, dateEnd:Int): LiveData<List<MaterialPriceRegisterItemDBModel>>

    @Query("SELECT reg.price FROM MaterialPriceRegisterItemDBModel as reg " +
            "WHERE reg.date <= :date AND reg.materialItem = :materialItem ORDER BY reg.date LIMIT 1")
    suspend fun getLastPriceAtDate(date:String, materialItem: MaterialItemDBModel):Int

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addRegisterRecord(record: MaterialPriceRegisterItemDBModel)

    @Delete
    suspend fun deleteRegisterRecord(record: MaterialPriceRegisterItemDBModel)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun editRegisterRecord(record:MaterialPriceRegisterItemDBModel)

}