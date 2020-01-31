package com.example.janken

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        //インテントからデータの取り出し, get???Extraでデータ型に対応する
        val id = intent.getIntExtra("MY_HAND",0)

        when(id){
            //各リソースidと一致したものを表示
            R.id.gu -> myHandImage.setImageResource(R.drawable.gu)
            R.id.choki -> myHandImage.setImageResource(R.drawable.choki)
            R.id.pa -> myHandImage.setImageResource(R.drawable.pa)
        }
    }
}
