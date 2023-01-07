package com.example.beautymaster.domain.priceRegister

import androidx.lifecycle.LiveData
import com.example.beautymaster.domain.jobBody.JobBodyElement

interface PriceRegisterRepository {

    suspend fun getRegisterListInDateRange(dateStart:String, dateEnd:Int): LiveData<List<PriceRegisterItem>>

    suspend fun getLastPriceAtDate(date:String, element: JobBodyElement):Int

    suspend fun addRegisterRecord(record: PriceRegisterItem)

}