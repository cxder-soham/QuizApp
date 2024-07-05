package com.soham.quizapp

object Constants {

    fun getQuestion(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1, "What country does this flag belong to?",
            R.drawable.ic_mex_flag,
            "Cuba",
            "Mexico",
            "Portugal",
            "Costa Rica",
            2
        )
        questionsList.add(que1)
        val que2 = Question(
            2, "What country does this flag belong to?",
            R.drawable.ic_ind_flag,
            "Ireland",
            "Niger",
            "India",
            "Italy",
            3
        )
        questionsList.add(que2)
        val que3 = Question(
            3, "What country does this flag belong to?",
            R.drawable.ic_ger_flag,
            "Ghana",
            "Belgium",
            "Argentina",
            "Germany",
            4
        )
        questionsList.add(que3)
        val que4 = Question(
            4, "What country does this flag belong to?",
            R.drawable.ic_usa_flag,
            "England",
            "Australia",
            "USA",
            "Ireland",
            3
        )
        questionsList.add(que4)
        val que5 = Question(
            5, "What country does this flag belong to?",
            R.drawable.ic_swiss_flag,
            "Denmark",
            "Switzerland",
            "Peru",
            "Turkey",
            2
        )
        questionsList.add(que5)
        return questionsList
    }
}