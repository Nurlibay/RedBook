package com.example.redbook.data.dao

import androidx.room.Dao
import androidx.room.Query
import com.example.redbook.data.model.Animal

@Dao
interface AnimalDao {
    @Query("SELECT * FROM book")
    fun getAllAnimals() : List<Animal>
}