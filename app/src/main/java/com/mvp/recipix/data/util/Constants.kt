package com.mvp.recipix.data.util


class Constants {
    companion object {
       const val BASE_URL = "https://api.spoonacular.com"
       const val API_KEY = "34071e3d034f4f789375200fc5917128"

       // API Query Keys
        const val QUERY_SEARCH = "query"
      const val QUERY_NUMBER = "number"
      const val QUERY_API_KEY = "apiKey"
      const val QUERY_TYPE = "type"
      const val QUERY_DIET = "diet"
      const val QUERY_ADD_RECIPE_INFO = "addRecipeInformation"
      const val QUERY_FILL_INGREDIENTS = "fillIngredients"

        // ROOM Database
        const val DATABASE_NAME = "recipes_database"
        const val RECIPES_TABLE = "recipes_table"

        // Bottom Sheet preferences
        const val DEFAULT_MEAL_TYPE = "main course"
        const val DEFAULT_DIET_TYPE = "gluten free"
        const val DEFAULT_RECIPES_NUMBER = "50"
        const val PREF_NAME = "preferences"
        const val PREF_MEAL_TYPE = "mealType"
        const val PREF_MEAL_TYPE_ID = "mealTypeId"
        const val PREF_DIET_TYPE = "dietType"
        const val PREF_DIET_TYPE_ID = "dietTypeId"
        const val PREF_BACK_ONLINE = "backOnline"
    }
}