package com.zay.koin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zay.koin.presenter.Presenter
import com.zay.koin.view.SampleView
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.android.ext.android.getKoin
import org.koin.android.ext.android.inject
import org.koin.android.scope.currentScope
import org.koin.android.scope.lifecycleScope

class MainActivity : AppCompatActivity() , SampleView {

    val presenter : Presenter by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter.initView(this)
        presenter.onCreate()
    }

    override fun showData(t : String) {
        tvShow.text = t
    }
}
