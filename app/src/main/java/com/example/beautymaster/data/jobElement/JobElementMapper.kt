package com.example.beautymaster.data.jobElement

import com.example.beautymaster.domain.jobElement.JobElementItem

class JobElementMapper {
    fun mapMaterialItemToDBModel(jobElementItem: JobElementItem):JobElementItemDBModel{
        return JobElementItemDBModel(
            id = jobElementItem.id,
            name = jobElementItem.name,
            isService = jobElementItem.isService,
            unitOM = jobElementItem.unitOM,
        )
    }

    fun mapDBModelToMaterialItem(jobElementItemDB: JobElementItemDBModel):JobElementItem{
        return JobElementItem(
            id = jobElementItemDB.id,
            name = jobElementItemDB.name,
            isService = jobElementItemDB.isService,
            unitOM = jobElementItemDB.unitOM,
        )
    }

    fun mapListDBModelToListJobElementItem(listDB:List<JobElementItemDBModel>) =
        listDB.map { mapDBModelToMaterialItem(it) }
}