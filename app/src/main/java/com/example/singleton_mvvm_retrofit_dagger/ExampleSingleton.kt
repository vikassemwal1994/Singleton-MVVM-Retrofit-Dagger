package com.example.singleton_mvvm_retrofit_dagger

import com.example.singleton_mvvm_retrofit_dagger.models.User

object ExampleSingleton{

    //lazy initializer initialize only once and when its called
    val singletonUser: User by lazy {
        User("vikas.semwal1994@gmail.com", "vikas", "image.png")
    }

}