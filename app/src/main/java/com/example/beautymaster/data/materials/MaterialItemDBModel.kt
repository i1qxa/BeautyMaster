package com.example.beautymaster.data.materials

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class MaterialItemDBModel(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo
    val id : Int,
    @ColumnInfo
    val name : String,
    @ColumnInfo
    val unitOM : String,
)
