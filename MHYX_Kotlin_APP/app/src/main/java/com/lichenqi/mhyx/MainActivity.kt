package com.lichenqi.mhyx

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import butterknife.ButterKnife
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.lichenqi.mhyx.fragment.MyFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ButterKnife.bind(this)
        navView.setOnNavigationItemReselectedListener { onNavigationItemSelectedListener }
    }

    private val onNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.home -> {
                return@OnNavigationItemSelectedListener true
            }
            R.id.brand -> {
                return@OnNavigationItemSelectedListener true
            }
            R.id.vip -> {
                return@OnNavigationItemSelectedListener true
            }
            R.id.circle -> {
                return@OnNavigationItemSelectedListener true
            }
            R.id.mine -> {
                return@OnNavigationItemSelectedListener true
                initFragment()
            }
        }
        true
    }

    private fun initFragment() {
        val supportFragmentManager = supportFragmentManager
        val beginTransaction = supportFragmentManager.beginTransaction()
        beginTransaction.add(R.id.frameLayout, MyFragment(), "4").commitAllowingStateLoss()
    }
}





