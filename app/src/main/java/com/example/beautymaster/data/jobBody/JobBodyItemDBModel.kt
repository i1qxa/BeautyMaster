package com.example.beautymaster.data.jobBody

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import com.example.beautymaster.data.job.JobItemDBModel
import com.example.beautymaster.data.jobElement.JobElementItemDBModel

@Entity(
    foreignKeys = [
        ForeignKey(
            entity = JobItemDBModel::class,
            parentColumns = ["id"],
            childColumns = ["jobId"]
        ),
    ForeignKey(
        entity = JobElementItemDBModel::class,
        parentColumns = ["id"],
        childColumns = ["jobElementId"]
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
    val jobElementId: Int,
    @ColumnInfo
    val amount:Int?,
    @ColumnInfo
    val price:Int,
    )
