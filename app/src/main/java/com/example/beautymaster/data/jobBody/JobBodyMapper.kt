package com.example.beautymaster.data.jobBody

import com.example.beautymaster.data.materials.MaterialMapper
import com.example.beautymaster.data.service.ServiceMapper
import com.example.beautymaster.domain.jobBody.JobBodyItem

class JobBodyMapper {
    val materialMapper = MaterialMapper()
    val serviceMapper = ServiceMapper()

    fun mapDBToJobBodyItem(jobBodyDB:JobBodyItemDBModel):JobBodyItem{
        return JobBodyItem(
            id = jobBodyDB.id,
            jobId = jobBodyDB.jobId,
            materialItem = jobBodyDB.materialItem?.let { materialMapper.mapDBModelToMaterialItem(it) },
            serviceItem = jobBodyDB.serviceItem?.let { serviceMapper.mapDBModelToServiceItem(it) },
            amount = jobBodyDB.amount,
            price = jobBodyDB.price
        )
    }
    fun mapJobBodyItemToDB(jobBody:JobBodyItem):JobBodyItemDBModel{
        return JobBodyItemDBModel(
            id = jobBody.id,
            jobId = jobBody.jobId,
            materialItem = jobBody.materialItem?.let { materialMapper.mapMaterialItemToDBModel(it) },
            serviceItem = jobBody.serviceItem?.let { serviceMapper.mapServiceItemToDbModel(it) },
            amount = jobBody.amount,
            price = jobBody.price
        )
    }
}