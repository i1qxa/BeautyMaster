package com.example.beautymaster.data.priceRegisterService

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.beautymaster.domain.priceRegisterService.ServicePriceRegisterItem
import com.example.beautymaster.domain.service.ServiceItem
import kotlinx.coroutines.flow.Flow

@Dao
interface PriceRegisterServiceDAO {

    @Query("SELECT * FROM PriceRegisterServiceItemDBModel as reg " +
            "WHERE reg.date >= :dateStart AND reg.date <= :dateEnd")
    suspend fun getRegisterListInDateRange(dateStart:String, dateEnd:Int): Flow<List<ServicePriceRegisterItem>>

    @Query("SELECT reg.price FROM PriceRegisterServiceItemDBModel as reg " +
            "WHERE reg.date <= :date AND reg.service = :service ORDER BY date LIMIT 1")
    suspend fun getLastPriceAtDate(date:String, service: ServiceItem):Int

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addRegisterRecord(record: ServicePriceRegisterItem)

}