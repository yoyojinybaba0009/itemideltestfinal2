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

class QuestMainActivity5 : ComponentActivity() {
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
                                val intent = Intent(context, QuestMainActivity4::class.java)
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
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center,
                            modifier = Modifier.fillMaxSize()
                        ) {
                            Box(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .border(width = 2.dp, color = Color.Black)
                                    .padding(vertical = 75.dp),
                                contentAlignment = Alignment.Center // 수정된 부분
                            ) {
                                Text(
                                    text = "오늘이 불금이라면 하고싶은 일은? ",
                                    fontSize = 30.sp,
                                    textAlign = TextAlign.Center,
                                    lineHeight = 40.sp,
                                )
                            }

                            Spacer(modifier = Modifier.height(80.dp))

                            Button(
                                onClick = {
                                    nextIndex = 2 // 다음 페이지로 이동할 때마다 1씩 증가
                                    val currentIndex =
                                        intent.getIntExtra("nextIndex", 0)
                                    val totalIndex = nextIndex + currentIndex
                                    val intent = Intent(context, QuestMainActivity6::class.java)
                                    intent.putExtra("nextIndex", totalIndex)
                                    context.startActivity(intent)
                                },
                                modifier = Modifier.padding(top = 16.dp)
                            ) {
                                Text(
                                    text = "분위기 좋은 맛집 찾아가기",
                                    fontSize = 16.sp
                                )
                            }

                            Button(
                                onClick = {
                                    nextIndex = 2 // 다음 페이지로 이동할 때마다 1씩 증가
                                    val currentIndex =
                                        intent.getIntExtra("nextIndex", 0)
                                    val totalIndex = nextIndex + currentIndex
                                    val intent = Intent(context, QuestMainActivity6::class.java)
                                    intent.putExtra("nextIndex", totalIndex)
                                    context.startActivity(intent)
                                },
                                modifier = Modifier.padding(top = 16.dp)
                            ) {
                                Text(
                                    text = "오붓하게 집에서 하는 홈파티",
                                    fontSize = 16.sp
                                )
                            }

                            Button(
                                onClick = {
                                    nextIndex = 2 // 다음 페이지로 이동할 때마다 1씩 증가
                                    val currentIndex =
                                        intent.getIntExtra("nextIndex", 0)
                                    val totalIndex = nextIndex + currentIndex
                                    val intent = Intent(context, QuestMainActivity6::class.java)
                                    intent.putExtra("nextIndex", totalIndex)
                                    context.startActivity(intent)
                                },
                                modifier = Modifier.padding(top = 16.dp)
                            ) {
                                Text(
                                    text = "시끄럽고 신나는 클럽가기",
                                    fontSize = 15.sp
                                )
                            }

                            Button(
                                onClick = {
                                    nextIndex = 1 // 다음 페이지로 이동할 때마다 1씩 증가
                                    val currentIndex =
                                        intent.getIntExtra("nextIndex", 0)
                                    val totalIndex = nextIndex + currentIndex
                                    val intent = Intent(context, QuestMainActivity6::class.java)
                                    intent.putExtra("nextIndex", totalIndex)
                                    context.startActivity(intent)
                                },
                                modifier = Modifier.padding(top = 16.dp)
                            ) {
                                Text(
                                    text = "아무것도 하기 싫고 쉰다..",
                                    fontSize = 16.sp
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}
