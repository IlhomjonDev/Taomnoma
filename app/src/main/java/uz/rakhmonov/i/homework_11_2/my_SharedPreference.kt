package uz.rakhmonov.i.homework_11_2

import android.content.Context
import android.content.SharedPreferences


import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

object my_sharedPreference {

    private const val NAME = "catch"
    private const val MODE = Context.MODE_PRIVATE

    private lateinit var preferences: SharedPreferences

    fun init(context: Context){
        preferences = context.getSharedPreferences(NAME, MODE)
    }

    private inline fun SharedPreferences.edit(operation:(SharedPreferences.Editor) -> Unit){
        val editor = edit()
        operation(editor)
        editor.apply()
    }


    var catchList:ArrayList<Foods>
    get() = jsondanArrayListga(preferences.getString("keyList", "[]")!!)
    set(value)= preferences.edit{
        it.putString("keyList", arrayListdanjsonga(value))
    }
    fun arrayListdanjsonga(list:ArrayList<Foods>):String{
        var gson= Gson()
        return gson.toJson(list)

    }
    fun jsondanArrayListga(str:String):ArrayList<Foods>{
        var gson=Gson()
        val type=object : TypeToken<ArrayList<Foods>>(){}.type
        return gson.fromJson<ArrayList<Foods>>(str, type)


    }

}