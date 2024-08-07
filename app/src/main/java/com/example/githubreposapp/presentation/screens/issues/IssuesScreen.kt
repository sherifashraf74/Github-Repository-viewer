package com.example.githubreposapp.presentation.screens.issues

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.githubreposapp.presentation.screens.details.AppBar
import com.example.githubreposapp.presentation.theme.GithubReposAppTheme
import java.time.LocalDateTime

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun IssuesScreen(modifier: Modifier = Modifier,
                 onBackClick: () -> Unit) {
    Scaffold(topBar ={AppBar(title = "Issues",
        onBackArrowClicked = onBackClick)}
    )
    { ite ->

        Column(modifier = Modifier
            .background(color = MaterialTheme.colorScheme.secondaryContainer)
            .fillMaxWidth()) {
            LazyColumn(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(ite)
                    .padding(start = 16.dp, top = 8.dp , end = 16.dp),
                verticalArrangement = Arrangement.spacedBy(10.dp)
            )
            {
                items(lazyColumnData()) {
                    IssuesCards(
                        modifier = Modifier, issuesData = it
                    )
                }
            }

        }
    }

}
fun lazyColumnData():List<IssuesData>{
    return listOf(
        IssuesData(
            issueTitle = "Unexpected logout occurs when switching between tabs quickly",
            issueAuthor = "Cherif",
            issueStatus = "Closed",
            issueTime = LocalDateTime.now().minusWeeks(1)
        ),
        IssuesData(
            issueTitle = "App crashes on startup when loading user preferences",
            issueAuthor = "Ashraf",
            issueStatus = "Open",
            issueTime = LocalDateTime.now().minusDays(2)
        ),
        IssuesData(
            issueTitle = "UI glitch on settings screen after applying new theme",
            issueAuthor = "Ali",
            issueStatus = "In Progress",
            issueTime = LocalDateTime.now().minusHours(3)
        ),
        IssuesData(
            issueTitle = "Slow performance on login due to database query inefficiency",
            issueAuthor = "Hassan",
            issueStatus = "Open",
            issueTime = LocalDateTime.now().minusMinutes(45)
        ),
        IssuesData(
            issueTitle = "Feature request: Dark mode to reduce eye strain during night usage",
            issueAuthor = "Mo",
            issueStatus = "Open",
            issueTime = LocalDateTime.now().minusDays(4)
        ),
        IssuesData(
            issueTitle = "Memory leak in background service causing app to slow down over time",
            issueAuthor = "Salah",
            issueStatus = "Closed",
            issueTime = LocalDateTime.now().minusWeeks(2)
        ),
        IssuesData(
            issueTitle = "Notification not working for specific user segments",
            issueAuthor = "Body",
            issueStatus = "In Progress",
            issueTime = LocalDateTime.now().minusDays(1)
        ),
        IssuesData(
            issueTitle = "App hangs during logout when user has a large number of pending notifications",
            issueAuthor = "Sayed",
            issueStatus = "Closed",
            issueTime = LocalDateTime.now().minusHours(6)
        ),
        IssuesData(
            issueTitle = "App crashes on startup when loading user preferences",
            issueAuthor = "Ali",
            issueStatus = "Open",
            issueTime = LocalDateTime.now().minusDays(2)
        ),
        IssuesData(
            issueTitle = "UI glitch on settings screen after applying new theme",
            issueAuthor = "Messi",
            issueStatus = "In Progress",
            issueTime = LocalDateTime.now().minusHours(3)
        ),
        IssuesData(
            issueTitle = "Slow performance on login due to database query inefficiency",
            issueAuthor = "David",
            issueStatus = "Open",
            issueTime = LocalDateTime.now().minusMinutes(45)
        )
    )
}

@Preview
@Composable
fun IssuesScreenPreview() {
    GithubReposAppTheme {
        IssuesScreen(
            onBackClick = {})
    }


}