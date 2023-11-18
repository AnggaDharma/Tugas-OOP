package id.infinitelearning.KotlinSubmission.exercise4

import java.io.File
import java.io.FileNotFoundException

fun main() {


    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini

    val FileName = "Angga.txt"
    try {
        val file = File(FileName)
        val content = file.readText()
        println("Isi file : $content")

    } catch (e: FileNotFoundException) {
        println("File $FileName tidak di temukan")
    }

}
