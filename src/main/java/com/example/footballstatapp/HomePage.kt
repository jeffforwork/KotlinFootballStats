package com.example.footballstatapp

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_home_page.*
import kotlinx.android.synthetic.main.fragment_login_page.view.*

class HomePage : Fragment()
{
    lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View?{

        getActivity()?.setTitle("Football Statistics")
        return inflater.inflate(R.layout.fragment_home_page,container,false)
    }

//    private fun loginwindow() {
//        val customView = LayoutInflater.from(this).inflate(R.layout.fragment_login_page,null)
//        val builder = AlertDialog.Builder(this).apply {
//            setView(customView)
//        }
//        val dialog = builder.create()
//        dialog.show()
//        customView.login_button.setOnClickListener {
//            dialog.dismiss()
//            val username = customView.username_editText.text.toString()
//            val password = customView.password_editText.text.toString()
//            val intent = Intent(this@HomePage,MenuPage::class.java)
//
//            if (username == "Jeffrey" && password == "123456789"){
//                intent.putExtra("username",username)
//                intent.putExtra("password",password)
//                startActivity(intent)
//            }else Toast.makeText(this,"Wrong username or password", Toast.LENGTH_SHORT).show()
//        }
//    }
    override  fun onViewCreated(view: View,savedInstanceState: Bundle?){
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)

        start_button.setOnClickListener {
            navController.navigate(R.id.action_homePage_to_loginPage)
        }
    }
}