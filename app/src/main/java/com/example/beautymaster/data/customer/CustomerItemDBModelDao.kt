package com.example.beautymaster.data.customer

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.beautymaster.domain.customer.CustomerItem
import kotlinx.coroutines.flow.Flow

@Dao
interface CustomerItemDBModelDao {

    @Query("SELECT * FROM customeritemdbmodel")
    fun getCustomerList():Flow<List<CustomerItemDBModel>>

    @Query("SELECT * FROM customeritemdbmodel WHERE id = :id")
    suspend fun getCustomerItem(id: Int): CustomerItem

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addCustomerItem(customerItem: CustomerItem)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun editCustomerItem(customerItem: CustomerItem)

    @Query("DELETE FROM customeritemdbmodel WHERE id = :id")
    suspend fun deleteCustomerItem(id:Int)

}