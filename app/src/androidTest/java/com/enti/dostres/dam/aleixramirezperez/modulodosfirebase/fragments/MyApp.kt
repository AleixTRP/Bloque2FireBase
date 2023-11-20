package com.enti.dostres.dam.aleixramirezperez.modulodosfirebase.fragments;

import  android.app.Application
import android.os.Bundle
import com.enti.dostres.dam.aleixramirezperez.modulodosfirebase.activities.clases.MyFirebase
import com.google.firebase.analytics.FirebaseAnalytics

class MyApp: Application() {

    companion object{
        private lateinit var Instance: MyApp

        fun get() = Instance
    }




    override fun onCreate(){
        super.onCreate()
        Instance = this

        MyFirebase.init(this)
        MyFirebase.analytics.LogOpenApp()
    }


}
