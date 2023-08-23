package com.example.itemideltestfinal

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.foundation.layout.width
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.itemideltestfinal.ui.theme.ItemideltestfinalTheme

class QuestMainActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            var nextIndex by remember { mutableStateOf(0) }
            val context = LocalContext.current
            ItemideltestfinalTheme() {
                Surface() {

                    Box(
                        modifier = Modifier.fillMaxSize()
                    ) {
                        Column(
                            modifier = Modifier.fillMaxSize(),
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Row(
                                horizontalArrangement = Arrangement.SpaceBetween,
                                verticalAlignment = Alignment.CenterVertically,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(horizontal = 16.dp)
                            ) {
                                IconButton(
                                    onClick = {
                                        val intent = Intent(context, MainActivity::class.java)
                                        startActivity(intent)
                                    }
                                ) {
                                    Icon(
                                        imageVector = Icons.Default.KeyboardArrowLeft,
                                        contentDescription = "ArrowLeftImage",
                                        tint = Color.Black
                                    )
                                }

                                Text(
                                    text = "이상형테스트",
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 16.sp,
                                    textAlign = TextAlign.Center,
                                    modifier = Modifier.padding(16.dp)
                                )
                            }
                            Box(
                                modifier = Modifier.fillMaxWidth()

                            ) {
                                Column(
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    modifier = Modifier.fillMaxWidth()
                                ) {
                                    Box(
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .border(width = 2.dp, color = Color.Black)
                                            .padding(vertical = 16.dp),
                                        contentAlignment = Alignment.Center // 수정된 부분
                                    ) {
                                        Text(
                                            text = "먼저, 당신이\n좋아하는 상대의\n성별이 무엇인가요?",
                                            fontSize = 30.sp,
                                            modifier = Modifier.padding(
                                                top = 80.dp,
                                                bottom = 5.dp
                                            ),
                                            textAlign = TextAlign.Center,
                                            lineHeight = 50.sp,
                                            color = Color.Black
                                        )
                                    }

                                    Spacer(modifier = Modifier.height(50.dp))

                                    // 여성과 남성 이미지를 같은 Column 내에서 배치
                                    Row(
                                        horizontalArrangement = Arrangement.spacedBy(16.dp),
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .padding(bottom = 16.dp)

                                    ) {
                                        Image(
                                            painter = painterResource(id = R.drawable.girl),
                                            contentDescription = null,
                                            modifier = Modifier
                                                .height(150.dp)
                                                .width(200.dp)
                                        )
                                        Image(
                                            painter = painterResource(id = R.drawable.men),
                                            contentDescription = null,
                                            modifier = Modifier
                                                .height(150.dp)
                                                .width(200.dp)
                                        )
                                    }
                                    Column(
                                        horizontalAlignment = Alignment.CenterHorizontally,
                                        verticalArrangement = Arrangement.Center,
                                        modifier = Modifier.fillMaxWidth()
                                    ) {

                                        Row(
                                            modifier = Modifier.fillMaxWidth(),
                                            horizontalArrangement = Arrangement.spacedBy(16.dp),
                                            verticalAlignment = Alignment.CenterVertically
                                        ) {
                                            // 여자 버튼
                                            Button(
                                                onClick = {

                                                    var nextIndex = 0
                                                    val currentIndex =
                                                        intent.getIntExtra("nextIndex", 0)
                                                    val totalIndex = nextIndex + currentIndex
//                                                    val nextIndex = selectedButtonIndex + 10
                                                    val intent = Intent(
                                                        context,
                                                        QuestMainActivity3::class.java
                                                    )
                                                    intent.putExtra("nextIndex", totalIndex)
                                                    context.startActivity(intent)

                                                },
                                                modifier = Modifier.width(180.dp),
                                            ) {
                                                Text(
                                                    text = "여자",
                                                    fontSize = 50.sp,
                                                    color = Color.Red
                                                )
                                            }
                                            Spacer(modifier = Modifier.height(1250.dp))
                                            // 남자 버튼
                                            Button(
                                                onClick = {
                                                    var nextIndex = 15
                                                    val currentIndex =
                                                        intent.getIntExtra("nextIndex", 0)
                                                    val totalIndex = nextIndex + currentIndex
//                                                    val nextIndex = selectedButtonIndex + 10
                                                    val intent = Intent(
                                                        context,
                                                        QuestMainActivity3::class.java
                                                    )
                                                    intent.putExtra("nextIndex", totalIndex)
                                                    context.startActivity(intent)
                                                },
                                                modifier = Modifier.width(180.dp)
                                            ) {
                                                Text(
                                                    text = "남자",
                                                    fontSize = 50.sp,
                                                    color = Color.Blue
                                                )
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

