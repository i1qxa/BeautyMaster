package com.example.beautymaster.data.materials

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.beautymaster.domain.materials.MaterialItem
import kotlinx.coroutines.flow.Flow

@Dao
interface MaterialItemDBModelDao {

    @Query("SELECT * FROM materialitemdbmodel")
    suspend fun getMaterialItemList(): Flow<List<MaterialItem>>

    @Query("SELECT * FROM materialitemdbmodel WHERE id = :id")
    suspend fun getMaterialItem(id:Int): MaterialItem

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addMaterialItem(materialItem: MaterialItem)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun editMaterialItem(materialItem: MaterialItem)

    @Query("DELETE FROM materialitemdbmodel WHERE id = :id")
    suspend fun deleteMaterialItem(id:Int)

}