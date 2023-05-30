package br.senai.sp.jandira.lionschool.service

import br.senai.sp.jandira.lionschool.model.CourseList
import retrofit2.Call
import retrofit2.http.GET

interface CourseService {
    @GET("courses")
    fun  getCourses(): Call<CourseList>
}