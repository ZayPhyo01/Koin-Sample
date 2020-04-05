package com.zay.koin.di

import com.zay.koin.data.Model
import com.zay.koin.presenter.Presenter
import com.zay.koin.view.BaseView
import com.zay.koin.view.SampleView
import org.koin.core.qualifier.named
import org.koin.dsl.module
import org.koin.ext.scope

val appModule = module( ) {
        single(createdAtStart = true){ Model }
        factory { Presenter() }
}