package com.example.beautymaster.data.jobBody

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import com.example.beautymaster.data.job.JobItemDBModel
import com.example.beautymaster.data.materials.MaterialItemDBModel
import com.example.beautymaster.data.service.ServiceItemDBModel

@Entity(
    foreignKeys = [
        ForeignKey(
            entity = JobItemDBModel::class,
            parentColumns = ["id"],
            childColumns = ["jobId"]
        )
    ]
)
data class JobBodyItemDBModel(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo
    val id:Float,
    @ColumnInfo
    val jobId:Int,
    @ColumnInfo
    val materialItem: MaterialItemDBModel?,
    @ColumnInfo
    val serviceItem:ServiceItemDBModel?,
    @ColumnInfo
    val amount:Int?,
    @ColumnInfo
    val price:Int,
    )
