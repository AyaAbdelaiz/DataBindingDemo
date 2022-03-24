package com.ayaabdelaziz.myapplication

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ActivityViewModel :ViewModel() {

    val messege=MutableLiveData<String>()

    fun changeTxt(txt :String){
        messege.value=txt
    }
}