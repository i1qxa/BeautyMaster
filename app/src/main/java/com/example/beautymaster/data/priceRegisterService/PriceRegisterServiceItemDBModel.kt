package com.example.beautymaster.data.priceRegisterService

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.beautymaster.data.service.ServiceItemDBModel


@Entity
data class PriceRegisterServiceItemDBModel(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo
    val id:Int,
    @ColumnInfo
    val service:ServiceItemDBModel,
    @ColumnInfo
    val price:Int,
    @ColumnInfo
    val date:String
)
