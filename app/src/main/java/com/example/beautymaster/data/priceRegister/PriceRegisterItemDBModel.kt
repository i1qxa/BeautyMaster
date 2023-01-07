package com.example.beautymaster.data.priceRegister

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.beautymaster.domain.materials.MaterialItem

@Entity
data class PriceRegisterItemDBModel(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo
    val id:Int,
    @ColumnInfo
    val materialItem: MaterialItem,
    @ColumnInfo
    val price:Int,
    @ColumnInfo
    val date:String
)
