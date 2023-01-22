package com.example.beautymaster.domain.JobElementPriceRegister

import androidx.lifecycle.LiveData

interface JobElementPriceRegisterRepository {

    suspend fun getJobElementRegisterListInDateRange(dateStart:String, dateEnd:String): LiveData<List<JobElementPriceRegisterItem>>

    suspend fun getLastPriceAtDate(date:String, jobElementId: Int):Int

    suspend fun addRegisterRecord(record: JobElementPriceRegisterItem)

    suspend fun editRegisterRecord(record:JobElementPriceRegisterItem)

    suspend fun deleteRegisterRecord(recordId:Int)

}