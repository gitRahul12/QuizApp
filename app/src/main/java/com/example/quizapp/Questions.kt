package com.example.quizapp

 data class Questions (
     var id : Int,
     var question : String,
     var image : Int,
     var optionOne : String,
     var optionTwo : String,
     var optionThree : String,
     var optionFour : String,
     var correctAnswer : Int
 )