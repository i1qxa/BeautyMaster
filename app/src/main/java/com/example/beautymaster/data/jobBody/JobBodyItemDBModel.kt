package com.example.beautymaster.data.jobBody

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import com.example.beautymaster.data.job.JobItemDBModel

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
    val element: JobBodyElementDB,
    @ColumnInfo
    val amount:Int,
    @ColumnInfo
    val price:Int,

    ):JobBodyElementDB()
