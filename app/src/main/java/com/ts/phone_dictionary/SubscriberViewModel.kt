package com.ts.phone_dictionary

import androidx.databinding.Bindable
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ts.phone_dictionary.db.SubscriberRepository

class SubscriberViewModel(private val repository: SubscriberRepository) : ViewModel {

    @Bindable
    val inputName = MutableLiveData<String>()

    @Bindable
    val inputEmail = MutableLiveData<String>()


}


// @Bindable
/*
ViewModel内で使っているので、なんの情報をViewとModel間で伝達するかを指定している
→inputNameとinputEmailで変数を置いているので、名前とEmail


 */