package com.example.itemideltestfinal

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.ComponentActivity
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
import androidx.compose.runtime.Composable
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
import androidx.core.content.ContextCompat.startActivity
import com.example.itemideltestfinal.ui.theme.ItemideltestfinalTheme

class ResuMainActivity13 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val context = LocalContext.current

            val goBack: () -> Unit = {
                onBackPressedDispatcher.onBackPressed()
            }
            var selectedButton1 by remember { mutableStateOf("") }
            var selectedButton2 by remember { mutableStateOf("") }
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
                        }
                    }
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Box() {

                            Text(
                                text = "이상형테스트",
                                fontWeight = FontWeight.Bold,
                                fontSize = 16.sp,
                                textAlign = TextAlign.Center
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
                                        painter = painterResource(id = R.drawable.printergirl), // 이미지 리소스 여자선택시
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
                                    text = "까탈스러운 햄찌♡",
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 22.sp,
                                )

                                Row() {
                                    Button(
                                        onClick = { selectedButton1 = "환상" },
                                        modifier = Modifier
                                            .background(
                                                color =
                                                if (selectedButton1 == "환상") MaterialTheme.colorScheme.primary
                                                else MaterialTheme.colorScheme.secondary
                                            )
                                            .width(200.dp)
                                            .clickable { }
                                    ) {
                                        Text(
                                            text = "환상",
                                            fontSize = 22.sp,
                                            color =
                                            if (selectedButton1 == "환상") Color.Blue
                                            else Color.Gray
                                        )
                                    }
                                    Button(
                                        onClick = { selectedButton2 = "현실" },
                                        modifier = Modifier
                                            .background(
                                                color = if (selectedButton2 == "현실") MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.secondary
                                            )
                                            .width(200.dp)
                                            .clickable { }
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
                                            Text(text = "귀엽지만 어른스러운 반전 매력 햄찌")
                                        }
                                        Row {
                                            Text(text = "어른스럽고 배울점이 가득함")
                                        }
                                        Row {
                                            Text(text = "본인만의 귀여운 매력이 묻어 나오는 사람")
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
                                            Text(text = "알고 보면 뒤끝 작렬까탈스러운 햄찌")
                                        }
                                        Row() {
                                            Text(text = "어른스럽다 못해 나를 가르치려고 함")
                                        }
                                        Row() {
                                            Text(text = "본인이 귀여운 줄 알고 애교를 해결하려함")
                                        }
                                        Row() {
                                            Text(text = "과할 정도로 기브 앤 테이크가 확실함")
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

