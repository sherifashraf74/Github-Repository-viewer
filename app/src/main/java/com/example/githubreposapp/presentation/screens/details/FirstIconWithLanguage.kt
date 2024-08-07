package com.example.githubreposapp.presentation.screens.details

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.githubreposapp.R

@Composable
fun FirstIconWithLanguage(@DrawableRes firstIcon:Int, language:String) {
    Column(horizontalAlignment = Alignment.CenterHorizontally
        ,modifier = Modifier)
    {
        Image(painter = painterResource(id = firstIcon), contentDescription = "Google_Icon",
            modifier = Modifier
                .size(170.dp))


        Text(text = language,
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            modifier=Modifier
                )
    }

}

@Preview
@Composable
fun FirstIconWithLanguagePreview() {
    FirstIconWithLanguage(firstIcon = R.drawable.google_svgrepo_com, language = "Language")

}