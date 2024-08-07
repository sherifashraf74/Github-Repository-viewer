package com.example.githubreposapp.presentation.screens.details

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.githubreposapp.R

@Composable
fun DetailsSummary(
    text:String,
    @DrawableRes icon: Int)
{
    Row(verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier){
        Text(text = text,
            style = MaterialTheme.typography.titleMedium,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Normal)
        Image(painter = painterResource(id = icon),
            contentDescription = "Icon",
            modifier = Modifier
                .size(30.dp)
                .padding(start = 6.dp))
    }

}

@Preview
@Composable
fun DetailsSummaryPreview() {

    DetailsSummary("1525", R.drawable.baseline_star_24)
}