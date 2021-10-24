package com.example.anushmp.roomroutine

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface RoutineDAO {
    @Query("SELECT * FROM user")
    fun getAll(): List<RoutineEntity>

    @Insert
    fun insertAll(vararg routine: RoutineEntity)

    @Delete
    fun delete(routineid: Int)
}