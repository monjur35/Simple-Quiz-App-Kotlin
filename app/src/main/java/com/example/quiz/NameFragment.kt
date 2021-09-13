package com.example.quiz

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import com.example.quiz.databinding.FragmentNameBinding

class NameFragment : Fragment() {

     lateinit var  binding : FragmentNameBinding



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding= FragmentNameBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.startBtn.setOnClickListener{
            val name =binding.nameET.text.toString()

            if (!name.isEmpty()){
                Navigation.findNavController(it).navigate(R.id.action_nameFragment_to_questionsFragment)
            }else{
                Toast.makeText(requireContext(),"Please enter your name",Toast.LENGTH_SHORT).show()
            }
        }
    }

}