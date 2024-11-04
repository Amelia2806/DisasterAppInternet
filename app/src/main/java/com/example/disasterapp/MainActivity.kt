package com.example.disasterapp  // Pastikan nama paket sesuai dengan struktur Anda

import ImageAdapter
import ImageModel
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.disasterapp.R

// Kelas MainActivity yang mewarisi AppCompatActivity
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // Mengatur layout untuk activity

        // Menemukan RecyclerView di layout
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)

        // Mengatur layout manager untuk RecyclerView agar menampilkan grid 3 kolom
        recyclerView.layoutManager = GridLayoutManager(this, 3)

        // Daftar gambar dengan URL
        val imageList = listOf(
            ImageModel("https://picsum.photos/200/300?image=1"),
            ImageModel("https://picsum.photos/200/300?image=2"),
            ImageModel("https://picsum.photos/200/300?image=3"),
            ImageModel("https://picsum.photos/200/300?image=4"),
            ImageModel("https://picsum.photos/200/300?image=5"),
            ImageModel("https://picsum.photos/200/300?image=6"),
            ImageModel("https://picsum.photos/200/300?image=7"),
            ImageModel("https://picsum.photos/200/300?image=8"),
            ImageModel("https://picsum.photos/200/300?image=9"),
            ImageModel("https://picsum.photos/200/300?image=10"),
            ImageModel("https://picsum.photos/200/300?image=11"),
            ImageModel("https://picsum.photos/200/300?image=12"),
            ImageModel("https://picsum.photos/200/300?image=13"),
            ImageModel("https://picsum.photos/200/300?image=14"),
            ImageModel("https://picsum.photos/200/300?image=15"),
            ImageModel("https://picsum.photos/200/300?image=16"),
            ImageModel("https://picsum.photos/200/300?image=17"),
            ImageModel("https://picsum.photos/200/300?image=18")
        )

        // Membuat adapter untuk RecyclerView dengan daftar gambar
        val adapter = ImageAdapter(imageList)
        recyclerView.adapter = adapter // Mengatur adapter untuk RecyclerView
    }
}
