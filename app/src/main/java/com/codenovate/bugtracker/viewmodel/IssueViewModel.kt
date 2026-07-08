package com.codenovate.bugtracker.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.codenovate.bugtracker.data.local.IssueEntity
import com.codenovate.bugtracker.repository.IssueRepository
import kotlinx.coroutines.launch


class IssueViewModel(
    private val repository: IssueRepository
) : ViewModel() {


    private var currentIssue: IssueEntity? = null


    fun saveDraft(issue: IssueEntity) {

        currentIssue = issue

    }


    fun getDraft(): IssueEntity? {

        return currentIssue

    }


    fun createIssue(issue: IssueEntity) {

        viewModelScope.launch {

            repository.createIssue(issue)

        }

    }


    fun updateIssue(issue: IssueEntity) {

        viewModelScope.launch {

            repository.updateIssue(issue)

        }

    }


    fun deleteIssue(issue: IssueEntity) {

        viewModelScope.launch {

            repository.deleteIssue(issue)

        }

    }

}