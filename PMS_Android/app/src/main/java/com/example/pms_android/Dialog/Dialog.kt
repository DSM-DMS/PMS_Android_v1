package com.example.pms_android.Dialog

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.example.pms_android.databinding.StudentCodeDialogBinding

class Dialog : DialogFragment() {

    lateinit var binding : StudentCodeDialogBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = StudentCodeDialogBinding.inflate(inflater,container,false)

        

        return binding .root
    }




}

