package com.example.beautymaster.domain.materialPriceRegister

import androidx.lifecycle.LiveData

interface MaterialPriceRegisterRepository {

    suspend fun getMaterialRegisterListInDateRange(dateStart:String, dateEnd:String): LiveData<List<MaterialPriceRegisterItem>>

    suspend fun getLastPriceAtDate(date:String, materialItemId: Int):Int

    suspend fun addRegisterRecord(record: MaterialPriceRegisterItem)

    suspend fun editRegisterRecord(record:MaterialPriceRegisterItem)

    suspend fun deleteRegisterRecord(record:MaterialPriceRegisterItem)

}