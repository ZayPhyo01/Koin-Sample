package com.zay.koin.di

import com.zay.koin.data.Model
import com.zay.koin.presenter.Presenter
import com.zay.koin.view.BaseView
import com.zay.koin.view.SampleView
import org.koin.dsl.module

    val appModule = module {
        single<Model> { Model }
        factory <Presenter> { Presenter() }
}