package com.ankur.livedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.ankur.livedata.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

        private lateinit var viewModel: mainActivityViewModel
        private lateinit var binding: ActivityMainBinding

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            binding = ActivityMainBinding.inflate(layoutInflater)
            setContentView(binding.root)
            viewModel = ViewModelProvider(this).get(mainActivityViewModel::class.java)
            viewModel.count.observe(this, Observer {
                binding.textView.text=it.toString()
            })



            binding.button.setOnClickListener {

                viewModel.updateCount()
//                binding.textView.text = viewModel.count.toString()
            }

        }
    }
