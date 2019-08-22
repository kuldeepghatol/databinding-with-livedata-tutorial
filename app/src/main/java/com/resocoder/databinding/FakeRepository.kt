package com.resocoder.databinding

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import java.util.*


object FakeRepository {

    private val weekdays: List<String> = listOf(
            "Monday", "Tuesday", "Wenesday", "Thrusday", "Friday", "Saturday",
            "Sunday"
    )

    private val _currentRandomWeekday = MutableLiveData<String>()
    val currentRandomWeekday: LiveData<String>
        get() = _currentRandomWeekday

    init {
        _currentRandomWeekday.value = weekdays.first()
    }

    fun getRandomFruitName(): String {
        val random = Random()
        return weekdays[random.nextInt(weekdays.size)]
    }

    fun changeCurrentRandomFruitName() {
        _currentRandomWeekday.value = getRandomFruitName()
    }
}