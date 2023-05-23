package br.senai.sp.jandira.lionschool

import CircularProgressBar
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
                modifier = Modifier.fillMaxWidth(),
                text = "MATÉRIAS",
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.SemiBold
            )
            Card(
                modifier = Modifier
                    .height(92.dp)
                    .width(342.dp),
                elevation = 3.dp
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 12.dp)
                    ,
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Row() {
                        val progress =
                            remember { mutableStateOf(0.82f) } // Set the progress value here
                        CircularProgressBar(progress.value, 1.dp)
                        Column() {
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

