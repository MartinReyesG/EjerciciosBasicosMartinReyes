fun main(){
    //valores
    val valorCelius=27.0
    val valorKelvin=350.0
    val valorFahrenheit=10.0

    //temperaturas
    val celsius="Celsius"
    val fahrenheit="Fahrenheit"
    val kelvin="Kelvin"

    //formulas
    val formulaCelius= {ini:Double -> (((9.0/5.0)*ini)+32.0)}
    val formulaKelvin= {ini:Double -> ini-273.15}
    val formulaFahrenheit= {ini:Double -> (((5.0/9.0)*(ini-32))+273.15)}

    //Impresiones
    printFinalTemperature(valorCelius, celsius, fahrenheit, formulaCelius)
    printFinalTemperature(valorKelvin, kelvin, celsius, formulaKelvin)
    printFinalTemperature(valorFahrenheit, fahrenheit, kelvin, formulaFahrenheit)
}

fun printFinalTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double)->Double
){
    val finalMeasurement =String.format("%.2f",conversionFormula(initialMeasurement))
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit")
}
