package com.example.beautymaster.data.jobElement

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.Transformations
import com.example.beautymaster.data.AppDatabase
import com.example.beautymaster.domain.jobElement.JobElementItem
import com.example.beautymaster.domain.jobElement.JobElementRepository

class JobElementRepositoryImpl(application: Application):JobElementRepository {

    private val mapper = JobElementMapper()
    private val dao = AppDatabase.getInstance(application).jobElementItemDBModelDao()

    override suspend fun getJobElementList(): LiveData<List<JobElementItem>> {
        return Transformations.map(dao.getJobElementItemList()){
            mapper.mapListDBModelToListJobElementItem(it)
        }
    }

    override suspend fun getServiceList(): LiveData<List<JobElementItem>> {
        return Transformations.map(dao.getServiceList()){
            mapper.mapListDBModelToListJobElementItem(it)
        }
    }

    override suspend fun getMaterialList(): LiveData<List<JobElementItem>> {
        return Transformations.map(dao.getMaterialList()){
            mapper.mapListDBModelToListJobElementItem(it)
        }
    }

    override suspend fun getJobElementItem(id: Int): JobElementItem {
        return mapper.mapDBModelToJobElementItem(dao.getJobElementItem(id))
    }

    override suspend fun addJobElementItem(jobElementItem: JobElementItem) {
        dao.addJobElementItem(mapper.mapJobElementItemToDBModel(jobElementItem))
    }

    override suspend fun editJobElementItem(jobElementItem: JobElementItem) {
        dao.editJobElementItem(mapper.mapJobElementItemToDBModel(jobElementItem))
    }

    override suspend fun deleteJobElementItem(id: Int) {
        dao.deleteJobElementItem(id)
    }
}