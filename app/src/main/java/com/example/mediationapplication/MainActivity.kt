package com.example.mediationapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mediationapplication.data.FILTER_CONTENT_LIST
import com.example.mediationapplication.ui.theme.MediationApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MediationApplicationTheme {
               Column(
                   modifier = Modifier
                       .background(Color.LightGray)
                       .fillMaxSize()
               ){
                   HeaderProfileComponent()
                   SearchInputComponent()
               }
            }
        }
    }
    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun HeaderProfileComponent(){
        Row (horizontalArrangement = Arrangement.SpaceBetween, modifier = Modifier
            .fillMaxWidth()
            .padding(
                start = 15.dp,
                end = 15.dp,
                top = 15.dp
            )){
            Row (verticalAlignment = Alignment.CenterVertically){
                Image(
                    painter = painterResource(id = R.drawable.ic_launcher_foreground),
                    contentDescription = "Profile Picture",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(50.dp)
                        .clip(CircleShape)
                )
                Column (modifier = Modifier.padding(10.dp)){
                    Text(
                        text = "Welcome Back",
                        fontSize = 14.sp,
                        textAlign = TextAlign.Start
                    )
                    Text(
                        text = "Geoffrey Murira",
                        fontSize = 24.sp,
                        textAlign = TextAlign.Start
                    )
                }
            }
          BadgedBox(badge = {Badge(Modifier.background(Color.Green))}) {
              Icon(imageVector = Icons.Default.Notifications, contentDescription = "Notifications")
          }
        }
    }
    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun SearchInputComponent(){
        OutlinedTextField(
            value = "",
            onValueChange = {},
            shape = RoundedCornerShape(8.dp),
            placeholder = { Text(text = "Search", fontFamily = FontFamily.Cursive)},
            leadingIcon = {
                Icon(imageVector = Icons.Default.Search, contentDescription = "Search Icn")
            },
            trailingIcon = {
                Icon(imageVector = Icons.Default.Clear, contentDescription = "Search Clear")
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 15.dp, start = 15.dp, end = 15.dp)
                .background(Color.White),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color.LightGray,
                unfocusedBorderColor = Color.White,
                cursorColor = Color.LightGray,
                //Trailing Icon color

            )

        )
    }
    @Composable
    fun FilterOptionsComponent(){
        val filterOptions = FILTER_CONTENT_LIST
    }
}
