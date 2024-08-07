package com.example.githubreposapp.presentation.screens.details

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.githubreposapp.R
import com.example.githubreposapp.presentation.theme.Purple40

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun DetailsScreen(modifier: Modifier = Modifier,
                  onClickShowIssues:() -> Unit,
                  onBackClick: () -> Unit
                  ) {
    Scaffold(topBar = { AppBar(
        title = stringResource(R.string.details_screen_title),
        onBackArrowClicked = onBackClick
    )
    }) {

        Column(modifier= modifier
            .background(color = MaterialTheme.colorScheme.inverseOnSurface)
            .fillMaxSize()
            .padding(top = 70.dp),
            verticalArrangement = Arrangement.spacedBy(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally)
        {
            FirstIconWithLanguage(
                firstIcon = R.drawable.google_svgrepo_com,
                language = "Language")

            Spacer(modifier = Modifier.size(1.dp))

            Row (Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly)
            {
                DetailsSummary(
                    text = stringResource(R.string.detailsscreen_stars_icon),
                    icon = R.drawable.baseline_star_24)
                DetailsSummary(
                    text = stringResource(R.string.detailsscreen_language_icon_txt),
                    icon = R.drawable.baseline_circle_24)
                DetailsSummary(
                    text = stringResource(R.string.detailsscreen_branches_icon_txt),
                    icon = R.drawable.git_branch_svgrepo_com)
            }
            Text(text = stringResource(R.string.detailsscreen_repository_description_txt),
                style = MaterialTheme.typography.titleMedium,
                modifier=Modifier
                    .padding(30.dp,0.dp,30.dp))
            Spacer(modifier = Modifier.weight(1f))
            Button(
                onClick = onClickShowIssues,
                colors = ButtonDefaults.buttonColors(containerColor = Purple40),
                shape = RoundedCornerShape(10.dp),
                modifier= Modifier
                    .fillMaxWidth()
                    .padding(24.dp))
            {
                Text(
                    text = stringResource(R.string.detailscreen_show_issues_btn),
                    style = MaterialTheme.typography.titleLarge,
                    fontWeight = FontWeight.SemiBold
                    )
                
            }
        }

    }
    
}


@Preview
@Composable
fun DetailsScreenPreview() {
    DetailsScreen(onClickShowIssues = {},
        onBackClick = {})
}