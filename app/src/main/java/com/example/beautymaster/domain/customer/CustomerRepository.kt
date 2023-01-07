package com.example.beautymaster.domain.customer

import androidx.lifecycle.LiveData

interface CustomerRepository {

    suspend fun getCustomerList(): LiveData<List<CustomerItem>>

    suspend fun getCustomerItem(id: Int): CustomerItem

    suspend fun addCustomerItem(customerItem: CustomerItem)

    suspend fun editCustomerItem(customerItem:CustomerItem)

    suspend fun deleteCustomerItem(id:Int)

}