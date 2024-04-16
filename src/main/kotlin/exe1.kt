fun main(){

    // Engeguem el bloc de notes
    val pb = ProcessBuilder("notepad.exe")
    var p: Process = pb.start()



    // Esperem a que es tanqui el bloc de notes abans de continuar
    p.waitFor()

    println("Calculadora tancada")

    // Engeguem la calculadora
    val pb2 = ProcessBuilder("calc.exe")
    var p2: Process = pb2.start()

    // Esperem a que es tanqui la calculadora
    p2.waitFor()

    //Missatge final
    println("Programa finalitzat.")
}