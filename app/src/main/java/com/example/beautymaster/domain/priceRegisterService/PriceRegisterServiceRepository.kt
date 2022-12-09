package com.example.beautymaster.domain.priceRegisterService

import kotlinx.coroutines.flow.Flow

interface PriceRegisterServiceRepository {

    suspend fun getRegisterListInDateRange(dateStart:String, dateEnd:Int):Flow<List<RegisterItemWithService>>

    suspend fun getLastPriceAtDate(date:String, serviceId:Int):Int

    suspend fun addRegisterRecord(record:ServicePriceRegisterItem)

}