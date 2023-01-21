package com.example.beautymaster.data.materialPriceRegister

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.beautymaster.data.materials.MaterialItemDBModel

@Entity
data class MaterialPriceRegisterItemDBModel(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo
    val id:Int,
    @ColumnInfo
    val materialItem: MaterialItemDBModel,
    @ColumnInfo
    val price:Int,
    @ColumnInfo
    val date:String
)
