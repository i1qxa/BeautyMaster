package com.example.beautymaster.domain.priceRegisterService

import com.example.beautymaster.domain.service.ServiceItem
import kotlinx.coroutines.flow.Flow

interface PriceRegisterServiceRepository {

    suspend fun getRegisterListInDateRange(dateStart:String, dateEnd:Int):Flow<List<ServicePriceRegisterItem>>

    suspend fun getLastPriceAtDate(date:String, service:ServiceItem):Int

    suspend fun addRegisterRecord(record:ServicePriceRegisterItem)

}