package com.example.beautymaster.data.servicePriceRegister

import com.example.beautymaster.data.service.ServiceMapper
import com.example.beautymaster.domain.servicePriceRegister.ServicePriceRegisterItem

class ServicePriceRegisterMapper {
    val serviceMapper = ServiceMapper()

    fun mapDBModelToServicePriceRegisterItem(dbRecord:ServicePriceRegisterItemDBModel)
    :ServicePriceRegisterItem{
        return ServicePriceRegisterItem(
            id = dbRecord.id,
            date = dbRecord.date,
            price = dbRecord.price,
            serviceItem = serviceMapper.mapDBModelToServiceItem(dbRecord.serviceItem)
        )
    }
    fun mapServicePriceRegisterItemToDBModel(record:ServicePriceRegisterItem)
            :ServicePriceRegisterItemDBModel{
        return ServicePriceRegisterItemDBModel(
            id = record.id,
            date = record.date,
            price = record.price,
            serviceItem = serviceMapper.mapServiceItemToDbModel(record.serviceItem)
        )
    }
    fun mapListDBToListServiceRegister(listDB:List<ServicePriceRegisterItemDBModel>)
    :List<ServicePriceRegisterItem>{
        return listDB.map {
            mapDBModelToServicePriceRegisterItem(it)
        }
    }
}