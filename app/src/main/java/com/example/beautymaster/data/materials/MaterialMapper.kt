package com.example.beautymaster.data.materials

import com.example.beautymaster.domain.materials.MaterialItem

class MaterialMapper {
    fun mapMaterialItemToDBModel(materialItem: MaterialItem?):MaterialItemDBModel?{
        return if (materialItem == null) null
        else MaterialItemDBModel(
            id = materialItem.id,
            name = materialItem.name,
            unitOM = materialItem.unitOM
        )
    }

    fun mapDBModelToMaterialItem(materialItemDB: MaterialItemDBModel?):MaterialItem?{
        return if (materialItemDB == null) null
        else MaterialItem(
            id = materialItemDB.id,
            name = materialItemDB.name,
            unitOM = materialItemDB.unitOM
        )
    }

    fun mapListDBModelToListMaterialItem(listDB:List<MaterialItemDBModel>) =
        listDB.map { mapDBModelToMaterialItem(it) }
}