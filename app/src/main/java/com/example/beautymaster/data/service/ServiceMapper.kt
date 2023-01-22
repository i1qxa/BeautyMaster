package com.example.beautymaster.data.service

import com.example.beautymaster.data.materials.MaterialMapper
import com.example.beautymaster.domain.service.ServiceItem

class ServiceMapper {
    val materialMapper = MaterialMapper()
    fun mapServiceItemToDbModel(serviceItem: ServiceItem):ServiceItemDBModel{
        return ServiceItemDBModel(
            id = serviceItem.id,
            name = serviceItem.name,
            listMaterials = serviceItem.listMaterials?.map {
                materialMapper.mapMaterialItemToDBModel(it)
            }
        )
    }
    fun mapDBModelToServiceItem(serviceItemDBModel: ServiceItemDBModel):ServiceItem{
        return ServiceItem(
            id = serviceItemDBModel.id,
            name = serviceItemDBModel.name,
            listMaterials = serviceItemDBModel.listMaterials?.map {
                materialMapper.mapDBModelToMaterialItem(it)
            }
        )
    }
    fun mapListDBModelToListServiceItem(listDB:List<ServiceItemDBModel>):List<ServiceItem>{
        return listDB.map {
            mapDBModelToServiceItem(it)
        }
    }
}