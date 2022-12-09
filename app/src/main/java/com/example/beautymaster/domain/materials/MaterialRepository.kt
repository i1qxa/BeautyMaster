package com.example.beautymaster.domain.materials

import kotlinx.coroutines.flow.Flow

interface MaterialRepository {

    suspend fun getMaterialItemList(): Flow<List<MaterialItem>>

    suspend fun getMaterialItem(id:Int): MaterialItem

    suspend fun addMaterialItem(materialItem: MaterialItem)

    suspend fun editMaterialItem(materialItem: MaterialItem)

    suspend fun deleteMaterialItem(id:Int)

}