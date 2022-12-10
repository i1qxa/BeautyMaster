package com.example.beautymaster.domain.priceRegisterMaterial

import com.example.beautymaster.domain.materials.MaterialItem
import kotlinx.coroutines.flow.Flow

interface PriceRegisterMaterialRepository {

    suspend fun getRegisterListInDateRange(dateStart:String, dateEnd:Int): Flow<List<MaterialPriceRegisterItem>>

    suspend fun getLastPriceAtDate(date:String, material:MaterialItem):Int

    suspend fun addRegisterRecord(record: MaterialPriceRegisterItem)

}