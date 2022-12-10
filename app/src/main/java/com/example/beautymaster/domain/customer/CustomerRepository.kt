package com.example.beautymaster.domain.customer

import kotlinx.coroutines.flow.Flow

interface CustomerRepository {

    suspend fun getCustomerList(): Flow<List<CustomerItem>>

    suspend fun getCustomerItem(id: Int): CustomerItem

    suspend fun addCustomerItem(customerItem: CustomerItem)

    suspend fun editCustomerItem(customerItem:CustomerItem)

    suspend fun deleteCustomerItem(id:Int)

}