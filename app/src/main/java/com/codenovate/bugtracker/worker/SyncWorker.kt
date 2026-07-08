package com.codenovate.bugtracker.worker

import android.content.Context
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters
import com.codenovate.bugtracker.repository.IssueRepository


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

            Result.retry()

        }
    }
}