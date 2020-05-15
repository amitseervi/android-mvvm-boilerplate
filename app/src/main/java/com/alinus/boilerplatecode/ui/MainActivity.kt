package com.alinus.boilerplatecode.ui

import android.os.Bundle
import android.view.GestureDetector
import android.view.MotionEvent
import android.view.View
import androidx.core.view.GestureDetectorCompat
import androidx.databinding.DataBindingUtil
import com.alinus.boilerplatecode.R
import com.alinus.boilerplatecode.databinding.ActivityMainBinding
import dagger.android.HasAndroidInjector
import dagger.android.support.DaggerAppCompatActivity

class MainActivity : DaggerAppCompatActivity(), HasAndroidInjector {
    private lateinit var viewDataBinding: ActivityMainBinding
    private lateinit var mGestureDetector: GestureDetectorCompat
    private val gestureListener = object : GestureDetector.SimpleOnGestureListener() {
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewDataBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        //hideSystemUI()
        mGestureDetector = GestureDetectorCompat(this, gestureListener)
    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if (hasFocus) {
            //hideSystemUI()
        }
    }


    private fun hideSystemUI() {
        window.decorView.systemUiVisibility = (View.SYSTEM_UI_FLAG_IMMERSIVE
                or View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                or View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                or View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                or View.SYSTEM_UI_FLAG_FULLSCREEN)
    }

    private fun showSystemUI() {
        window.decorView.systemUiVisibility = (View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                or View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN)
    }

    private fun isSystemUiVisible(): Boolean {
        return (window.decorView.systemUiVisibility and View.SYSTEM_UI_FLAG_IMMERSIVE) == 0
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        mGestureDetector.onTouchEvent(event)
        return super.onTouchEvent(event)
    }
}
