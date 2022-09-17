package com.example.todayshouse.src.main

import android.os.Bundle
import com.example.todayshouse.R
import com.example.todayshouse.config.BaseActivity
import com.example.todayshouse.databinding.ActivityMainBinding
import com.example.todayshouse.src.main.home.HomeFragment
import com.example.todayshouse.src.main.move.MoveFragment
import com.example.todayshouse.src.main.mypage.MypageFragment
import com.example.todayshouse.src.main.shopping.ShoppingFragment

class MainActivity : BaseActivity<ActivityMainBinding>(ActivityMainBinding::inflate){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        supportFragmentManager.beginTransaction().replace(R.id.main_frm, HomeFragment()).commitAllowingStateLoss()

        binding.mainBnNav.run {
            setOnItemSelectedListener { item ->
                when(item.itemId) {
                    R.id.main_menu_btm_nav_home -> {
                        supportFragmentManager.beginTransaction()
                            .replace(R.id.main_frm, HomeFragment())
                            .commitAllowingStateLoss()
                    }
                    R.id.main_menu_btm_nav_shopping -> {
                        supportFragmentManager.beginTransaction()
                            .replace(R.id.main_frm, ShoppingFragment())
                            .commitAllowingStateLoss()
                    }
                    R.id.main_menu_btm_nav_move -> {
                        supportFragmentManager.beginTransaction()
                            .replace(R.id.main_frm, MoveFragment())
                            .commitAllowingStateLoss()
                    }
                    R.id.main_menu_btm_nav_mypage -> {
                        supportFragmentManager.beginTransaction()
                            .replace(R.id.main_frm, MypageFragment())
                            .commitAllowingStateLoss()
                    }
                }
                true
            }
            selectedItemId = R.id.main_menu_btm_nav_home
        }
    }
}