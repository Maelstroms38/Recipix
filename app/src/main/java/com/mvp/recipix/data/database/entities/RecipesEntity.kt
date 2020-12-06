package com.mvp.recipix.data.database.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.mvp.recipix.data.util.Constants.Companion.RECIPES_TABLE
import com.mvp.recipix.models.FoodRecipe

@Entity(tableName = RECIPES_TABLE)
class RecipesEntity(
    var foodRecipe: FoodRecipe
) {
    @PrimaryKey(autoGenerate = false)
    var id: Int = 0
}