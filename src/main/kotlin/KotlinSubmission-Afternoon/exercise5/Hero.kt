package id.infinitelearning.KotlinSubmission.exercise5
class Hero(
    private var name: String= "Angga Dharma Syahputra",
    private var age: Int = 26 ,
    private var height: Int = 168 ,
    private var health : Int = 20) {

    fun setProfile(name: String, age: Int, height: Int) {
        this.name = name
        this.age = age
        this.height = height
    }

    fun profile() {
        println("========= Profile =========")
        println("Name: $name")
        println("Age: $age")
        println("Height: $height")
        println("Health: $health")
        println("===========================")
    }

    private fun checkHealth() {
        if (health <= 0) {
            println("Anda telah mati $name")
        }
    }

    fun jalan() {
        checkHealth()
        println("$name sedang berjalan...")
        health -= 1
    }

    fun lari(){
        checkHealth()
        println("$name sedang berlari")
        health -= 2
    }

    fun makan(){
        checkHealth()
        println("$name sedang makan")
        health += 2
    }
    fun minum(){
        checkHealth()
        println("$name sedang minum")
        health += 2
    }
    fun duduk(){
        checkHealth()
        println("$name sedang duduk")
        health += 1
    }
    fun lompat(){
        checkHealth()
        println("$name sedang lompat")
        health -= 2
    }



    /**
     * Buat fungsi untuk lari, makan, minum, lompat, dan duduk. Masing2 memiliki kriteria sebagai berikut:
     - pasang fungsi checkHealth() di dalam fungsi yang akan dibuat
     - Tampilkan text kegiatan yang sedang dilakukan, misal, jika lari: "$name sedang berlari..."
     - ubah nilai variable health sesuai kegiatan yang dilakukan:
      * lari = -2
      * makan = +2
      * minum = +2
      * lompat = -2
      * duduk = +1

      Contoh fungsi bisa mengikuti fungsi jalan() diatas.

    */
    
}

