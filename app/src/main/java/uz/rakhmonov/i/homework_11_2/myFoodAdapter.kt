package uz.rakhmonov.i.homework_11_2

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import uz.rakhmonov.i.homework_11_2.databinding.MyItemsBinding

class myFoodAdapter(context: Context, var list:ArrayList<Foods>):
        ArrayAdapter<Foods>(context, R.layout.my_items, list ){
        @SuppressLint("ViewHolder")
        override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
            var myItemBinding = MyItemsBinding.inflate(LayoutInflater.from(parent.context),parent,false)
            myItemBinding.tvName.text=list[position].name
            return myItemBinding.root
        }


    }
