package com.example.lamquen_2415053122207

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtTen = findViewById<EditText>(R.id.edtTen)
        val edtSoLuong = findViewById<EditText>(R.id.edtSoLuong)
        val btnKiemTra = findViewById<Button>(R.id.btnKiemTra)
        val btnXoa = findViewById<Button>(R.id.btnXoa)
        val txtKetQua = findViewById<TextView>(R.id.txtKetQua)

        btnKiemTra.setOnClickListener {
            val ten = Try20Logic.tenHopLe(
                edtTen.text.toString()
            )
            val soLuong = Try20Logic.docSoLuong(
                edtSoLuong.text.toString()
            )

            edtTen.error = null
            edtSoLuong.error = null
            txtKetQua.text = ""

            if (ten == null) {
                edtTen.error = "Tên không được để trống"
            }

            if (soLuong == null) {
                edtSoLuong.error = "Số lượng phải từ 1 đến 9"
            }


            if (ten != null && soLuong != null) {
                val loiChao = Try20Logic.loiChao(ten, soLuong)
                val nhan = Try20Logic.phanLoai(soLuong)

                txtKetQua.text = "$loiChao\nPhân loại: $nhan"
            }

        }

        btnXoa.setOnClickListener {
            edtTen.text.clear()
            edtSoLuong.text.clear()
            edtTen.error = null
            edtSoLuong.error = null
            txtKetQua.text = ""
        }
    }
}
