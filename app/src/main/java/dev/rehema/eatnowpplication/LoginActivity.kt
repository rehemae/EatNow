package dev.rehema.eatnowpplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dev.rehema.eatnowpplication.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnlogin.setOnClickListener {
            val intent=Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        binding.tvsignup.setOnClickListener {
           val intent = Intent(this, SignUpActivity::class.java)
           startActivity(intent)
           validateLogin()
    }
}
    fun validateLogin() {
       var email = binding.tvemail.text.toString()
       var password = binding.tvpassword.text.toString()
       if (email.isBlank()) {
            binding.tilEmail.error = "Email is required"
       }
        if (password.isBlank()) {
           binding.tvpassword.error = "Password is required"
       }
    }
}



