package br.senai.sp.jandira.lion_shool.gui

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.lionschool.R
import br.senai.sp.jandira.lionschool.gui.ui.theme.LionSchoolTheme
import br.senai.sp.jandira.lionschool.model.CourseList
import br.senai.sp.jandira.lionschool.service.RetrofitFactory
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class SelectCourseActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LionSchoolTheme {
                // A surface container using the 'background' color from the theme

                SelectCourseScreen()
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun SelectCourseScreen() {
    var courses by remember {
        mutableStateOf(listOf<br.senai.sp.jandira.lionschool.model.Course>())
    }

    Button(onClick = {
        //Chamada para a API
        val call = RetrofitFactory().getCourseService().getCourses()

        call.enqueue(object : Callback<CourseList> {
            override fun onResponse(
                call: Call<CourseList>, response: Response<CourseList>
            ) {
                courses = response.body()!!.courses
            }

            override fun onFailure(call: Call<CourseList>, t: Throwable) {
                Log.i(
                    "ds2m", "onFailure: ${t.message}"
                )
            }

        })

    }) {
        Text(text = "List All Characters")

    }
//        // Chamada para a API
//        val call = RetrofitFactory
//
//        call.enqueue(object : Callback<CharacterList> {
//
//            override fun onResponse(
//                call: Call<CharacterList>,
//                response: Response<CharacterList>
//            ) {
//                results = response.body()!!.results
//                info = response.body()!!.info
//            }
//
//            override fun onFailure(call: Call<CharacterList>, t: Throwable) {
//                Log.i(
//                    "ds2m",
//                    "onFailure: ${t.message} "
//                )
//            }
//
//        })



    LionSchoolTheme {
        Surface(
            modifier = Modifier.fillMaxSize()
        ) {
            Column(modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center) {
                Text(
                    text = stringResource(id = R.string.welcome).uppercase(),
                    fontSize = 20.sp,
                    fontWeight = FontWeight.ExtraBold,
                    color = Color.Black
                )
                Spacer(modifier = Modifier.height(50.dp))
                Row() {
                    Text(
                        text = stringResource(id = R.string.choose_one),
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Normal,
                        color = Color.Black
                    )
                    Spacer(modifier = Modifier.width(5.dp))
                    Text(
                        text = stringResource(id = R.string.course),
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        color = colorResource(id = R.color.primary_color)
                    )
                    Spacer(modifier = Modifier.width(5.dp))
                    Text(
                        text = stringResource(id = R.string.to_manage),
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Normal,
                        color = Color.Black
                    )
                }

                Spacer(modifier = Modifier.height(50.dp))
                Image(
                    painterResource(id = R.drawable.class_image),
                    contentDescription = "Logo Lion School",
                    modifier = Modifier
                        .width(300.dp)
                        .height(200.dp)
                )
                Spacer(modifier = Modifier.height(50.dp))

                Button(
                    onClick = {

                    },
                    modifier = Modifier
                        .width(190.dp)
                        .height(45.dp),
                    colors = ButtonDefaults.buttonColors(colorResource(id = R.color.secondary_color)),
                    shape = RoundedCornerShape(30.dp)

                )
                {
                    Text(
                        text = stringResource(id = R.string.classes_button),
                        fontSize = 14.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = Color.White

                    )
                }

                Spacer(modifier = Modifier.height(24.dp))

                Button(
                    onClick = {

                    },
                    modifier = Modifier
                        .width(190.dp)
                        .height(45.dp),
                    colors = ButtonDefaults.buttonColors(colorResource(id = R.color.secondary_color)),
                    shape = RoundedCornerShape(30.dp)

                )
                {
                    Text(
                        text = stringResource(id = R.string.classes_button),
                        fontSize = 14.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = Color.White

                    )
                }
            }

        }
    }

}