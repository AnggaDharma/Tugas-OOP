package id.infinitelearning.KotlinSubmission.exercise2

import java.time.LocalDateTime
import java.time.Month

fun main() {

    /** Latihan 1 List
    Buatlah sebuah variabel bertipe list dengan ketentuan:
    - List tersebut menampung bilangan genap dari 1 hingga 100
    Optional:
    - Agar lebih mudah, gunakanlah for loop dan logika if untuk mengisi bilangan genap pada list
     */
    // Buat di bawah sini

    val evenNumber = mutableListOf<Int>()
    for (i in 1..100){
        if (i% 2 == 0){
            evenNumber.add(i)
        }
    }
    println("Bilangan genap dari 1 hingga 100 : $evenNumber")


    /** Latihan 2 Map
    Buatlah variabel bertipe Map dengan kriteria:
    Daftar nama bulan dalam setahun,
    - Set Key nya dengan inisial nama bulan dan Value nya nama bulan, contoh
    - key "Jan", value January
    - key "Feb", value February
    - dst... */
    //Buat di bawah sini

    val monthMap = mapOf(
    "jan" to "January",
    "Feb" to "February",
    "Mar" to "March",
    "Apr" to "April",
    "Mei" to "May",
    "Jun" to "June",
    "jUl" to "July",
    "Agu" to "August",
    "Sep" to "September",
    "Oct" to "October",
    "Nov" to "November",
    "Dec" to "December",
    )
    println("Daftar Nama Bulan: ")
    for (( Key,value ) in monthMap) {
    println("$Key : $value ")
    }

    /**Cetak semua nama bulan dengan fungsi forEach sehingga hasil output seperti:
    - Jan -> January
    - Feb -> February
    - Dst...*/
    // Buat di bawah sini

    monthMap.forEach { (Key, value) ->
        println("- $Key -> $value")
    }

    /**Cetak nama bulan sekarang dan bulan lahir kamu dengan format string berikut:
    - "It's {$monthNow} now, I was born in {$birthMonth}"
     */
    // Buat di bawah sini

    val currentMonth = LocalDateTime.now().month
    val birthMonth = Month.AUGUST

    val monthNow = currentMonth.toString().toLowerCase().capitalize()
    val birthMonthString = birthMonth.toString().toLowerCase().capitalize()

    val message = "It's $monthNow now, I was born in $birthMonthString"
    println(message)


}