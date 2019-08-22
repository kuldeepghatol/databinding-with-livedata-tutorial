package com.resocoder.databinding

import androidx.databinding.Bindable
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class MainViewModel : ViewModel() {

    val currentRandomWeekday: LiveData<String>
        get() = FakeRepository.currentRandomWeekday

    fun onChangeRandomWeekdayClick() = FakeRepository.changeCurrentRandomFruitName()

    @Bindable
    val editTextContent = MutableLiveData<String>()

    private val _displayedEditTextContent = MutableLiveData<String>()
    val displayedEditTextContent: LiveData<String>
        get() = _displayedEditTextContent

    fun onDisplayEditTextContentClick() {
        _displayedEditTextContent.value = editTextContent.value
    }

    fun onSelectRandomEditTextFruit() {
        editTextContent.value = FakeRepository.getRandomFruitName()
    }
}