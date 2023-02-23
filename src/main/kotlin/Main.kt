fun main() {
    println("Qual tipo de unidade você deseja converter? (temperatura, distância ou tempo)")
    val tipoUnidade = readLine()

    if (tipoUnidade == "temperatura") {
        println("Qual é a unidade de origem? (Celsius ou Fahrenheit)")
        val unidadeOrigem = readLine()
        println("Qual é a unidade de destino? (Celsius ou Fahrenheit)")
        val unidadeDestino = readLine()

        when {
            unidadeOrigem == "Celsius" && unidadeDestino == "Fahrenheit" -> {
                println("Digite a temperatura em Celsius:")
                val temperaturaCelsius = readLine()!!.toFloat()
                val temperaturaFahrenheit = temperaturaCelsius * 9 / 5 + 32
                println("$temperaturaCelsius Celsius equivale a $temperaturaFahrenheit Fahrenheit")
            }

            unidadeOrigem == "Fahrenheit" && unidadeDestino == "Celsius" -> {
                println("Digite a temperatura em Fahrenheit:")
                val temperaturaFahrenheit = readLine()!!.toFloat()
                val temperaturaCelsius = (temperaturaFahrenheit - 32) * 5 / 9
                println("$temperaturaFahrenheit Fahrenheit equivale a $temperaturaCelsius Celsius")
            }

            else -> {
                println("Desculpe, não é possível converter essas unidades")
            }
        }

    } else if (tipoUnidade == "distancia") {
        println("Qual é a unidade de origem? (metros ou quilômetros)")
        val unidadeOrigem = readLine()
        println("Qual é a unidade de destino? (metros ou quilômetros)")
        val unidadeDestino = readLine()

        when {
            unidadeOrigem == "metros" && unidadeDestino == "quilômetros" -> {
                println("Digite a distância em metros:")
                val distanciaMetros = readLine()!!.toFloat()
                val distanciaQuilometros = distanciaMetros / 1000
                println("$distanciaMetros metros equivale a $distanciaQuilometros quilômetros")
            }

            unidadeOrigem == "quilômetros" && unidadeDestino == "metros" -> {
                println("Digite a distância em quilômetros:")
                val distanciaQuilometros = readLine()!!.toFloat()
                val distanciaMetros = distanciaQuilometros * 1000
                println("$distanciaQuilometros quilômetros equivale a $distanciaMetros metros")
            }

            else -> {
                println("Desculpe, não é possível converter essas unidades")
            }
        }

    } else if (tipoUnidade == "tempo") {
        println("Qual é a unidade de origem? (horas ou minutos)")
        val unidadeOrigem = readLine()
        println("Qual é a unidade de destino? (horas ou minutos)")
        val unidadeDestino = readLine()
        if (unidadeOrigem == "horas" && unidadeDestino == "minutos") {
            println("Digite a quantidade de horas:")
            val horas = readLine()!!.toFloat()
            val minutos = horas * 60
            println("$horas horas equivalem a $minutos minutos")
        } else if (unidadeOrigem == "minutos" && unidadeDestino == "horas") {
            println("Digite a quantidade de minutos:")
            val minutos = readLine()!!.toFloat()
            val horas = minutos / 60
            println("$minutos minutos equivalem a $horas horas")
        } else {
            println("Desculpe, não é possível converter essas unidades")
        }
    } else {
        println("Desculpe, não é possível converter esse tipo de unidade")
    }
}

