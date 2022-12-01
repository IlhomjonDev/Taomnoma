package uz.rakhmonov.i.homework_11_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import uz.rakhmonov.i.homework_11_2.databinding.ActivityMain2Binding
import uz.rakhmonov.i.homework_11_2.databinding.ActivityMain3Binding
import uz.rakhmonov.i.homework_11_2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        my_sharedPreference.init(this)
        Data.addList()
        my_sharedPreference.catchList=Data.list

        binding.btnMenu.setOnClickListener {
            val intent=Intent(this,MainActivity3::class.java)
            startActivity(intent)

        }
        binding.taomQoshish.setOnClickListener {
            val intent=Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
    }

}