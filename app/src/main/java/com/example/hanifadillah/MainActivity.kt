package com.example.hanifadillah

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var data: ArrayList<DataModel>? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Inisialisasi Array
        data = ArrayList()


        //Simpan data

        data?.add(DataModel(R.drawable.oppoa,"oppoa","oppoa", " mengusung layar LCD seluas , inci dengan resolusi HD Plus yang menganut desain Infinity-V.  Di bagian atasnya terdapat poni (notch) yang memuat kamera selfie 5 MP"
        ))

        data?.add(DataModel(R.drawable.oppob,"oppob","oppob", " oppo memiliki kamera utama . Kamera ini juga ditemani dengan tiga buah kamera lain, masing-masing beresolusi. Di bagian depan ada sensor 13MP untuk kebutuhan selfie"
        ))

        data?.add(DataModel(R.drawable.oppoc,"oppoc","oppoc", "Berdasarkan peluncuran tersebut, Samsung Galaxy A22 5G bakal mengusung layar LCD 6,6 inci dengan resolusi Full HD Plus dan refresh rate 90 Hz. Pada bagian atas layarnya terdapat poni (notch) Infinity-V yang memuat kamera selfie MP"
        ))
        data?.add(DataModel(R.drawable.oppod,"oppod","oppod", "HP dengan kapasitas 4000mAh dan layar 6.4\" yang dilengkapi dengan kamera belakang 16 + 5MP dengan tingkat densitas piksel sebesar 403ppi dan tampilan resolusi sebesar 1080 x 2340pixels."
        ))

        data?.add(DataModel(R.drawable.oppoe ,"oppoe","oppoe", "Galaxy A53 akan memiliki resolusi yang sama dengan model A52 saat ini. Galaxy A50 memulai debutnya pada 2019 dengan kamera utama 25 MP"
        ))

        data?.add(DataModel(R.drawable.oppof,"oppof","oppof", "Untuk spesifikasi, Galaxy A72 mengusung layar Super AMOLED berbentang 6,7 inci dengan resolusi Full HD Plus (1.080 x 2.400 piksel)"))

        //Set data to Adapter
        recyclerview.adapter = DataAdapter(data, object : DataAdapter.OnClickListener{
            override fun detail(item: DataModel?) {
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                intent.putExtra("gambar", item?.gambar)
                intent.putExtra("nama", item?.nama)
                intent.putExtra("deskripsi", item?.deskripsi)
                intent.putExtra("keterangan", item?.keterangan)
                startActivity(intent)
            }

        })


    }
}