package com.zay.koin

import android.app.Application
import com.zay.koin.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level
import org.koin.core.module.Module

class DiApp : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@DiApp)
            androidLogger(Level.DEBUG)
            modules(appModule)

        }
    }
}