package com.example.quizapp

object Constants {

    const val USER_NAME : String = "user name"
    const val CORRECT_ANSWERS : String = "correct_answers"
    const val TOTAL_QUESTIONS : String = "total_questions"

    fun getQuestions () : ArrayList<Questions>{
         val questionsList = ArrayList<Questions> ()

         //1
         val ques1 = Questions(
             1,
             "What is the capital of Australia?",
              R.drawable.ic_australia,
             "Brisbane",
             "Perth",
             "Sydney",
             "Canberra",
             4
         )
        //2
        val ques2 = Questions(
            2,
            "What is the capital of Brazil?",
            R.drawable.ic_brazil,
            "Rio de Janeiro",
            "Brasilia",
            "Salvador",
            "Manaus",
            2
        )
        //3
        val ques3 = Questions(
            3,
            "What is the capital of Canada?",
            R.drawable.ic_canada,
            "Toranto",
            "Ottawa",
            "Vancouver",
            "Brampton",
            2
        )
        //4
        val ques4 = Questions(
            4,
            "What is the capital of India?",
            R.drawable.ic_india,
            "Kolkata",
            "Mumbai",
            "New Delhi",
            "Chandigarh",
            3
        )
        //5
        val ques5 = Questions(
            5,
            "What is the capital of Ireland?",
            R.drawable.ic_ireland,
            "Dublin",
            "Galway",
            "Norway",
            "Ice City",
            1
        )
        //6
        val ques6 = Questions(
            6,
            "What is the capital of Japan?",
            R.drawable.ic_japan,
            "Tokyo",
            "Yokohama",
            "Osaka",
            "Hiroshima",
            1
        )
        //7
        val ques7 = Questions(
            7,
            "What is the capital of Russia?",
            R.drawable.ic_russia,
            "St. Petersburg",
            "Kazan",
            "Moscow",
            "Samara",
            3
        )
        //8
        val ques8 = Questions(
            8,
            "What is the capital of South Africa?",
            R.drawable.ic_south_africa,
            "Pretoria",
            "East London",
            "Durban",
            "Cape Town",
            4
        )
        //9
        val ques9 = Questions(
            9,
            "What is the capital of Spain?",
            R.drawable.ic_spain,
            "Madrid",
            "Barcelona",
            "Granada",
            "Seville",
            1
        )
        //10
        val ques10 = Questions(
            10,
            "What is the capital of Switzerland?",
            R.drawable.ic_switzerland,
            "Basel",
            "Lucerne",
            "Bern",
            "Chur",
            3
        )

        questionsList.add(ques1)
        questionsList.add(ques2)
        questionsList.add(ques3)
        questionsList.add(ques4)
        questionsList.add(ques5)
        questionsList.add(ques6)
        questionsList.add(ques7)
        questionsList.add(ques8)
        questionsList.add(ques9)
        questionsList.add(ques10)

        return questionsList
    }
}