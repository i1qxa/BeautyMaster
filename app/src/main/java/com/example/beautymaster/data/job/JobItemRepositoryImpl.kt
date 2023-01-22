package com.example.beautymaster.data.job

import android.app.Application
import androidx.lifecycle.LiveData
import com.example.beautymaster.domain.job.JobItem
import com.example.beautymaster.domain.job.JobRepository

class JobItemRepositoryImpl(application: Application):JobRepository {
    override suspend fun getJobListForCustomer(customerId: Int): LiveData<List<JobItem>> {
        TODO("Not yet implemented")
    }

    override suspend fun getJobListInDateRange(
        dateStart: String,
        dateEnd: String
    ): LiveData<List<JobItem>> {
        TODO("Not yet implemented")
    }

    override suspend fun getJobItem(id: Int): JobItem {
        TODO("Not yet implemented")
    }

    override suspend fun addJobItem(jobItem: JobItem) {
        TODO("Not yet implemented")
    }

    override suspend fun editJobItem(jobItem: JobItem) {
        TODO("Not yet implemented")
    }

    override suspend fun deleteJobItem(id: Int) {
        TODO("Not yet implemented")
    }
}