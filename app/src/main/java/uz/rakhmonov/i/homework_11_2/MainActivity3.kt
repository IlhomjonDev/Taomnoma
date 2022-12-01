package uz.rakhmonov.i.homework_11_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import uz.rakhmonov.i.homework_11_2.Data.addList
import uz.rakhmonov.i.homework_11_2.Data.list
import uz.rakhmonov.i.homework_11_2.databinding.ActivityMain3Binding

class MainActivity3 : AppCompatActivity() {
    lateinit var binding: ActivityMain3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMain3Binding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        my_sharedPreference.init(binding.root.context)
        addList()
        val myFoodAdapter = myFoodAdapter(this, my_sharedPreference.catchList)
        binding.listview.adapter = myFoodAdapter

        binding.listview.setOnItemClickListener { adapterView, view, i, l ->
            val intent = Intent(this, MainActivity4::class.java)
            val foods = Foods(my_sharedPreference.catchList[i].name, my_sharedPreference.catchList[i].retsept, my_sharedPreference.catchList[i].info)
            intent.putExtra("key",foods)
            startActivity(intent)



        }

    }
}