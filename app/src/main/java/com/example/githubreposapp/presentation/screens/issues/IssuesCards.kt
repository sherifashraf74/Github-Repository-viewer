package com.example.githubreposapp.presentation.screens.issues

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.githubreposapp.R
import com.example.githubreposapp.presentation.theme.GithubReposAppTheme
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.time.format.FormatStyle

@Composable
fun IssuesCards(modifier: Modifier = Modifier,
                issuesData: IssuesData) {

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(
                    color = Color.White, shape = RoundedCornerShape(16.dp)
                )
            ,verticalArrangement = Arrangement.SpaceEvenly
        )
        {
            Row(
                modifier = Modifier
                    .padding(8.dp, 8.dp, 8.dp, 0.dp)
                    .fillMaxWidth()
                ,horizontalArrangement = Arrangement.SpaceAround
                ,verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(
                    id = R.drawable.baseline_radio_button_checked_24)
                    ,contentDescription = stringResource(R.string.fixed_issues_icon)
                    ,Modifier.size(50.dp)

                )
                Text(
                    modifier = Modifier
                        .weight(1f)
                        .padding(8.dp, 0.dp, 0.dp, 0.dp)
                    ,style = MaterialTheme.typography.titleMedium
                    , color = Color.Black
                    , overflow = TextOverflow.Ellipsis
                    , maxLines = 1
                    ,text = issuesData.issueTitle
                )
                Text(
                    modifier = Modifier
                        .padding(end = 8.dp)
                    ,style = MaterialTheme.typography.titleMedium.copy(fontWeight = FontWeight.W400)
                    ,color = Color.Black
                    ,text = issuesData.issueStatus
                )
            }
            Column(modifier = Modifier.padding(32.dp,0.dp,0.dp,0.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp)) {
                Text(
                    modifier = Modifier
                        .padding(32.dp, 0.dp, 0.dp, 0.dp)
                    , style = MaterialTheme.typography.bodyMedium
                    ,color = Color.Black
                    ,text = issuesData.issueAuthor
                )
                Row {
                    Text(
                        modifier = Modifier
                            .padding(32.dp, 0.dp, 0.dp, 16.dp)
                        , style = MaterialTheme.typography.bodyMedium.copy(fontWeight = FontWeight.Bold)
                        ,color = Color.Black
                        ,text = stringResource(R.string.issues_screen_created_at))

                    Text(modifier = Modifier
                        .padding(start = 4.dp)
                        ,color = Color.Black
                        ,text = issuesData.issueTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)))
                }
            }
        }
}

@Preview
@Composable
fun IssuesCardsPreview() {
    GithubReposAppTheme {
        IssuesCards(issuesData = IssuesData(issueTitle = "Slow performance on login due to database query inefficiency "
            ,issueAuthor = "NONE"
            ,issueStatus = "Open"
            ,issueTime = LocalDateTime.now())
        )

    }

}