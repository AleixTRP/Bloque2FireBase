package com.enti.dostres.dam.aleixramirezperez.modulodosfirebase.activities.clases

import android.app.Application

class MyFirebase {
    companion object{

        lateinit var  analytics: MyFirebaseAnalytics

        fun  init(appContext: Application)
        {
            analytics = MyFirebaseAnalytics(appContext)
        }
    }
}