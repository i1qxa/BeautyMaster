package com.example.beautymaster.data.service

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.beautymaster.data.materials.MaterialItemDBModel

@Entity
data class ServiceItemDBModel(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo
    val id : Int,
    @ColumnInfo
    val name : String,
    @ColumnInfo
    val listMaterials : List<MaterialItemDBModel>?
)
