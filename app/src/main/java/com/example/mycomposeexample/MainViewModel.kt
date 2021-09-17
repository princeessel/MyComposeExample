package com.example.mycomposeexample

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    val textFieldState = MutableLiveData("")

    fun onTextChange(newText: String) {
        textFieldState.value =  newText
    }
}