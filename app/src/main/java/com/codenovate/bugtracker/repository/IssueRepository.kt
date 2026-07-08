package com.codenovate.bugtracker.repository

import com.codenovate.bugtracker.data.local.IssueDao
import com.codenovate.bugtracker.data.local.IssueEntity
import com.codenovate.bugtracker.data.remote.IssueApiService

class IssueRepository(
    private val issueDao: IssueDao,
    private val issueApiService: IssueApiService
) {


    fun getAllIssues(): List<IssueEntity> {

        return issueDao.getAll()

    }


    fun createIssue(issue: IssueEntity) {

        issueDao.insert(issue)

    }


    fun updateIssue(issue: IssueEntity) {

        issueDao.update(issue)

    }


    fun deleteIssue(issue: IssueEntity) {

        issueDao.delete(issue)

    }


    fun synchronizeIssues() {
        val localIssues = issueDao.getAll()

        localIssues.forEach { issue ->

            if (!issue.isSynced) {

                issueApiService.createIssue(issue)

            }
        }
    }
}