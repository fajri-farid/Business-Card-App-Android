package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.expandVertically
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    BusinessCard()
                }
            }
        }
    }
}

@Composable
fun BusinessCard() {
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .background(Color(0xFF073042)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        val image = painterResource(id = R.drawable.juki)
        Image(
            painter = image,
            contentDescription = "Pas Foto",
            modifier = Modifier
                .height(250.dp)
                .width(250.dp)
                .padding(20.dp)

        )
        Text(
            text = "Fajri Farid",
            color = Color.White,
            fontSize = 32.sp
        )
        Text(
            text = "Teknik Informatika 23",
            color = Color(0xFF3ddc84),
            modifier = Modifier.padding(bottom = 350.dp)
        )
    }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 50.dp),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.Start
    ) {
        Divider(modifier = Modifier.fillMaxWidth(), thickness = 2.dp, color = Color(0xFF526E7B))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 50.dp)
                .padding(bottom = 5.dp)
                .padding(top = 5.dp)
        ) {
            val phone = painterResource(id = R.drawable.github)
            Image(painter = phone, contentDescription = null, modifier = Modifier
                .height(50.dp)
                .width(50.dp)
                .padding(8.dp))
            Text(
                text = "fajri-farid",
                color = Color.White,
                modifier = Modifier
                    .padding(8.dp)
                    .padding(top = 7.dp)
            )

        }

        Divider(modifier = Modifier.fillMaxWidth(), thickness = 2.dp, color = Color(0xFF526E7B))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 50.dp)
                .padding(bottom = 5.dp)
                .padding(top = 5.dp)
        ) {
            val share = painterResource(id = R.drawable.linkedin)
            Image(painter = share, contentDescription = null, modifier = Modifier
                .height(50.dp)
                .width(50.dp)
                .padding(8.dp))
            Text(
                text = "Muh. Fajri Farid",
                color = Color.White,
                modifier = Modifier
                    .padding(8.dp)
                    .padding(top = 7.dp)
            )

        }

        Divider(modifier = Modifier.fillMaxWidth(), thickness = 2.dp, color = Color(0xFF526E7B))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 50.dp)
                .padding(bottom = 5.dp)
                .padding(top = 5.dp)
        ) {
            val share = painterResource(id = R.drawable.instagram_icon)
            Image(painter = share, contentDescription = null, modifier = Modifier
                .height(50.dp)
                .width(50.dp)
                .padding(8.dp))
            Text(
                text = "@fajri_farid",
                color = Color.White,
                modifier = Modifier
                    .padding(8.dp)
                    .padding(top = 7.dp)
            )

        }
        Divider(modifier = Modifier.fillMaxWidth(), thickness = 2.dp, color = Color(0xFF526E7B))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 50.dp)
                .padding(bottom = 5.dp)
                .padding(top = 5.dp)
        ) {
            val email = painterResource(id = R.drawable.email_icon)
            Image(painter = email, contentDescription = null, modifier = Modifier
                .height(50.dp)
                .width(50.dp)
                .padding(8.dp))
            Text(
                text = "fajrijry14@gmail.com",
                color = Color.White,
                modifier = Modifier
                    .padding(8.dp)
                    .padding(top = 7.dp)
            )
        }
        Divider(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 50.dp),
            thickness = 2.dp,
            color = Color(0xFF526E7B)
        )

        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 150.dp)
        )
        {
            Text(
                text = "made with ❤️",
                color = Color.White,
            )
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    BusinessCardTheme {
        BusinessCard()
    }
}