package xyz.stayer.radiorecordflow.server

import com.squareup.moshi.Json

data class RecordResponseSongInfo(
    @Json(name = "artist") val artist: String,
    @Json(name = "title") val title: String
)