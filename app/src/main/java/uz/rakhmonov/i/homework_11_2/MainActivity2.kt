package uz.rakhmonov.i.homework_11_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import uz.rakhmonov.i.homework_11_2.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    var foods=Foods("","","")
    private lateinit var binding: ActivityMain2Binding
    private  val TAG = "MainActivity2"
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMain2Binding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        my_sharedPreference.init(this)
//        Data.addList()


        binding.saqlash.setOnClickListener {

//        if (binding.eTName.text.isNotEmpty() && binding.eTTartib.text.isNotEmpty() && binding.eTMaxsulot.text.isNotEmpty()){

            val list = my_sharedPreference.catchList
            list.add(
                Foods(
                    binding.eTName.text.toString(),
                    binding.eTMaxsulot.text.toString(),
                    binding.eTTartib.text.toString()
                )
            )
            my_sharedPreference.catchList = list
            Log.d(TAG, "onCreate: ${list}")
            Toast.makeText(this, "saqlandi", Toast.LENGTH_SHORT).show()
//            loadData()
            finish()
//        }else{
//            Toast.makeText(this, "Taom qo'shish uchun barcha qatorlarni to'ldiring", Toast.LENGTH_SHORT).show()
//        }

        }

    }

    private fun loadData() {
        var str_1 = ""
        var str_2 = ""
        var str_3 = ""
        val list = my_sharedPreference.catchList



        list.forEach {
            str_1 += " ${it.name} "
            str_2 += "${it.retsept} \n\n"
            str_3 += " ${it.info} "
        }

       foods.name=str_1
        foods.retsept=str_2
        foods.info=str_3

    }
}