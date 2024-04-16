import java.util.Scanner


fun main() {
    try {
        val pb = ProcessBuilder("java", "-jar", "src\\main\\kotlin\\pruebaprocesos.jar")

        var p1: Process = pb.start()
        var receiver = p1.inputStream
        var scn = Scanner(receiver)

        while (scn.hasNext()) {

            println(scn.nextLine())
        }
        p1.waitFor()

        println("Process ended")

    }catch (e: Exception){
        println("Error" + e.message)
    }
}
