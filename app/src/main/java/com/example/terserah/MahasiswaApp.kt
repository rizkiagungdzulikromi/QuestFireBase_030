package com.example.terserah

import android.app.Application
import com.example.terserah.di.MahasiswaContainer

class MahasiswaApplications: Application() {
    lateinit var container: MahasiswaContainer

    override fun onCreate() {
        super.onCreate()
        container = MahasiswaContainer()
    }
}