package com.ankur.livedata

import android.view.View
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class mainActivityViewModel: ViewModel() {


//    var count=0    Now We made this count as Livedata from Mutable LiveData Class

    var count =MutableLiveData<Int>()

//    Now Initial value should be pass in init block
    init {
        count.value=0
    }
    fun updateCount()
    {
        count.value=(count.value)?.plus(1)

    }

}
