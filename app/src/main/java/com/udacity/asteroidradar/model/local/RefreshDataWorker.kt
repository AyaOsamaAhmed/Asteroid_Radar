package com.udacity.asteroidradar.model.local

import android.content.Context
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters
import com.udacity.asteroidradar.model.local.database.AsteroidDataBase.Companion.getDatabase
import com.udacity.asteroidradar.model.repository.AsteroidRepositoryImp
import retrofit2.HttpException

class RefreshDataWorker (appContext: Context, params: WorkerParameters):
    CoroutineWorker(appContext, params) {


    override suspend fun doWork(): Result {
        val database = getDatabase(applicationContext)
        val repository = AsteroidRepositoryImp()

        return try {
            repository.getPictureOfDayDB(applicationContext)
            Result.success()
        } catch (e: HttpException) {
            Result.retry()
        }


    }


}