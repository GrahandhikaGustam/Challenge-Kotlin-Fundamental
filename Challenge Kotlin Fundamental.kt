import java.awt.SystemColor.menu
import java.util.Scanner;

public var input = Scanner(System.`in`)
fun main() {
    //membuat objek scanner
    val input = Scanner(System.`in`)

    //Menginputkan Identitas
    print("Nama: ")
    val nama: String? = input.nextLine()
    if(nama.isNullOrEmpty()){
        println("Harap di isi")
        main()
    }
    print("Kelas: ")
    val kelas: String? = input.nextLine()
    if(kelas.isNullOrEmpty()){
        print("Jangan Lupa untuk Di isi")
        main()
    }
    print("Nomor Absen : ")
    val absen: String? = input.nextLine()
    println("\t")
    println("\t")

    println("---MENGHITUNG VOLUME BANGUN RUANG---")
    println("1. Volume Balok")
    println("2. Volume Bola")
    println("3. Volume Tabung")
    println("4. Volume Kubus")
    println("5. Volume Limas Segiempat")
    print("Masukan Menu Pilihan : ")
    val menu = readLine()

    when (menu) {
        "1" -> {
            println("---Hitung Volume Balok---")
            print("Masukan Panjang Balok : ")
            val p: Double = input.nextDouble()
            print("Masukan Lebar Balok : ")
            val l: Double = input.nextDouble()
            print("Masukan Tinggi Balok : ")
            val t: Double = input.nextDouble()

            //menghitung Balok
            val vt: Double = p * l * t;

            //cetak hasil
            println("Volume Balok adalah = $vt ")

            //kembali ke menu
            println("Kembali ke menu [Yes/No] : ")
            val next2 = readLine()
            if(next2=="Y" || next2=="y"){
                main()
            }
            else{
                println("Press Enter Key To Exit")
            }

        }
        "2" -> {
            println("---Hitung Volume Bola=---")
            print("Masukan jari-jari Bola : ")
            val r: Double = input.nextDouble()

            //menghitung Bola
            val vb: Double = 4/3 * Math.PI * r * r * r;

            //cetak hasil
            println("Volume Bola adalah = $vb ")

            //kembali ke menu
            println("Kembali ke menu [Yes/No] : ")
            val next1 = readLine()
            if(next1=="Y" || next1=="y"){
                main()
            }
            else{
                println("Press Enter Key To Exit")
            }

        }
        "3" -> {
            println("---Hitung Volume Tabung---")
            print("Masukan jari-jari Tabung : ")
            val r: Double = input.nextDouble()
            print("Masukan Tinggi Tabung : ")
            val t: Double = input.nextDouble()

            //menghitung Tabung
            val vT: Double = Math.PI * r * r * t;

            //cetak hasil
            println("Volume Tabung adalah = $vT ")

            //kembali ke menu
            println("Kembali ke menu [Yes/No] : ")
            val next2 = readLine()
            if (next2 == "Y" || next2 == "y") {
                main()
            }
            else {
                println("Press Enter Key To Exit")
            }

        }
        "4" -> {
            println("---Hitung Volume Kubus---")
            print("Masukan Sisi-sisi Kubus : ")
            val s: Double = input.nextDouble()

            //menghitung Kubus
            val vk: Double = s * s * s;

            //cetak hasil
            println("Volume Kubus adalah = $vk ")

            //kembali ke menu
            println("Kembali ke menu [Yes/No] : ")
            val next2 = readLine()
            if (next2 == "Y" || next2 == "y") {
                main()
            } else {
                println("Press Enter Key To Exit")
            }

        }
        "5" -> {
            println("---Hitung Volume Limas Segiempat---")
            print("Masukan Sisi-sisi Alas Limas Segiempat : ")
            val s: Double = input.nextDouble()
            print("Masukan Tinggi Limas : ")
            val tl: Double = input.nextDouble()

            //menghitung Limas Segiempat
            val vl: Double = 1/3 * s * s * tl;

            //cetak hasil
            println("Volume Limas Segiempat adalah = $vl ")

            //kembali ke menu
            println("Kembali ke menu [Y/N] : ")
            val next2 = readLine()
            if (next2 == "Y" || next2 == "y") {
                main()
            } else {
                println("Press Enter Key To Exit")
            }

        }
        else-> {
            println("Menu Tidak Tersedia")
        }
    }
}

