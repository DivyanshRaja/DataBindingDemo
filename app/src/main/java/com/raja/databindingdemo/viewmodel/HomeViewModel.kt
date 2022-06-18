package com.raja.databindingdemo.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class HomeViewModel : ViewModel() {

    //variable that will listen to user's input
    var _userNameInput = MutableLiveData<String>()
    var _userEmailInput = MutableLiveData<String>()
    var _score = MutableLiveData<String>()
    var isChecked = MutableLiveData<Boolean>()



}