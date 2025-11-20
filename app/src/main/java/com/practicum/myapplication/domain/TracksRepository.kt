package com.practicum.myapplication.domain

interface TracksRepository {
    suspend fun searchTracks(expression: String): List<Track>
}