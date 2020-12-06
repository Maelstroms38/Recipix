package com.mvp.recipix.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.mvp.recipix.R
import com.mvp.recipix.data.util.Constants.Companion.BASE_IMAGE_URL
import com.mvp.recipix.data.util.RecipesDiffUtil
import com.mvp.recipix.models.Ingredient
import kotlinx.android.synthetic.main.ingredients_row_layout.view.*

class IngredientsAdapter: RecyclerView.Adapter<IngredientsAdapter.MyViewHolder>() {

    private var ingredientsList = emptyList<Ingredient>()

    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
       return MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.ingredients_row_layout, parent, false))
    }

    override fun getItemCount(): Int {
        return ingredientsList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        ingredientsList[position].image?.let {
            holder.itemView.ingredient_imageView.load(BASE_IMAGE_URL + it) {
                crossfade(500)
                error(R.drawable.ic_photo)
            }
        } ?: run {
            holder.itemView.ingredient_imageView.setImageResource(R.drawable.ic_menu_book)
        }

        holder.itemView.ingredient_name.text = ingredientsList[position].name?.capitalize()
        holder.itemView.ingredient_amount.text = ingredientsList[position].amount.toString()
        holder.itemView.ingredient_unit.text = ingredientsList[position].unit
        holder.itemView.ingredient_consistency.text = ingredientsList[position].consistency
        holder.itemView.ingredient_original.text = ingredientsList[position].original
    }

    fun setData(newIngredients: List<Ingredient>) {
        val ingredientsDiffUtil = RecipesDiffUtil(ingredientsList, newIngredients)
        val diffUtilResult = DiffUtil.calculateDiff(ingredientsDiffUtil)
        ingredientsList = newIngredients
        diffUtilResult.dispatchUpdatesTo(this)
    }
}