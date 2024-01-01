package com.chalise.kotlin.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.chalise.kotlin.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BusinessCard()
                }
            }
        }
    }
}

@Composable
fun BusinessCard() {
    val fullName: String = stringResource(id = R.string.full_name)
    val designation: String = stringResource(id = R.string.designation)
    val phone: String = stringResource(id = R.string.phone)
    val share: String = stringResource(id = R.string.share)
    val email: String = stringResource(id = R.string.email)
    val image: Painter = painterResource(id = R.drawable.android_logo)

    val phoneImage = painterResource(id = R.drawable.ic_phone)
    val shareImage = painterResource(id = R.drawable.ic_share)
    val emailImage = painterResource(id = R.drawable.ic_email)

    val modifier: Modifier = Modifier

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.Gray)
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Column(
            modifier = Modifier.weight(1f),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = image,
                contentDescription = null,
                modifier = Modifier
                    .width(200.dp)
                    .height(100.dp)
                    .background(Color.Black)
            )

            Text(
                text = fullName,
                fontSize = 36.sp
            )

            Text(
                text = designation,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Green
            )
        }

        Column {
            Row {

                Image(painter = phoneImage, contentDescription = null)

                Text(
                    text = phone,
                    modifier = Modifier
                        .padding(start = 8.dp)
                )

            }

            Row {

                Image(painter = shareImage, contentDescription = null)

                Text(
                    text = share,
                    modifier = Modifier
                        .padding(start = 8.dp)
                )

            }

            Row {

                Image(painter = emailImage, contentDescription = null)

                Text(
                    text = email,
                    modifier = Modifier
                        .padding(start = 8.dp)
                )

            }
        }

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinessCardTheme {
        BusinessCard()
    }
}