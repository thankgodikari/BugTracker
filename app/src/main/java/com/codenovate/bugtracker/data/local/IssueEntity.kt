package com.codenovate.bugtracker.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "issues")
data class IssueEntity(

    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,

    val title: String,

    val description: String,

    val priority: String,

    val status: String,

    val creationDate: String,

    val lastUpdated: String,

    val isSynced: Boolean = false

)