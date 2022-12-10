package com.example.beautymaster.domain.service

import kotlinx.coroutines.flow.Flow

interface ServiceRepository {

    suspend fun getServiceItemList():Flow<List<ServiceItem>>

    suspend fun getServiceItem(id:Int):ServiceItem

    suspend fun addServiceItem(serviceItem: ServiceItem)

    suspend fun editServiceItem(serviceItem: ServiceItem)

    suspend fun deleteServiceItem(id:Int)

}