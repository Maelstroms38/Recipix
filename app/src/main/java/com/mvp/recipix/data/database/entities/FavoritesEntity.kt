package com.mvp.recipix.data.database.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.mvp.recipix.data.util.Constants.Companion.FAVORITES_TABLE
import com.mvp.recipix.models.Result

@Entity(tableName = FAVORITES_TABLE)
class FavoritesEntity(
    @PrimaryKey(autoGenerate = true)
    var id: Int,
    var result: Result
) {
}