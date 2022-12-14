package br.applabbs.financeapp.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.applabbs.financeapp.databinding.ActivitySeletorBinding

class SeletorActivity: AppCompatActivity() {

    private lateinit var binding: ActivitySeletorBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySeletorBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupListeners()
    }

    private fun setupListeners(){
        binding.btnBinding.setOnClickListener {
            //val intent = Intent(this, HomeBindingActivity::class.java)
            //startActivity(intent)
        }

        binding.btnCompose.setOnClickListener {
            //val intent = Intent(this, HomeComposeActivity::class.java)
            //startActivity(intent)
        }
    }
}