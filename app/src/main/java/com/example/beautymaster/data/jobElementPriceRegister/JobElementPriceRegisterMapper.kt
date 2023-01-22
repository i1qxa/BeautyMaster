package com.example.beautymaster.data.jobElementPriceRegister

import com.example.beautymaster.data.jobElement.JobElementMapper
import com.example.beautymaster.domain.JobElementPriceRegister.JobElementPriceRegisterItem

class JobElementPriceRegisterMapper {
    val jobElementMapper = JobElementMapper()
    fun mapPriceRegisterDBToPriceRegister(priceRegisterDB:JobElementPriceRegisterItemDBModel):
            JobElementPriceRegisterItem{
        return JobElementPriceRegisterItem(
            id = priceRegisterDB.id,
            jobElementId = priceRegisterDB.jobElementId,
            price = priceRegisterDB.price,
            date = priceRegisterDB.date
        )
    }
    fun mapPriceRegisterToPriceRegisterDB(priceRegister:JobElementPriceRegisterItem):
            JobElementPriceRegisterItemDBModel{
        return JobElementPriceRegisterItemDBModel(
            id = priceRegister.id,
            jobElementId = priceRegister.jobElementId,
            price = priceRegister.price,
            date = priceRegister.date
        )
    }
    fun mapListDBToListMaterialPriceRegisterItem(listDB:List<JobElementPriceRegisterItemDBModel>):
            List<JobElementPriceRegisterItem>{
        return listDB.map {
            mapPriceRegisterDBToPriceRegister(it)
        }
    }
}