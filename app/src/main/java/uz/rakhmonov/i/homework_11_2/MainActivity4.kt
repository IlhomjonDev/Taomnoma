package uz.rakhmonov.i.homework_11_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import uz.rakhmonov.i.homework_11_2.databinding.ActivityMain4Binding
import uz.rakhmonov.i.homework_11_2.databinding.ActivityMainBinding

class MainActivity4 : AppCompatActivity() {
    lateinit var binding: ActivityMain4Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityMain4Binding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val foods:Foods=intent.getSerializableExtra("key") as Foods
        binding.taomNomi.text=foods.name
        binding.retsept.text=foods.retsept
        binding.instruksiya.text=foods.info
    }
}