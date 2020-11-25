package com.example.pms_android.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.pms_android.R
import com.example.pms_android.adaptor.Notice
import com.example.pms_android.adaptor.NoticeAdaptor
import kotlinx.android.synthetic.main.fragment_notion.*
import kotlinx.android.synthetic.main.fragment_notion.view.*

class NotionFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_notion, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val test = NoticeAdaptor(mutableListOf<Notice>(Notice("두번째","2020.4.24")))
        notice_recyclerview.adapter= test

        test.addItem(Notice("첫번째","2020.4.9"))
        test.addItem(Notice("집가자","2020.11.27"))
        test.addItem(Notice("학교가자","2020.11.29"))
        test.addItem(Notice("정처기 시험치자","2020.11.28"))
        test.addItem(Notice("밥먹자","2020.11.26"))
        test.notifyDataSetChanged()
        notice_recyclerview.layoutManager = LinearLayoutManager(requireActivity())

    }
}

