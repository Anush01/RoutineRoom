package com.example.anushmp.roomroutine

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.button.MaterialButton
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {

    lateinit var listofroutines: ArrayList<String>
    lateinit var rv:RecyclerView
    lateinit var addbtn:MaterialButton


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listofroutines = ArrayList()
        rv = findViewById(R.id.routinerv)
        addbtn = findViewById(R.id.addroutine)


        buildlist()

        var rradapter = RoutineRecyclerViewAdapter(this,listofroutines)
        var llm = LinearLayoutManager(this)

        rv.adapter = rradapter
        rv.layoutManager = llm


    }

    private fun buildlist() {


        for(i in 0 until 10){

          listofroutines.add(randsequence() + " " + i)

        }


    }

    private fun randsequence(): String{

        var arr = arrayListOf<String>("a1x","b3q","c4t","d5w")


        var rand: Random = Random()

        var seed: Int = rand.nextInt(4)


        var out = ""

        for (i in 0 until 5){

            out = out + arr[seed]
            seed = rand.nextInt(4)

        }

        return out


    }

}