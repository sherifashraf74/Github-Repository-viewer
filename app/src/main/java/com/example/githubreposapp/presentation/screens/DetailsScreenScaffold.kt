package com.example.githubreposapp.presentation.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment

import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.githubreposapp.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailsScreenScaffold(modifier: Modifier = Modifier ) {
    CenterAlignedTopAppBar(
        title = {
            Row(modifier = Modifier
                .fillMaxWidth()
                .background(color = Color.White),
                verticalAlignment = Alignment.CenterVertically
            )
            {
                Box(modifier = modifier
                    .padding(horizontal = 10.dp)) {
                    Button(
                        onClick = { /* ... */ },
                        colors = ButtonDefaults.buttonColors(containerColor = Color.White)
                        ) {
                        Icon(
                            imageVector = Icons.Filled.ArrowBack,
                            contentDescription = stringResource(R.string.back_btn),
                            tint = Color.Black,
                            modifier = Modifier
                                .size(30.dp)
                        )
                    }
                }

//                Image(painter = painterResource(id = R.drawable.baseline_arrow_back_24) , contentDescription = stringResource(
//                    R.string.bach_button_description),
//                    modifier = Modifier
//                        .size(50.dp)
//                        .padding(start = 16.dp),)


                Text(text = stringResource(R.string.topbar_details_screen),
                    style = MaterialTheme.typography.titleLarge,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                    fontSize = 30.sp,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(start = 60.dp)

                )
            } },
        modifier = modifier

    )
}

@Preview
@Composable
fun PreviewDetailsScreenScaffold() {
    DetailsScreenScaffold()
}