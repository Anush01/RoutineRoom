package com.example.anushmp.roomroutine

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [RoutineEntity::class], version = 1)
abstract class DataBase : RoomDatabase() {
    abstract fun getRoutineDao(): RoutineDAO
}