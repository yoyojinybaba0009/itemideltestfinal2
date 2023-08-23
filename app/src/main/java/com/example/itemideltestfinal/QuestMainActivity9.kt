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

class QuestMainActivity9 : ComponentActivity() {
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
                                val intent = Intent(context, QuestMainActivity8::class.java)
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
                                contentAlignment = Alignment.Center
                            ) {
                                Text(
                                    text = "당신의 이상형중 어떤 분야의 사람이 매력적인가요?",
                                    fontSize = 25.sp,
                                    lineHeight = 30.sp
                                )
                            }
                                Spacer(modifier = Modifier.height(100.dp))
                                Button(
                                    onClick = {
                                        nextIndex = 3 // 다음 페이지로 이동할 때마다 1씩 증가
                                        val currentIndex =
                                            intent.getIntExtra("nextIndex", 0)
                                        val totalIndex = nextIndex + currentIndex
                                        val intent = Intent(context, QuestMainActivity10::class.java)
                                        intent.putExtra("nextIndex", totalIndex)
                                        context.startActivity(intent)
                                    },
                                    modifier = Modifier.padding(top = 16.dp)
                                ) {
                                    Text(
                                        text = "아이디어 많은 마케터",
                                        fontSize = 15.sp
                                    )
                                }
                                Button(
                                    onClick = {
                                        nextIndex = 2 // 다음 페이지로 이동할 때마다 1씩 증가
                                        val currentIndex =
                                            intent.getIntExtra("nextIndex", 0)
                                        val totalIndex = nextIndex + currentIndex
                                        val intent = Intent(context, QuestMainActivity10::class.java)
                                        intent.putExtra("nextIndex", totalIndex)
                                        context.startActivity(intent)
                                    },
                                    modifier = Modifier.padding(top = 16.dp)
                                ) {
                                    Text(
                                        text = "코드작성떄문에 퀭한 개발자",
                                        fontSize = 15.sp
                                    )
                                }
                                Button(
                                    onClick = {
                                        nextIndex = 4 // 다음 페이지로 이동할 때마다 1씩 증가
                                        val currentIndex =
                                            intent.getIntExtra("nextIndex", 0)
                                        val totalIndex = nextIndex + currentIndex
                                        val intent = Intent(context, QuestMainActivity10::class.java)
                                        intent.putExtra("nextIndex", totalIndex)
                                        context.startActivity(intent)
                                    },
                                    modifier = Modifier.padding(16.dp)
                                ) {
                                    Text(
                                        text = "집중하는모습이 섹시한 엔지니어",
                                        fontSize = 16.sp
                                    )
                                }
                                Button(
                                    onClick = {
                                        nextIndex = 5 // 다음 페이지로 이동할 때마다 1씩 증가
                                        val currentIndex =
                                            intent.getIntExtra("nextIndex", 0)
                                        val totalIndex = nextIndex + currentIndex
                                        val intent = Intent(context, QuestMainActivity10::class.java)
                                        intent.putExtra("nextIndex", totalIndex)
                                        context.startActivity(intent)
                                    },
                                    modifier = Modifier.padding(15.dp)
                                ) {
                                    Text(
                                        text = "성실하고 친절한 선생님",
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

