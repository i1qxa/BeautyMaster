package com.example.beautymaster.data.job

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import com.example.beautymaster.data.customer.CustomerItemDBModel

@Entity(
    foreignKeys = [
        ForeignKey(
            entity = CustomerItemDBModel::class,
            parentColumns = ["id"],
            childColumns = ["customerId"]
        )
    ]
)
data class JobItemDBModel(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo
    val id : Int,
    @ColumnInfo
    val date : String,
    @ColumnInfo
    val customerId : Int,
)
