package com.lichenqi.mhyx.activity

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.lichenqi.mhyx.MainActivity

class StartActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Handler().postDelayed({
            var intent: Intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, 1500)
    }
}