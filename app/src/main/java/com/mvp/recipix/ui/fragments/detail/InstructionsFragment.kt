package com.mvp.recipix.ui.fragments.detail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebViewClient
import com.mvp.recipix.R
import com.mvp.recipix.models.Result
import kotlinx.android.synthetic.main.fragment_instructions.view.*

class InstructionsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_instructions, container, false)
        val args = arguments
        val myBundle: Result? = args?.getParcelable("recipeBundle")
        view.instructions_webView.webViewClient = object : WebViewClient() {}
        myBundle?.sourceUrl?.let {
            view.instructions_webView.loadUrl(it)
        }
        return view
    }
}