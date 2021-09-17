package me.arthu.collections

fun main(){
    val salarios = doubleArrayOf(100.0, 2250.0, 4000.0)
    for(salario in salarios){
        println(salario)
    }

    println("--------------------------")
    println("Maior salario: ${salarios.maxOrNull()}")
    println("Menor salario: ${salarios.minOrNull()}")
    println("Media salario: ${salarios.average()}")
    
    val salariosMaiorQ2500 = salarios.filter { it>2500.0 }
    println("--------------------------")
    salariosMaiorQ2500.forEach {println(it) }


    println("--------------------------")
    println(salarios.count{it in 2500.0 .. 5000.0})

    println("--------------------------")
    println(salarios.find{it == 2250.0})
    println(salarios.find{it == 500.0})

    println("--------------------------")
    println(salarios.any{it == 1000.0}) // true caso haja o valor especificado, se não, false
    println(salarios.any{it == 500.0})
}