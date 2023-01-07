package com.example.beautymaster.domain.service

import androidx.lifecycle.LiveData

interface ServiceRepository {

    suspend fun getServiceItemList():LiveData<List<ServiceItem>>

    suspend fun getServiceItem(id:Int):ServiceItem

    suspend fun addServiceItem(serviceItem: ServiceItem)

    suspend fun editServiceItem(serviceItem: ServiceItem)

    suspend fun deleteServiceItem(id:Int)

}