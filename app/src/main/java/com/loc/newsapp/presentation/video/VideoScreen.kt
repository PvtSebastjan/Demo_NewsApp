@file:OptIn(ExperimentalMaterial3Api::class)

package com.loc.newsapp.presentation.video

import android.annotation.SuppressLint
import android.util.Log
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun VideoScreen(
    viewModel: VideoViewModel = viewModel()
) {
    //val videos by viewModel.videos.collectAsState()

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Video List") }
            )
        }
    ) {
        //    VideoList(videos = videos)
    }
}

@Composable
fun VideoList(videos: List<Video>) {
    LazyColumn {
        items(videos) { video ->
            VideoItem(video = video)
        }
    }
}

@Composable
fun VideoItem(video: Video) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        onClick = {
            // Here you can navigate to a video player screen passing the video URL
            // For simplicity, let's just print the URL for now
            log("Video URL: ${video.url}")
        }
    ) {
        Text(
            text = video.title,
            modifier = Modifier.padding(16.dp)
        )
    }
}

/**
 * A simple logger function for debugging purposes.
 */
@SuppressLint("LogNotTimber")
fun log(message: String) {
    Log.d("VideoScreen", message)
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MaterialTheme {
        VideoList(
            videos = listOf(
                Video("Sample Video 1", "https://www.youtube.com/watch?v=Yy9La6YXNqI"),
                Video("Sample Video 2", "https://www.youtube.com/watch?v=Yy9La6YXNqI")
            )
        )
    }
}
