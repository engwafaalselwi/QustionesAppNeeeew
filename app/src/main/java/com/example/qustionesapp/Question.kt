package com.example.qustionesapp

import androidx.annotation.StringRes

data class Question(@StringRes val textResId:Int, var answer:Boolean ){

}