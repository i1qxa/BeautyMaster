package com.example.beautymaster.domain.unitOfMeasurement

import kotlinx.coroutines.flow.Flow

interface UnitOMRepository {

    suspend fun getUnitOMList():Flow<List<UnitOMItem>>

    suspend fun getUnitOMItem(id:Int):UnitOMItem

    suspend fun addUnitOMItem(unitOMItem: UnitOMItem)

    suspend fun editUnitOMItem(unitOMItem: UnitOMItem)

    suspend fun deleteUnitOMItem(id:Int)

}