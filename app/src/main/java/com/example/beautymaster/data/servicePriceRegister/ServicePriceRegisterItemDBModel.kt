package com.example.beautymaster.data.servicePriceRegister

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.beautymaster.data.service.ServiceItemDBModel

@Entity
data class ServicePriceRegisterItemDBModel(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo
    val id:Float,
    @ColumnInfo
    val serviceItem:ServiceItemDBModel,
    @ColumnInfo
    val price:Int,
    @ColumnInfo
    val date:String
)