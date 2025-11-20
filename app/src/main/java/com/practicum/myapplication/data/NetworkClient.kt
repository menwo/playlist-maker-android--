package com.practicum.myapplication.data

interface NetworkClient {
    fun doRequest(dto: Any): BaseResponse
}