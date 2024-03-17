package com.loc.newsapp.presentation.video

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

data class Video(val title: String, val url: String)

class VideoViewModel : ViewModel() {
    private val _videos = MutableLiveData<List<Video>>()
    val videos: LiveData<List<Video>> get() = _videos

    // State variable needed for navigation code
    private val _state = MutableLiveData<Any>()
    val state: LiveData<Any> get() = _state

    init {
        // For demo purpose, adding only one video
        _videos.value = listOf(Video("Sample Video", "https://www.youtube.com/watch?v=Yy9La6YXNqI"))
    }
}
