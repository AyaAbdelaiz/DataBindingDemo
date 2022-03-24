package com.ayaabdelaziz.myapplication

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import coil.load


@BindingAdapter("loadImagefromURL")
fun ImageView.loadImagefromURL(url: String) {
    this.load(url)
}