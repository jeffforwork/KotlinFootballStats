package com.example.footballstatapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.NavController
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_login_page.*

class LoginPage : Fragment() {

    lateinit var navController: NavController

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?
    {
        getActivity()?.setTitle("Login")
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login_page, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)

            login_button.setOnClickListener {
                login_button()
        }
            create_button.setOnClickListener {
                create_button()
        }
    }
    public fun login_button(){
        val username = username_editText.text.toString()
        val password = password_editText.text.toString()

        if (username == "Jeff" && password == "12345")
        {
            navController.navigate(R.id.action_loginPage_to_menuPage)
        }
        else { }
    }
    public fun create_button(){

            navController.navigate(R.id.action_loginPage_to_createAccount)

    }
}

