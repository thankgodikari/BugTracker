package com.codenovate.bugtracker.data.local

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update


@Dao
interface IssueDao {


    @Insert
    fun insert(issue: IssueEntity)


    @Update
    fun update(issue: IssueEntity)


    @Delete
    fun delete(issue: IssueEntity)


    @Query("SELECT * FROM issues")
    fun getAll(): List<IssueEntity>


    @Query("SELECT * FROM issues WHERE id = :id")
    fun getById(id: Int): IssueEntity?

}