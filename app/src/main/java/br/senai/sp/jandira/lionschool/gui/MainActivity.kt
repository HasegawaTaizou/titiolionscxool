package br.senai.sp.jandira.lionschool.gui

import CircularProgressBar
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.lionschool.R
import br.senai.sp.jandira.lionschool.ui.theme.LionSchoolTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LionSchoolTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background
                ) {
                    SelectedStudent()
                }
            }
        }
    }
}

@Composable
fun SelectedStudent() {


    Surface() {
//        Column() {
//            Card(
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .height(82.dp),
//                shape = RectangleShape,
//                backgroundColor = Color.Blue
//            ) {
//                IconButton(onClick = {}) {
//                    Icon(
//                        painter = painterResource(id = R.drawable.baseline_menu_24),
//                        contentDescription = stringResource(id = R.string.menu_description),
//                        tint = Color.White
//                    )
//                }
//            }
//        }
//        Card(
//            modifier = Modifier
//                .fillMaxWidth()
//                .height(155.dp),
//            shape = RoundedCornerShape(bottomStart = 70.dp),
//            backgroundColor = Color(red = 51, green = 71, blue = 176)
//        ) {
//            Column() {
//
//            }
//            Row(
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .height(59.dp)
//                    .padding(start = 25.dp, top = 19.dp),
//            ) {
//                Image(
//                    painterResource(id = R.drawable.baseline_menu_24),
//                    contentDescription = "Menu",
//                    modifier = Modifier
//                        .width(21.dp)
//                        .height(16.dp)
//                )
//                Text(
//                    modifier = Modifier.fillMaxWidth(),
//                    textAlign = TextAlign.Center,
//                    text = stringResource(R.string.course_name).uppercase(),
//                    fontSize = 15.sp,
//                    fontWeight = FontWeight.Normal,
//                    color = Color.White,
//
//                    )
//            }
//
//        }
        Column() {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .padding(46.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.user),
                        contentDescription = stringResource(
                            id = R.string.user_description
                        ),
                        modifier = Modifier.size(124.dp)
                    )
                    Text(
                        text = "Jose Matheus da Silva Miranda",
                        fontSize = 18.sp,
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 24.dp),
                text = "MATÉRIAS",
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.SemiBold
            )
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Card(
                    modifier = Modifier
                        .height(92.dp)
                        .width(342.dp),
                    shape = RoundedCornerShape(20.dp),
                    elevation = 3.dp
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 12.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Row(
                            modifier = Modifier.fillMaxHeight(),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            val progress =
                                remember { mutableStateOf(0.82f) } // Set the progress value here
                            CircularProgressBar(progress.value, 1.dp, color = Color.Blue)
                            Column(
                                modifier = Modifier.fillMaxHeight(),
                                verticalArrangement = Arrangement.Center
                            ) {
                                Text(
                                    text = "SOP",
                                    fontSize = 18.sp,
                                    fontWeight = FontWeight.Medium
                                )
                                Text(
                                    text = "Sistemas Operacionais",
                                    fontSize = 12.sp,
                                    fontWeight = FontWeight.Light
                                )
                            }
                        }
                        Card(
                            modifier = Modifier
                                .height(55.dp)
                                .width(3.dp),
                            backgroundColor = Color.Blue
                        ) {
                        }
                    }

                }
                Spacer(modifier = Modifier.height(18.dp))
                Card(
                    modifier = Modifier
                        .height(92.dp)
                        .width(342.dp),
                    shape = RoundedCornerShape(20.dp),
                    elevation = 3.dp
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 12.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Row(
                            modifier = Modifier.fillMaxHeight(),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            val progress =
                                remember { mutableStateOf(0.23f) } // Set the progress value here
                            CircularProgressBar(progress.value, 1.dp, color = Color(193, 16, 16))
                            Column(
                                modifier = Modifier.fillMaxHeight(),
                                verticalArrangement = Arrangement.Center
                            ) {
                                Text(
                                    text = "IPR",
                                    fontSize = 18.sp,
                                    fontWeight = FontWeight.Medium
                                )
                                Text(
                                    text = "Ipr AAAAA",
                                    fontSize = 12.sp,
                                    fontWeight = FontWeight.Light
                                )
                            }
                        }
                        Card(
                            modifier = Modifier
                                .height(55.dp)
                                .width(3.dp),
                            backgroundColor = Color(193, 16, 16),

                            ) {
                        }
                    }

                }
                Spacer(modifier = Modifier.height(18.dp))
                Card(
                    modifier = Modifier
                        .height(92.dp)
                        .width(342.dp),
                    shape = RoundedCornerShape(20.dp),
                    elevation = 3.dp,
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 12.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Row(
                            modifier = Modifier.fillMaxHeight(),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            val progress =
                                remember { mutableStateOf(0.55f) } // Set the progress value here
                            CircularProgressBar(progress.value, 1.dp, Color(229, 182, 87))
                            Column(
                                modifier = Modifier.fillMaxHeight(),
                                verticalArrangement = Arrangement.Center
                            ) {
                                Text(
                                    text = "LIMA",
                                    fontSize = 18.sp,
                                    fontWeight = FontWeight.Medium
                                )
                                Text(
                                    text = "Linguagem de Marcação",
                                    fontSize = 12.sp,
                                    fontWeight = FontWeight.Light
                                )
                            }
                        }
                        Card(
                            modifier = Modifier
                                .height(55.dp)
                                .width(3.dp),
                            backgroundColor = Color(229, 182, 87)
                        ) {
                        }
                    }

                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    LionSchoolTheme {
        SelectedStudent()
    }
}

//@Composable
//fun CircularProgressBar(progress: Float) {
//    CircularProgressIndicator(
//        progress = progress,
//        modifier = Modifier
//            .size(64.dp)
//            .padding(16.dp),
//        color = Color.Blue, // Customize the color here
//        strokeWidth = 3.dp // Customize the thickness here
//    )
//}

