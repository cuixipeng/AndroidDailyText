package com.chs.androiddailytext.netease

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

/**
 * author：chs
 * date：2019/3/26
 * des：
 */
class SplashActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(SplashView(this))
    }
}