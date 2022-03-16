fun main (){
    var y = arrayOfInt(arrayOf(20,30,40))
    println(y)
    var decimal =sumDecimal(arrayOf(true,"flowers",54,20.55F,55.90F,))
    println(decimal)
    var vokali2 = charactersArray(arrayOf('s','a','z','h','e','u','f'))
    println(vokali2)
}
fun arrayOfInt(numbers:Array<Int>):Int{
    var prdct = 1
    numbers.forEach { x->
        prdct*=x
    }
    return prdct
}
fun sumDecimal(mixedArray: Array<Any>):Double{
    var sum = 0.0
    mixedArray.forEach { g ->
        if (g is Float || g is Double)
            sum += g.toString().toDouble()
    }
    return sum
}
fun charactersArray(alphabet:Array<Char>):Int{
    var vokali = 0
    alphabet.forEach { n ->
        if (n == 'a' ||n== 'e' ||n== 'i' || n=='o' || n=='u') {
            vokali++
        }
    }
    return vokali
}
