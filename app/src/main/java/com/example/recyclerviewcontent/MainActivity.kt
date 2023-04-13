package com.example.recyclerviewcontent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val superheroList = listOf<Superhero>(
            Superhero(
                R.drawable.gojou,
                " Gojou",
                "Nama Lengkap   : Gojo Satoru (五 条 悟)\n" +
                        "Julukan            : Strongest Jujutsu Sorcerer\n" +
                        "Tanggal Lahir      : 7 Desember 1989\n" +
                        "Umur               : 28 tahun\n" +
                        "Jenis Kelamin      : Laki-laki\n" +
                        "Kerabat            : Yuta Okkotsu (kerabat jauh), Michizane Sugawara (leluhur)\n" +
                        "Tinggi Badan       : 190 cm\n" +
                        "Warna Rambut       : Putih\n" +
                        "Warna Mata         : Biru Muda\n" +
                        "Manga Debut        : Chapter 0-2\n" +
                        "Anime Debut        : Episode 1\n" +
                        "Pengisi Suara      : Yuichi Nakamura (Jepang), Kaji Tang (Inggris)"
            ),
            Superhero(
                R.drawable.toji,
                " Toji Fushiguro",
            "Nama Asli\t\t: Toji Zenin\n" +
                    "\n" +
                    "Nama Panggung\t: Toji Fushiguro\n" +
                    "\n" +
                    "Julukan\t\t: Pembunuh Penyihir\n" +
                    "\n" +
                    "Tanggal Lahir\t: 31 Desember\n" +
                    "\n" +
                    "Usia\t\t\t: 27-28 tahun\n" +
                    "\n" +
                    "Tinggi Badan\t: 185 cm\n" +
                    "\n" +
                    "Warna Rambut\t: Hitam\n" +
                    "\n" +
                    "Warna Mata\t\t: Hijau\n" +
                    "\n" +
                    "Kerabat\t\t:\tMegumi Fushiguro (anak kandung)\n" +
                    "\t\t\t\tTsumiki Fushiguro (anak tiri)\n" +
                    "\t\t\t\tJinichi Zenin (saudara)\n" +
                    "\t\t\t\tNaobito Zenin, (Paman), Ogi Zenin (Paman)\n" +
                    "\t\t\t\tNaoya Zenin (sepupu), Maki Zenin(sepupu), Mai Zenin (sepupu)\n" +
                    "\t\t\t\tDebut Manga: Chapter 66"
            ),
            Superhero(
                R.drawable.geto,
                "Suguru Geto",
                "Tidak Di temukan Biodata"
            ),
            Superhero(
                R.drawable.maki,
                "Maki",
                "lorem lipsum lorem lipsum lorem lipsum"
            ),
            Superhero(
                R.drawable.itadori,
                "Itadori Yuji",
                "Nama\t\t\t: Itadori Yuji (虎杖 悠仁.)\n" +
                        "Nama panggilan\t: Wadah Sukuna, Harimau SMP Barat, Yuu-chan\n" +
                        "Tanggal Lahir\t: 20 Maret\n" +
                        "Umur\t\t\t: 15 tahun\n" +
                        "Jenis kelamin\t: laki-laki\n" +
                        "Tinggi badan\t: 173 cm\n" +
                        "Berat badan\t\t: 80 kg\n" +
                        "Warna rambut\t: Pirang hitam dan merah\n" +
                        "Warna mata\t\t: cokelat\n" +
                        "Keluarga\t\t: Wasuke Itadori (kakek), Jin Itadori (ayah)\n" +
                        "Debut Manga\t\t: Chapter 1\n" +
                        "Debut Anime\t\t: Jujutsu Kaisen Episode 1\n" +
                        "Pengisi Suara\t: Junya Enoki (Jepang) dan Adam McArthur (Inggris)"
            ),
            Superhero(
                R.drawable.nanami,
                "Nanami Kento",
                "Real Name\t\t: Nanami Kento (七海建人)\n" +
                        "Stage Name\t\t: Kento Nanami\n" +
                        "Also Knows As\t: 7:7 Sorcerer, Nanamin (by Gojo and Yuji)\n" +
                        "Nickname\t\t: Nanami\n" +
                        "Birthday\t\t: July 3, 1990\n" +
                        "Age\t\t\t: 28\n" +
                        "Gender\t\t: Male\n" +
                        "Hobbies\t\t: –\n" +
                        "Manga Debut\t\t: Chapter 18\n" +
                        "Anime Debut\t\t: Episode 8\n" +
                        "Japanese VA\t\t: Kenjiro Tsuda\n" +
                        "English VA\t\t: David Vincent"
            ),
            Superhero(
                R.drawable.megumi,
                "Megumi",
                "lorem lipsum lorem lipsum lorem lipsum"
            ),
            Superhero(
                R.drawable.sukuna,
                "Ryomen Sukuna",
                "Nama Lengkap\t\t: Ryomen Sukuna / 宿儺\n" +
                        "Nama Panggung\t\t: Ryomen Sukuna\n" +
                        "Nama Panggilan\t\t: King of Curses\n" +
                        "Tempat, Tanggal Lahir\t: –\n" +
                        "Umur\t\t\t\t: 1000+ tahun\n" +
                        "Jenis Kelamin\t\t: Laki-Laki\n" +
                        "Tinggi Badan\t\t: 3-5 meter\n" +
                        "Berat Badan\t\t\t: –\n" +
                        "Golongan Darah\t\t: –\n" +
                        "Warna Rambut\t\t: Coklat\n" +
                        "Warna Mata\t\t\t: Coklat\n" +
                        "Debut Manga\t\t\t: Chapter 1\n" +
                        "Debut Anime\t\t\t: Episode 1\n" +
                        "Pengisi Suara\t\t: Junichi Suwabe (Jepang), Ray Chase (English)"
            ),
            Superhero(
                R.drawable.tanjiro,
                "Tanjiro",
                "lorem lipsum lorem lipsum lorem lipsum"
            ),
            Superhero(
                R.drawable.mahito,
                "Mahito",
                "lorem lipsum lorem lipsum lorem lipsum"
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_hero)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = SuperHeroAdapter(this, superheroList){
            val intent = Intent (this,DetailSuperheroActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }
    }
}



