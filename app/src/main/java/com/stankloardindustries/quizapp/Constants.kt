package com.stankloardindustries.quizapp

object Constants{

    const val USER_NAME: String = "username"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answer"

    fun getQuestions(): ArrayList<Question>{
        val questionList = ArrayList<Question>()
        val ask = "what country does this flag belongs to?"

        val q1 = Question(
            1,
            ask,
            R.drawable.ic_flag_of_australia,
            "Africa",
            "Ausaka",
            "Australia",
            "Amber",
            3
        )

        questionList.add(q1)

        val q2 = Question(
            2,
            ask,
            R.drawable.ic_flag_of_argentina,
            "Australia",
            "Armenia",
            "Austria",
            "Argentina",
            4
        )

        questionList.add(q2)

        val q3 = Question(
            3,
            ask,
            R.drawable.ic_flag_of_belgium,
            "Bangladesh",
            "Belgium",
            "Belarus",
            "Bahrain",
            2
        )

        questionList.add(q3)

        val q4 = Question(
            4,
            ask,
            R.drawable.ic_flag_of_brazil,
            "Bavaria",
            "Bahamas",
            "Brazil",
            "Baden",
            3
        )

        questionList.add(q4)

        val q5 = Question(
            5,
            ask,
            R.drawable.ic_flag_of_denmark,
            "Djibouti",
            "Denmark",
            "Dominica",
            "Douchy of Parma",
            2
        )

        questionList.add(q5)

        val q6 = Question(
            6,
            ask,
            R.drawable.ic_flag_of_fiji,
            "France",
            "Finland",
            "Albania",
            "Fiji",
            4
        )

        questionList.add(q6)

        val q7 = Question(
            7,
            ask,
            R.drawable.ic_flag_of_germany,
            "Guatemala",
            "Germany",
            "Ghana",
            "Guinea",
            2
        )

        questionList.add(q7)

        val q8 = Question(
            8,
            ask,
            R.drawable.ic_flag_of_india,
            "India",
            "Indonesia",
            "Italy",
            "Iran",
            1
        )

        questionList.add(q8)

        val q9 = Question(
            9,
            ask,
            R.drawable.ic_flag_of_kuwait,
            "Kenya",
            "Kuwait",
            "Kazakhstan",
            "kyrgyzstan",
            2
        )

        questionList.add(q9)

        val q10 = Question(
            1,
            ask,
            R.drawable.ic_flag_of_new_zealand,
            "Netherlands",
            "Nepal",
            "New Zealand",
            "Nicaragua",
            3
        )

        questionList.add(q10)

        return questionList
    }
}