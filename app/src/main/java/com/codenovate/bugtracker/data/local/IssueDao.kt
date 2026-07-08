package com.codenovate.bugtracker.data.local

interface IssueDao {

    fun insert(issue: IssueEntity)

    fun update(issue: IssueEntity)

    fun delete(issue: IssueEntity)

    fun getAll(): List<IssueEntity>

    fun getById(id: Int): IssueEntity?

}