package com.example.sportzinter.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.sportzinter.pojo.MatchData
import com.example.sportzinter.repository.MatchRepository
import kotlinx.coroutines.launch

class MatchDataViewModel(private val repository: MatchRepository) :ViewModel(){
    val matchData = MutableLiveData<MatchData>()
    val indData=MutableLiveData<MatchData>()
    val errorMessage = MutableLiveData<String>()

    fun getMatch(){
      viewModelScope.launch {
          val response = repository.getData()
          if(response.isSuccessful){
              matchData.postValue(response.body())
          }
          else{
              errorMessage.postValue(response.errorBody().toString())

          }
      }
      }

    fun getIND(){
        viewModelScope.launch {
            val response=repository.getInd()
            if (response.isSuccessful){
                indData.postValue(response.body())
            }
            errorMessage.postValue(response.errorBody().toString())

        }
    }

}