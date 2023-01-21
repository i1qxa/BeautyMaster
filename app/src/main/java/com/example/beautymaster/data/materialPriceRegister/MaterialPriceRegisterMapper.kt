package com.example.beautymaster.data.materialPriceRegister

import com.example.beautymaster.data.materials.MaterialMapper
import com.example.beautymaster.domain.materialPriceRegister.MaterialPriceRegisterItem

class MaterialPriceRegisterMapper {
    val materialMapper = MaterialMapper()
    fun mapPriceRegisterDBToPriceRegister(priceRegisterDB:MaterialPriceRegisterItemDBModel):
            MaterialPriceRegisterItem{
        return MaterialPriceRegisterItem(
            id = priceRegisterDB.id,
            materialItem = materialMapper.mapDBModelToMaterialItem(priceRegisterDB.materialItem),
            price = priceRegisterDB.price,
            date = priceRegisterDB.date
        )
    }
    fun mapPriceRegisterToPriceRegisterDB(priceRegister:MaterialPriceRegisterItem):
            MaterialPriceRegisterItemDBModel{
        return MaterialPriceRegisterItemDBModel(
            id = priceRegister.id,
            materialItem = materialMapper.mapMaterialItemToDBModel(priceRegister.materialItem),
            price = priceRegister.price,
            date = priceRegister.date
        )
    }
    fun mapListDBToListMaterialPriceRegisterItem(listDB:List<MaterialPriceRegisterItemDBModel>):
            List<MaterialPriceRegisterItem>{
        return listDB.map {
            mapPriceRegisterDBToPriceRegister(it)
        }
    }
}