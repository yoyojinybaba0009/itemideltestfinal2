package com.example.itemideltestfinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.itemideltestfinal.ui.theme.ItemideltestfinalTheme

class QuestMainActivity7 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            var nextIndex by remember { mutableStateOf(0) }
            val context = LocalContext.current
            ItemideltestfinalTheme() {
                Surface() {
                    Box(
                        Modifier.fillMaxSize()
                    ) {
                        Row(
                            Modifier
                                .fillMaxWidth()
                                .height(56.dp)
                                .padding(12.dp),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            IconButton(onClick = {
                                val intent = Intent(context, QuestMainActivity6::class.java)
                                startActivity(intent)
                            }) {
                                Icon(
                                    imageVector = Icons.Default.KeyboardArrowLeft,
                                    contentDescription = "ArrowLeftImage",
                                    tint = Color.Black
                                )
                            }

                            Text(
                                text = "이상형테스트",
                                fontWeight = FontWeight.Bold,
                                textAlign = TextAlign.Center,
                                fontSize = 16.sp
                            )
                        }
                    }
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,  //
                        verticalArrangement = Arrangement.Center,
                        modifier = Modifier.fillMaxSize()
                    ) {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .border(width = 2.dp, color = Color.Black)
                                .padding(vertical = 75.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = "당신은 이상형인 이성과 함께\n" +
                                        "영화를 본다면 어떤 장르를 보고싶나요?",
                                fontSize = 25.sp,
                                lineHeight = 30.sp
                            )
                        }

                        Spacer(modifier = Modifier.height(40.dp)) // 위에 간격 추가

                        Button(
                            onClick = {
                                nextIndex = 3 // 다음 페이지로 이동할 때마다 2씩 증가
                                val intent = Intent(context, QuestMainActivity8::class.java)
                                intent.putExtra("selectedButtonIndex", nextIndex)
                                context.startActivity(intent)
                            },
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(16.dp)
                        ) {
                            Text(
                                text = "범죄,액션",
                                fontSize = 15.sp
                            )
                        }
                        Button(
                            onClick = {
                                nextIndex = 2 // 다음 페이지로 이동할 때마다 1씩 증가
                                val intent = Intent(context, QuestMainActivity8::class.java)
                                intent.putExtra("selectedButtonIndex", nextIndex)
                                context.startActivity(intent)
                            },
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(16.dp)
                        ) {
                            Text(
                                text = "공포,스릴러",
                                fontSize = 15.sp
                            )
                        }
                        Button(
                            onClick = {
                                nextIndex = 5 // 다음 페이지로 이동할 때마다 1씩 증가
                                val intent = Intent(context, QuestMainActivity8::class.java)
                                intent.putExtra("selectedButtonIndex", nextIndex)
                                context.startActivity(intent)
                            },
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(16.dp)
                        ) {
                            Text(
                                text = "로맨스,멜로",
                                fontSize = 16.sp
                            )
                        }
                        Button(
                            onClick = {
                                nextIndex = 2 // 다음 페이지로 이동할 때마다 1씩 증가
                                val intent = Intent(context, QuestMainActivity8::class.java)
                                intent.putExtra("selectedButtonIndex", nextIndex)
                                context.startActivity(intent)
                            },
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(16.dp)
                        ) {
                            Text(
                                text = "SF,판타지",
                                fontSize = 16.sp
                            )
                        }
                    }
                }
            }
        }
    }
}
