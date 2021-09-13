package com.example.quiz

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.quiz.databinding.FragmentQuestionsBinding


class QuestionsFragment : Fragment() {

    lateinit var binding :FragmentQuestionsBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding= FragmentQuestionsBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val constant=Contantsss.getQuestions()

        Toast.makeText(requireContext(),"${constant.size}", Toast.LENGTH_SHORT).show()
    }

}