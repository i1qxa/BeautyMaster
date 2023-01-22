package com.example.beautymaster.data.job

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.Transformations
import com.example.beautymaster.data.AppDatabase
import com.example.beautymaster.data.customer.CustomerMapper
import com.example.beautymaster.domain.customer.CustomerItem
import com.example.beautymaster.domain.job.JobItem
import com.example.beautymaster.domain.job.JobItemWithCustomer
import com.example.beautymaster.domain.job.JobRepository

class JobItemRepositoryImpl(application: Application):JobRepository {

    private val mapper = JobItemMapper()
    private val mapperJoin = JobItemWithCustomerMapper()
    private val dao = AppDatabase.getInstance(application).jobItemDBModelDao()

    override suspend fun getJobListForCustomer(customerId: Int): LiveData<List<JobItemWithCustomer>> {
        return Transformations.map(dao.getJobListForCustomer(customerId)){
            mapperJoin.mapListDBToListJobWithCustomer(it)
        }
    }

    override suspend fun getJobListInDateRange(
        dateStart: String,
        dateEnd: String
    ): LiveData<List<JobItemWithCustomer>> {
        return Transformations.map(dao.getJobListInDateRange(dateStart, dateEnd)){
            mapperJoin.mapListDBToListJobWithCustomer(it)
        }
    }

    override suspend fun getJobItemWithCustomer(id: Int): JobItemWithCustomer {
        return mapperJoin.mapDBToJobWithCustomer(dao.getJobItem(id))
    }

    override suspend fun addJobItem(jobItem: JobItem) {
        dao.addJobItem(mapper.mapJobItemToDBModel(jobItem))
    }

    override suspend fun editJobItem(jobItem: JobItem) {
        dao.editJobItem(mapper.mapJobItemToDBModel(jobItem))
    }

    override suspend fun deleteJobItem(id: Int) {
        dao.deleteJobItem(id)
    }
}