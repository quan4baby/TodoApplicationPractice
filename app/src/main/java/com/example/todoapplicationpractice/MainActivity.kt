package com.example.todoapplicationpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /**
     * This function gets called when the Add Button is clicked. It
     * adds a todo into the database.
     * @param view MainActivity view
     */
    fun addTodo(view: View?){

    }

    /**
     * This function gets called when the Delete Button is clicked. It
     * deletes selected todos from the database.
     * @param view MainActivity view
     */
    fun deleteTodo(view: View?){

    }
}