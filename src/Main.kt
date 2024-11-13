fun main() {
    println("Введите натуральное число в десятичной системе счисления:")
    val decimalNumber = readLine()!!.toInt() // Считывание введенного числа и преобразование его в целое число

    val binaryNumber = decimalToBinary(decimalNumber) // Вызов функции decimalToBinary для преобразования

    println("Двоичное представление числа: $binaryNumber") // Вывод результата преобразования
}

fun decimalToBinary(decimal: Int): String { // Начало функции decimalToBinary, принимает десятичное число
    var number = decimal // Создание копии введенного числа для работы
    val binary = StringBuilder() // Создание пустой строки StringBuilder для построения двоичного представления

    while (number > 0) { // Цикл работает пока число больше нуля
        val remainder = number % 2 // Вычисление остатка от деления на 2 (0 или 1)
        binary.insert(0, remainder) // Вставка остатка в начало строки StringBuilder
        number /= 2 // Деление числа на 2 (целочисленное деление)
    }

    return binary.toString() // Возврат двоичного представления как строки
}