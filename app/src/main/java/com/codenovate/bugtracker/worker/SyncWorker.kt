package com.codenovate.bugtracker.worker

import android.content.Context
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters
import com.codenovate.bugtracker.repository.IssueRepository
import android.util.Log

class SyncWorker(
    context: Context,
    params: WorkerParameters,
    private val repository: IssueRepository
) : CoroutineWorker(context, params) {


    override suspend fun doWork(): Result {

        return try {

            repository.synchronizeIssues()

            Result.success()

        } catch (exception: Exception) {

            Log.e(
                "SyncWorker",
                "Synchronization failed",
                exception
            )

            Result.retry()

        }
    }
}