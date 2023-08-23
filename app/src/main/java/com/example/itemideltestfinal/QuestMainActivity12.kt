package com.example.itemideltestfinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
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

class QuestMainActivity12 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            var nextIndex by remember { mutableStateOf(0) }
            val context = LocalContext.current
            val selectedButtonIndex = intent.getIntExtra("selectedButtonIndex", 0)
            val intent = Intent(context, QuestMainActivity10::class.java)
            val totalScore = intent.getIntExtra("totalScore", 0)
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
                                val intent = Intent(context, QuestMainActivity11::class.java)
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
                            Text(
                                text =  "당신의 \n최종 \n테스트 결과는?",
                                fontSize = 40.sp,
                                lineHeight = 40.sp,
                            )
                            Spacer(modifier = Modifier.height(100.dp))
                            Button(
                                onClick = {

                                    val totalIndex = selectedButtonIndex + nextIndex
                                    //val totalIdex = intent.getIntExtra("nextIndex", 0)
                                    val intent = Intent(context, when (selectedButtonIndex) {
                                        in 37..40 -> ResuMainActivity13::class.java
                                        in 30..36 -> ResuMainActivity14::class.java
                                        in 20..29 -> ResuMainActivity15::class.java
                                        in 14..19 -> ResuMainActivity13::class.java
                                      //  in 50..53 -> ResumMainActivity17::class.java
                                      //  in 42..44 -> ResumMainActivity18::class.java
                                      //  in 30..65 -> ResumMainActivity19::class.java
                                      //  in 66..69 -> ResumMainActivity20::class.java
                                        else -> ResuMainActivity13::class.java
                                    })

                                    intent.putExtra("selectedButtonIndex", selectedButtonIndex)
                                    intent.putExtra("totalIndex", totalIndex) // 변경된 totalIndex를 인텐트에 추가
                                    context.startActivity(intent)
                                   /* val selectedButtonIndex = 0 // 여자를 선택한 버튼에 따라 적절한 인덱스 설정
                                    val intent = Intent(context, when (selectedButtonIndex) {
                                        in 37..40 ->ResuMainActivity13::class.java
                                        in 30..36 ->ResuMainActivity14::class.java
                                        in 20..29 ->ResuMainActivity15::class.java
                                        in 14..19 ->ResuMainActivity16::class.java
                                        in 50..53 ->ResumMainActivity17::class.java
                                        in 42..44 ->ResumMainActivity18::class.java
                                        in 30..65 ->ResumMainActivity19::class.java
                                        in 66..69 ->ResumMainActivity20::class.java
                                        else -> ResuMainActivity14::class.java
                                    })
                                    intent.putExtra("selectedButtonIndex", selectedButtonIndex)
                                    context.startActivity(intent)

                                    */
                                    Log.d("Debug", "Selected Button Index: $selectedButtonIndex")
                                },
                                modifier = Modifier.padding(top = 16.dp)
                            ) {
                                Text(
                                    text = "최종 결과 확인",


                                    fontSize = 15.sp
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}


