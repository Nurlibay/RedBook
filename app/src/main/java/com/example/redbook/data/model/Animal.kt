package com.example.redbook.data.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "book")
data class Animal (
    @PrimaryKey val id: Int,
    @ColumnInfo(name="type") val type: Int?,
    @ColumnInfo(name="nameUzb") val nameUzb: String?,
    @ColumnInfo(name="nameRus") val nameRus: String?,
    @ColumnInfo(name="nameEng") val nameEng: String?,
    @ColumnInfo(name="status") val status: String?,
    @ColumnInfo(name="propagation") val propagation: String?,
    @ColumnInfo(name="habitat") val habitat: String?,
    @ColumnInfo(name="quantity") val quantity: String?,
    @ColumnInfo(name="lifestyle") val lifestyle: String?,
    @ColumnInfo(name="limitingFactors") val limitingFactors: String?,
    @ColumnInfo(name="breeding") val breeding: String?,
    @ColumnInfo(name="security") val security: String?,

    @ColumnInfo(name="isFavorite") var isFavorite: Int? = 0
)