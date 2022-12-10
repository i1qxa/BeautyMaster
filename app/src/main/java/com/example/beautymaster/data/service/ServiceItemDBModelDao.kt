package com.example.beautymaster.data.service

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.beautymaster.domain.service.ServiceItem
import kotlinx.coroutines.flow.Flow

@Dao
interface ServiceItemDBModelDao {

    @Query("SELECT * FROM serviceitemdbmodel")
    suspend fun getServiceItemList(): Flow<List<ServiceItem>>

    @Query("SELECT * FROM serviceitemdbmodel WHERE id = :id")
    suspend fun getServiceItem(id:Int): ServiceItem

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addServiceItem(serviceItem: ServiceItem)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun editServiceItem(serviceItem: ServiceItem)

    @Query("DELETE FROM serviceitemdbmodel WHERE id = :id")
    suspend fun deleteServiceItem(id:Int)

}