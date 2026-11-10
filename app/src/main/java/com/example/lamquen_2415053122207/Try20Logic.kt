package com.example.lamquen_2415053122207

object Try20Logic {

    fun tenHopLe(raw: String): String? {
        val ten = raw.trim()
        return if (ten.isEmpty()) null else ten
    }

    fun docSoLuong(raw: String): Int? {
        val so = raw.trim().toIntOrNull()
        return if (so != null && so in 1..9) so else null
    }

    fun loiChao(ten: String, soLuong: Int): String {
        return "Xin chào $ten, số lượng: $soLuong"
    }
}
