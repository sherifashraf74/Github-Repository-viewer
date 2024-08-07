package com.example.githubreposapp.presentation.screens.repos

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
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.githubreposapp.R

@Composable
fun RepoItem() {
    Row (modifier = Modifier
        .fillMaxWidth()
        .background(MaterialTheme.colorScheme.surface, shape = RoundedCornerShape(16.dp))
    )
    {
        Image(painter = painterResource(id = R.drawable.ic_launcher_background), contentDescription = stringResource(
            R.string.repository_screen_avatar_image_description,
            ),
            contentScale = ContentScale.Crop
            ,
            modifier = Modifier
                .size(50.dp)
                .padding(start = 8.dp, top = 8.dp)
                .clip(RoundedCornerShape(50.dp))
        )
    Column(modifier =Modifier.padding(end = 10.dp, bottom = 10.dp, top = 10.dp , start = 8.dp)) {
        Row (horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()){
            Text(text = "Repo Name",
                overflow = TextOverflow.Ellipsis,
                maxLines = 1,
                color = MaterialTheme.colorScheme.onSurface,
                modifier = Modifier
                    .weight(1f)
                    )
            Text(text = "50",
                color = MaterialTheme.colorScheme.onSurface,
                modifier = Modifier.padding(horizontal = 8.dp)
            )
            Image(painter = painterResource(id = R.drawable.baseline_star_24), contentDescription = stringResource(
                R.string.repository_screen_repoItem_star_icon_description),
                colorFilter = ColorFilter.tint(androidx.compose.ui.graphics.Color.Yellow),
                modifier = Modifier
                    .size(30.dp)
                    .padding(end = 8.dp)
            )
        }

        Text(text = "Repo Owner",
            color = MaterialTheme.colorScheme.onSurface,
            )
        Text(text = "Repo Description Repo Description Repo DescriptionRepo DescriptionRepo DescriptionRepo DescriptionRepo DescriptionRepo DescriptionRepo Description",
            overflow = TextOverflow.Ellipsis,
            maxLines = 1,
            modifier = Modifier.padding(top = 6.dp))
    }


    }

}

@Preview
@Composable
fun RepoItemPreview() {
    RepoItem()
}