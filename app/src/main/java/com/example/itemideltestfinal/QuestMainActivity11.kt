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

class QuestMainActivity11 : ComponentActivity() {
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
                                val intent = Intent(context, QuestMainActivity10::class.java)
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
                                fontSize = 16.sp,
                                modifier = Modifier.padding(start = 8.dp)
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
                                    .padding(vertical = 55.dp),
                                contentAlignment = Alignment.Center
                            ) {
                            Text(
                                text = "이성 만남을 고려할 때,\n그 중에서 \n피하고 싶은 것은\n무엇인가요?",
                                fontSize = 30.sp,
                                lineHeight = 40.sp
                            )}
                            Spacer(modifier = Modifier.height(50.dp))
                            Button(
                                onClick = {
                                    nextIndex = 1
                                    val currentIndex =
                                        intent.getIntExtra("nextIndex", 0)
                                    val totalIndex = nextIndex + currentIndex
                                    val intent = Intent(context, QuestMainActivity12::class.java)
                                    intent.putExtra("nextIndex", totalIndex)
                                    context.startActivity(intent)
                                },
                                modifier = Modifier.padding(top = 16.dp)
                            ) {
                                Text(
                                    text = "부정적인 에너지를 가진 사람",
                                    fontSize = 15.sp
                                )
                            }
                            Button(
                                onClick = {
                                    nextIndex = 2
                                    val currentIndex =
                                        intent.getIntExtra("nextIndex", 0)
                                    val totalIndex = nextIndex + currentIndex
                                    val intent = Intent(context, QuestMainActivity12::class.java)
                                    intent.putExtra("nextIndex", totalIndex)
                                    context.startActivity(intent)
                                },
                                modifier = Modifier.padding(top = 16.dp)
                            ) {
                                Text(
                                    text = "의사소통이 원활하지 않는 사람",
                                    fontSize = 15.sp
                                )
                            }
                            Button(
                                onClick = {
                                    nextIndex = 3
                                    val currentIndex =
                                        intent.getIntExtra("nextIndex", 0)
                                    val totalIndex = nextIndex + currentIndex
                                    val intent = Intent(context, QuestMainActivity12::class.java)
                                    intent.putExtra("nextIndex", totalIndex)
                                    context.startActivity(intent)
                                },
                                modifier = Modifier.padding(16.dp)
                            ) {
                                Text(
                                    text = "자기중심적인 행동을 하는 사람",
                                    fontSize = 16.sp
                                )
                            }
                            Button(
                                onClick = {
                                    nextIndex = 4
                                    val currentIndex =
                                        intent.getIntExtra("nextIndex", 0)
                                    val totalIndex = nextIndex + currentIndex
                                    val intent = Intent(context, QuestMainActivity12::class.java)
                                    intent.putExtra("nextIndex", totalIndex)
                                    context.startActivity(intent)
                                },
                                modifier = Modifier.padding(15.dp)
                            ) {
                                Text(
                                    text = "상관없다.",
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