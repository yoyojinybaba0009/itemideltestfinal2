package com.example.itemideltestfinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
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

class ResumMainActivity20 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            var selectedButton1 by remember { mutableStateOf("") }
            var selectedButton2 by remember { mutableStateOf("") }
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
                                val intent = Intent(context, QuestMainActivity12::class.java)
                                startActivity(intent)
                            }) {
                                Icon(
                                    imageVector = Icons.Default.KeyboardArrowLeft,
                                    contentDescription = "ArrowLeftImage",
                                    tint = Color.Black
                                )
                            }
                            Box(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .verticalScroll(rememberScrollState()),
                                contentAlignment = Alignment.Center
                            ) {
                                Column() {
                                    Box() {
                                        Image(
                                            painter = painterResource(id = R.drawable.printergirl4), // 이미지 리소스
                                            contentDescription = null, // 필요한 경우 추가
                                            modifier = Modifier
                                                .size(400.dp) // 이미지 크기 조절
                                        )
                                    }

                                    Box() {
                                        Row(
                                            verticalAlignment = Alignment.CenterVertically,
                                            horizontalArrangement = Arrangement.spacedBy(8.dp)
                                        ) {
                                            Icon(
                                                painter = painterResource(id = R.drawable.haert), // 아이콘 이미지 리소스
                                                contentDescription = null, //  (필요한 경우 추가)
                                                modifier = Modifier.size(32.dp) // 아이콘 크기 조절
                                            )
                                            Text(
                                                text = "이상형 테스트 결과",
                                                fontWeight = FontWeight.Bold,
                                                fontSize = 30.sp,
                                                textAlign = TextAlign.Center,
                                            )
                                            Icon(
                                                painter = painterResource(id = R.drawable.haert), // 아이콘 이미지 리소스
                                                contentDescription = null, //  (필요한 경우 추가)
                                                modifier = Modifier.size(32.dp) // 아이콘 크기 조절
                                            )
                                        }
                                    }
                                    Text(
                                        text = "나의 현실 이상형은",
                                        fontWeight = FontWeight.Bold,
                                        fontSize = 22.sp,
                                    )
                                    Text(
                                        text = "전쟁광 아테나♡",
                                        fontWeight = FontWeight.Bold,
                                        fontSize = 22.sp,
                                    )

                                    Row() {
                                        Button(
                                            onClick = { selectedButton1 == "환상" },
                                            modifier = Modifier
                                                .background(
                                                    color = if (selectedButton1 == "환상") MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.secondary
                                                )
                                                .width(200.dp)
                                                .clickable {  }
                                        ) {
                                            Text(
                                                text = "환상",
                                                fontSize = 22.sp,
                                                color = if (selectedButton1 == "환상") Color.Blue else Color.Gray
                                            )
                                        }
                                        Button(
                                            onClick = { selectedButton2 == "현실" },
                                            modifier = Modifier
                                                .background(
                                                    color = if (selectedButton2 == "현실") MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.secondary
                                                )
                                                .width(200.dp)
                                        ) {

                                            Text(
                                                text = "현실",
                                                fontSize = 22.sp,
                                                color = if (selectedButton2 == "현실") Color.Red else Color.Gray
                                            )
                                        }
                                        Spacer(modifier = Modifier.height(62.dp))
                                    }
                                    Box() {
                                        Column() {
                                            Row() {
                                                Text(
                                                    text = "환상속 내가 꿈꾸는 사랑은...",
                                                    fontWeight = FontWeight.Bold,
                                                    fontSize = 18.sp,
                                                )
                                            }

                                            Row() {
                                                Text(text = "똑 부러지고 섬세한 지혜로운 여신")
                                            }
                                            Row {
                                                Text(text = "내 사생활을 존중해주는 배려를 지님")
                                            }
                                            Row {
                                                Text(text = "생각이 깊고 어른스러움이 느껴지는 매력 ")
                                            }
                                        }
                                        Spacer(modifier = Modifier.height(155.dp))
                                    }
                                    Box() {
                                        Column() {
                                            Row() {
                                                Text(
                                                    text = "현실속 내가 꿈꾸는 사랑은...",
                                                    fontWeight = FontWeight.Bold,
                                                    fontSize = 18.sp,
                                                )
                                            }
                                            Row() {
                                                Text(text = "나를 부러뜨리는 전쟁광 아테나")
                                            }
                                            Row() {
                                                Text(text = "프라이버시를 핑계로 모든걸 숨김")
                                            }
                                            Row() {
                                                Text(text = "서운할 정도로 선을 자주 그음")
                                            }
                                            Row() {
                                                Text(text = "조금이라도 게으름 피우면 경멸의 눈빛을 보냄")
                                            }
                                            Box() {
                                                Button(
                                                    onClick = {
                                                        val intent =
                                                            Intent(context, MainActivity::class.java)
                                                        startActivity(intent)
                                                    },
                                                    modifier = Modifier.width(500.dp)
                                                ) {
                                                    Text(
                                                        text = "테스트 다시하기",
                                                        fontSize = 22.sp,
                                                    )
                                                }
                                                Spacer(modifier = Modifier.height(115.dp))
                                            }
                                        }
                                    }
                                }
                                Spacer(modifier = Modifier.height(200.dp))
                            }
                        }
                    }
                }
            }
        }
    }
}


