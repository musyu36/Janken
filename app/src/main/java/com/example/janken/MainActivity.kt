package com.example.janken

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //じゃんけんボタンをクリックしたときにonJankenButtonTappedを呼び出し
        //OnClickListenerインターフェイスはonClickメソッドしか持たないSAMインターフェイスなので、ラムダ式で置き換え可
        //onClickはViewを受け取りvoidを返すメソッドなのでメソッドなのでラムダの関数型は(view)->Unitととなる
        //ラムダ式の引数が1つだけなのでitでViewの代用、ラムダ式がsetOnclickListenerの唯一の関数かつ最後の引数なので()の外に出せる、かつ()を省略
        gu.setOnClickListener{onJankenButtonTapped(it)}
        choki.setOnClickListener{onJankenButtonTapped(it)}
        pa.setOnClickListener{onJankenButtonTapped(it)}
    }

    //じゃんけんボタンをクリックしたとき、ResultActivityを開く
    //Intent(環境情報などをアプリ全体で共有するためのインターフェイス, クラス名::class.javaでクラスのインスタンスを取得)
    fun onJankenButtonTapped(view: View?){
        val intent = Intent(this, ResultActivity::class.java)
        //インテントへのデータ格納, putExtra(key(任意), value)
        intent.putExtra("MY_HAND", view?.id)
        //画面遷移
        startActivity(intent)
    }
}
