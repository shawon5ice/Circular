package com.example.circular

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.example.circular.api.CircularService
import com.example.circular.api.RetrofitHelper
import com.example.circular.models.Circular
import com.example.circular.repository.CircularRepository
import com.example.circular.viewmodel.CircularViewModel
import com.example.circular.viewmodel.CircularViewModelFactory

class MainActivity : AppCompatActivity() {
    lateinit var circularViewModel: CircularViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val circularService = RetrofitHelper.getInstance().create(CircularService::class.java)
        val repository = CircularRepository(circularService)

        circularViewModel = ViewModelProvider(this,CircularViewModelFactory(repository))
            .get(CircularViewModel::class.java)

        circularViewModel.circulars.observe(this
        ) {
            Log.d("res",it.toString())
        }
    }
}