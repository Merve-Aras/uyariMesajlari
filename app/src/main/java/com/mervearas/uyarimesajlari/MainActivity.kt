package com.mervearas.uyarimesajlari

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //İki farklı Context vardır bunlar aşağıdaki gibiidr;
        //Eğer mesaj Activity Context'i ilgilendiriyorsa = This
        //Eğer mesaj App Context'i ilgilendiriyorsa = applicationContext

        Toast.makeText(applicationContext, "Welcome", Toast.LENGTH_LONG).show() //ekranda kaybolan mesaj verir.
    }
    fun save (view: View){
        val alert = AlertDialog.Builder(this) //uyarı mesajı alertdialog ile verilir.
        alert.setTitle("SAVE")
        alert.setMessage("ARE YOU SURE?")
        alert.setPositiveButton("YES"){dialog,which ->   //pozitif buton oluşturulduğunda önce butonda ne yazılacaksa o yazılır sonra butona tıklandığında yapılacaklar lambda formatında yazılır.
            Toast.makeText(applicationContext, "SAVED", Toast.LENGTH_LONG).show()
        }
        alert.setNegativeButton("NO"){dialog,which ->
            Toast.makeText(applicationContext, "NOT SAVED", Toast.LENGTH_LONG).show()
        }
        alert.show() //oluşturulan uyarı mesajını ekranda göstermeyi sağlar
    }
}