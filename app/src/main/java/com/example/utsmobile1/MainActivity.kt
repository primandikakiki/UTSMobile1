package com.example.utsmobile1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val data = createFac()
        rv_list_main. layoutManager = LinearLayoutManager (this)
        rv_list_main.setHasFixedSize(true)
        rv_list_main.adapter = FacultyAdapter(data, { onItem: FacultyData -> onItemClicked(onItem) })
    }

    private fun onItemClicked(onItem: FacultyData) {
        val showDetailActivityIntent = Intent(this, FacultyDetail::class.java)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEXT, onItem.imgFac)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TITLE, onItem.nameFac)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEMPLATE, onItem.descFac)
        showDetailActivityIntent.putExtra(Intent.EXTRA_SUBJECT, onItem.descDet)
        startActivity(showDetailActivityIntent)
    }

    private fun createFac(): List<FacultyData> {
        val rvList = ArrayList<FacultyData>()
        rvList.add(
            FacultyData(
                R.drawable.logoupnbaru,
                "FAKULTAS ILMU KOMPUTER",
                "Fakultas Ilmu Komputer merupakan salah satu dari 7 Fakultas di UPN 'Veteran' Jawa Timur. Yang terdiri dari program studi: ",
                "1. Prodi S1 Teknik Informatika\n" +
                        "2. Prodi S1 Sistem Informasi"
            )
        )

        rvList.add(
            FacultyData(
                R.drawable.logoupnbaru,
                "FAKULTAS TEKNIK",
                "Fakultas Teknik merupakan salah satu dari 7 Fakultas di UPN 'Veteran' Jawa Timur. Yang terdiri dari program studi: ",
                "1. Prodi S1 Teknik Kimia\n" +
                        "2. Prodi S1 Teknik Industri\n" +
                        "3. Prodi S1 Teknik Sipil\n" +
                        "4. Prodi S1 Teknik Lingkungan\n" +
                        "5. Prodi S1 Teknologi Pangan"
            )
        )
        rvList.add(
            FacultyData(
                R.drawable.logoupnbaru,
                "FAKULTAS EKONOMI DAN BISNIS",
                "Fakultas Ekonomi dan Bisnis merupakan salah satu dari 7 Fakultas di UPN 'Veteran' Jawa Timur. Yang terdiri dari program studi: ",
                "1. Prodi S1 Ekonomi Pembangunan\n" +
                        "2. Prodi S1 Akuntansi\n" +
                        "3. Prodi S1 Manajemen"
            )
        )
        rvList.add(
            FacultyData( R.drawable.logoupnbaru,
                "FAKULTAS PERTANIAN",
                "Fakultas Pertanian merupakan salah satu dari 7 Fakultas di UPN 'Veteran' Jawa Timur. Yang terdiri dari program studi: ",
                "1. Prodi S1 Agroteknologi\n" +
                        "2. Prodi S1 Agribisnis"
            )
        )
        rvList.add(
            FacultyData( R.drawable.me,
                "Primandika Hakiki",
                "Nama : Primandika Hakiki\n"+
                        "TTL : Surabaya, 15 April 2000\n" +
                        "Alamat : Kendangsari YKP Blok F-25, Surabaya\n" +
                        "No. HP : 082333811976\n" +
                        "Email : primandikakiki@gmail.com\n" +
                        "Github : https://github.com/primandikakiki\n",
                "Riwayat Pendidikan : \n" +
                        "\t\t 1. SDN Kendangsari 1 Surabaya \n" +
                        "\t\t 2. SMPN 35 Surabaya \n" +
                        "\t\t 3. SMAN 17 Surabaya \n\n" +
                        "Penghargaan : -"
            )
        )
        return rvList
    }
}