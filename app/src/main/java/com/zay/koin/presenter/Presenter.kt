package com.zay.koin.presenter

import com.zay.koin.data.Model
import com.zay.koin.view.BaseView
import com.zay.koin.view.SampleView

class Presenter(val model: Model) : IPresenter{
    lateinit var view : SampleView

    fun initView (view : BaseView) {
        this.view = view as SampleView
    }

    override fun onCreate() {
        val t = model.getData()
        view.showData(t)
    }
}