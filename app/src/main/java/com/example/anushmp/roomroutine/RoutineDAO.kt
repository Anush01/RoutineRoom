package com.example.anushmp.roomroutine

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface RoutineDAO {
    @Query("SELECT * FROM routines")
    fun getAll(): List<RoutineEntity>

    @Insert
    fun insertAll(routine: RoutineEntity)

    @Delete
    fun delete(routineid: Int)
}