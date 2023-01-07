package com.example.beautymaster.domain.materials

import androidx.lifecycle.LiveData

interface MaterialRepository {

    suspend fun getMaterialItemList(): LiveData<List<MaterialItem>>

    suspend fun getMaterialItem(id:Int): MaterialItem

    suspend fun addMaterialItem(materialItem: MaterialItem)

    suspend fun editMaterialItem(materialItem: MaterialItem)

    suspend fun deleteMaterialItem(id:Int)

}