package com.example.nikalogin.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.ui.Alignment
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.ui.draw.clip
import com.example.nikalogin.R
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NumberLogin() {
    val phoneNumber = remember { mutableStateOf("") }
    Surface (modifier = Modifier.fillMaxSize()){
        Box(modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)) {
            Column {
                Image(
                    painter = painterResource(id = R.drawable.divueens),
                    contentDescription = "Header Logo",
                    modifier = Modifier.size(450.dp))
                Box(modifier = Modifier
                    .height(329.dp)
                    .fillMaxWidth()
                    .clip(
                        RoundedCornerShape(
                            topStart = 30.dp,
                            topEnd = 30.dp
                        )
                    )
                    .background(color = Color(0xFFFF9CA6))) {
                    Text(text = "Login",
                        fontWeight = FontWeight(700),
                        fontStyle = FontStyle.Italic,
                        fontFamily = FontFamily.Cursive,
                        fontSize = 40.sp,
                        modifier = Modifier
                            .align(Alignment.TopCenter)
                            .padding(10.dp)
                    )
                    Text(text = "Be the Beholder of Beauty(idk)",
                        modifier = Modifier
                            .padding(top = 60.dp)
                            .align(Alignment.TopCenter)
                    )
                    Row (modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 17.dp)
                        .padding(top = 100.dp)){
                        OutlinedTextField(
                            value = phoneNumber.value,
                            onValueChange = {phoneNumber.value = it},
                            modifier = Modifier
                                .width(250.dp),
                            colors = TextFieldDefaults.outlinedTextFieldColors(
                                containerColor = Color(0xFFF3F4F6),
                                unfocusedBorderColor = Color(0xFFF3F4F6),
                                focusedBorderColor = Color(0xFFF3F4F6)
                            ),
                            leadingIcon = { 
                                Text(text = "+91",
                                    fontWeight = FontWeight(500),
                                    fontSize = 14.sp,
                                    color = Color.Black)
                            },
                            label = {
                                Text(text = "Mobile Number")
                            },
                            singleLine = true
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        Button(
                            shape = RoundedCornerShape(7.dp),
                            onClick = { /* Handle Get OTP click */ },
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color(0xFFF3F4F6),
                                contentColor = Color.Black
                            ),
                            modifier = Modifier
                                .height(64.dp)
                                .padding(top = 8.dp)
                        ) {
                            Text("Get OTP", fontSize = 10.sp)
                        }
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun NumberLoginPreview() {
    NumberLogin()
}