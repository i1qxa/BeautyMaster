package com.example.beautymaster.domain.servicePriceRegister

import androidx.lifecycle.LiveData

interface ServicePriceRegisterRepository {

    suspend fun getServiceRegisterListInDateRange(dateStart:String, dateEnd:String):LiveData<List<ServicePriceRegisterItem>>

    suspend fun getLastPriceAtDate(date:String, serviceItemId:Int):Int

    suspend fun addServiceRegisterRecord(record:ServicePriceRegisterItem)

    suspend fun editServiceRegisterRecord(record:ServicePriceRegisterItem)

    suspend fun deleteServiceRegisterRecord(recordId:Int)

}