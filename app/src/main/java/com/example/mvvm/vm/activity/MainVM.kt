package com.example.mvvm.vm.activity

import android.view.View
import androidx.lifecycle.ViewModel
import com.google.android.material.snackbar.Snackbar

/**
 * Created by Pushpendra Saini on 10/02/24 @ 5:15 pm
 * Contact - sainipushpendra51@gmail.com
 * Copyright ©2024 Pushpendra
 */
class MainVM : ViewModel() {
    fun onTapFabIcon(view : View){
        Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
            .setAction("Action", null).show()
    }
}