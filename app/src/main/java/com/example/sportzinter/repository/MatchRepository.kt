package com.example.sportzinter.repository

import com.example.sportzinter.api.RetroServices

class MatchRepository(private val retrofitService: RetroServices) {

   suspend fun getData() = retrofitService.
   getMatchData()

   suspend fun getInd() = retrofitService.
   getIndNew()



}