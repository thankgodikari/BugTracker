package com.codenovate.bugtracker.data.local

data class IssueEntity(

    val id: Int = 0,

    val title: String,

    val description: String,

    val priority: String,

    val status: String,

    val creationDate: String,

    val lastUpdated: String,

    val isSynced: Boolean = false

)