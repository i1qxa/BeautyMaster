package com.example.beautymaster.domain.priceRegisterMaterial

import kotlinx.coroutines.flow.Flow

interface PriceRegisterMaterialRepository {

    suspend fun getRegisterListInDateRange(dateStart:String, dateEnd:Int): Flow<List<RegisterItemWithMaterial>>

    suspend fun getLastPriceAtDate(date:String, serviceId:Int):Int

    suspend fun addRegisterRecord(record: MaterialPriceRegisterItem)

}