package com.example.beautymaster.domain.priceRegisterMaterial

import androidx.lifecycle.LiveData
import com.example.beautymaster.domain.jobBody.JobBodyElement
import com.example.beautymaster.domain.materials.MaterialItem

interface PriceRegisterRepository {

    suspend fun getRegisterListInDateRange(dateStart:String, dateEnd:Int): LiveData<List<PriceRegisterItem>>

    suspend fun getLastPriceAtDate(date:String, element: JobBodyElement):Int

    suspend fun addRegisterRecord(record: PriceRegisterItem)

}