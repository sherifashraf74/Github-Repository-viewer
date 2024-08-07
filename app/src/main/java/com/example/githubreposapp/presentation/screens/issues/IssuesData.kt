package com.example.githubreposapp.presentation.screens.issues

import java.time.LocalDateTime

data class IssuesData(
    val issueTitle : String,
    val issueAuthor : String,
    val issueStatus : String,
    val issueTime : LocalDateTime
)
