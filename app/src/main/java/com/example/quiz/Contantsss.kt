package com.example.quiz

import com.example.quiz.R
import com.example.quiz.models.QuestionModel

object Contantsss {
    fun getQuestions() : ArrayList<QuestionModel>{
        val questionList=ArrayList<QuestionModel>()

        val ques1=QuestionModel(1,"What is the name of it?", R.drawable.bird,"Cat","Bird","Duck","Nothing",2)
        questionList.add(ques1)

        val ques2=QuestionModel(2,"What is the name of it?", R.drawable.butterfly,"Butterfly","Bird","Duck","Cat",1)
        questionList.add(ques2)

        val ques3=QuestionModel(3,"What is the name of it?", R.drawable.cat,"Cat","Bird","tiger","Fly",1)
        questionList.add(ques3)

        val ques4=QuestionModel(4,"What is the name of it?", R.drawable.dog,"Cat","Dog","Lion","Bird",2)
        questionList.add(ques4)

        val ques5=QuestionModel(5,"What is the name of it?", R.drawable.elephant,"Elephant","Lion","Dog","Cat",1)
        questionList.add(ques5)

        val ques6=QuestionModel(6,"What is the name of it?", R.drawable.lion,"Cat","Dog","Lion","Bird",3)
        questionList.add(ques6)

        val ques7=QuestionModel(7,"What is the name of it?", R.drawable.panda,"Bird","Dog","Lion","Panda",4)
        questionList.add(ques7)

        val ques8=QuestionModel(8,"What is the name of it?", R.drawable.peacock,"Cat","Dog","PeaCock","Bird",3)
        questionList.add(ques8)

        val ques9=QuestionModel(9,"What is the name of it?", R.drawable.swan,"Swan","Cat","Panda","Bird",1)
        questionList.add(ques9)

        val ques10=QuestionModel(10,"What is the name of it?", R.drawable.tiger,"Elephant","Dog","Tiger","Lion",3)
        questionList.add(ques10)

        return questionList
    }
}