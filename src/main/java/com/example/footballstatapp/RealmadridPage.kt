package com.example.footballstatapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class RealmadridPage : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        getActivity()?.setTitle("Real Madrid")
        return inflater.inflate(R.layout.fragment_realmadrid_page, container, false)
    }

}