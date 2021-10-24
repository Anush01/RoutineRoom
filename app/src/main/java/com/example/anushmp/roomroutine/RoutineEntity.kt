package com.example.anushmp.roomroutine

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class RoutineEntity(
    @PrimaryKey val uid: Int,
    @ColumnInfo(name = "routine_text") val routine: String?,

)