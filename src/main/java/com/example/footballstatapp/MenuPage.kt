package com.example.footballstatapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_menu_page.*

class MenuPage : Fragment() {

    lateinit var navController: NavController

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?
    {
        getActivity()?.setTitle("Menu")

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_menu_page, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)

        bayernmuchen_img.setOnClickListener {
            val toast = Toast.makeText(getActivity()?.getBaseContext(),"Bayern Muchen",Toast.LENGTH_SHORT)
            toast.show()
            bayernpage()
        }
        bayerncolor_img.setOnClickListener {
            val toast = Toast.makeText(getActivity()?.getBaseContext(),"Bayern Muchen",Toast.LENGTH_SHORT)
            toast.show()
            bayernpage()
        }
        realmadrid_img.setOnClickListener {
            val toast = Toast.makeText(getActivity()?.getBaseContext(),"Real Madrid",Toast.LENGTH_SHORT)
            toast.show()
            realmadridpage()
        }
        realmadridcolor_img.setOnClickListener {
            val toast = Toast.makeText(getActivity()?.getBaseContext(),"Real Madrid",Toast.LENGTH_SHORT)
            toast.show()
            realmadridpage()
        }

    }

    public fun bayernpage(){
        navController.navigate(R.id.action_menuPage_to_bayernPage)
    }

    public fun realmadridpage(){
        navController.navigate(R.id.action_menuPage_to_realmadridPage)
    }

}