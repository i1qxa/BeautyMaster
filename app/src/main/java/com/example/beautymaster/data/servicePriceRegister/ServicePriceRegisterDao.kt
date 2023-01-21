package com.example.beautymaster.data.servicePriceRegister

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.beautymaster.data.service.ServiceItemDBModel
import com.example.beautymaster.domain.servicePriceRegister.ServicePriceRegisterItem

@Dao
interface ServicePriceRegisterDao {

    @Query("SELECT * FROM ServicePriceRegisterItemDBModel as reg WHERE " +
            "reg.date > :dateStart AND reg.date <= :dateEnd")
    suspend fun getRegisterListInDateRange(dateStart:String, dateEnd:String):List<ServicePriceRegisterItem>

    @Query("SELECT reg.price FROM ServicePriceRegisterItemDBModel as reg WHERE " +
            "reg.serviceItem = :serviceItem AND reg.date <= date ORDER BY reg.date")
    suspend fun getLastPriceAtDate(serviceItem:ServiceItemDBModel, date:String):Int

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addRegisterRecord(record:ServicePriceRegisterItemDBModel)

    @Delete
    suspend fun deleteRegisterRecord(record: ServicePriceRegisterItemDBModel)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun editRegisterRecord(record:ServicePriceRegisterItemDBModel)

}