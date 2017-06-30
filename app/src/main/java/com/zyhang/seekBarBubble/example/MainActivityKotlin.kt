package com.zyhang.seekBarBubble.example

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.LayoutInflater
import android.widget.SeekBar
import com.zyhang.seekBarBubble.delegate.SeekBarBubbleDelegate
import com.zyhang.seekBarBubble.delegate.kotlin.addOnSeekBarChangeListener
import com.zyhang.seekBarBubble.delegate.kotlin.attachToSeekBar

/**
 * ProjectName:SeekBarBubble
 * Description:
 * Created by zyhang on 2017/7/1.0:11
 * Modify by:
 * Modify time:
 * Modify remark:
 */

class MainActivityKotlin : AppCompatActivity(), SeekBar.OnSeekBarChangeListener {

    companion object {
        private val TAG = "MainActivityKotlin"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_kotlin)

        val seekBar = findViewById(R.id.seekBar) as SeekBar
        val seekBarBubbleDelegate = SeekBarBubbleDelegate(this,
                LayoutInflater.from(this).inflate(R.layout.seekbar_bubble, null))
        seekBarBubbleDelegate.attachToSeekBar(seekBar)
        seekBar.addOnSeekBarChangeListener(this)
    }

    override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
        Log.i(TAG, "onProgressChanged progress === $progress")
    }

    override fun onStartTrackingTouch(seekBar: SeekBar) {
        Log.i(TAG, "onStartTrackingTouch")
    }

    override fun onStopTrackingTouch(seekBar: SeekBar) {
        Log.i(TAG, "onStopTrackingTouch")
    }

}