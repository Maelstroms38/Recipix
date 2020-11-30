package com.mvp.recipix.bindingadapters

import android.view.View
import androidx.databinding.BindingAdapter
import com.mvp.recipix.data.database.RecipesEntity
import com.mvp.recipix.data.util.NetworkResult
import com.mvp.recipix.models.FoodRecipe

class RecipesBinding {
    companion object {

        @BindingAdapter("readApiResponse", "readDatabase", requireAll = true)
        @JvmStatic
        fun errorViewVisibility(
            view: View,
            apiResponse: NetworkResult<FoodRecipe>?,
            database: List<RecipesEntity>?
        ) {
            if (apiResponse is NetworkResult.Error && database.isNullOrEmpty()) {
                view.visibility = View.VISIBLE
            } else if (apiResponse is NetworkResult.Loading) {
                view.visibility = View.INVISIBLE
            } else {
                view.visibility = View.INVISIBLE
            }
        }
    }
}