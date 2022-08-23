package dev.rehema.eatnowpplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dev.rehema.eatnowpplication.databinding.ActivityLoginBinding
import dev.rehema.eatnowpplication.databinding.ActivitySignUpBinding

class SignUpActivity : AppCompatActivity() {
    lateinit var binding: ActivitySignUpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnsignup.setOnClickListener {
            val intent=Intent(this,HomeActivity::class.java)
            startActivity(intent)
        }
        binding.tvsignin.setOnClickListener {
            val intent=Intent(this,LoginActivity::class.java)
            startActivity(intent)
            validate()

        }
    }
    fun validate(){
        var email=binding.tvemail2.text.toString()
        var firstname=binding.tvfirstname.text.toString()
        var lastname=binding.tvlastname.text.toString()
        var username=binding.tvusername.text.toString()
        var password=binding.tvPassword.text.toString()
        if (email.isBlank()){
            binding.tilemail2.error="Email is required"
        }
        if (firstname.isBlank()){
            binding.tilFirstname.error="Firstname is required"
        }
        if (lastname.isBlank()){
            binding.tillastname.error="Lastname is required"
        }
        if (username.isBlank()){
            binding.tilusername.error="Username is required"
        }
        if (password.isBlank()){
            binding.tilpassword2.error="Password is required"
        }

    }
}


