import kotlin.math.abs



fun main ()
{
        println("Введите значение x:")
        val x: Int = readLine().toString().toInt()
        val y: Int
        if (x > 0)
            y = 0
        else if (x == 0)
            y = (2 * abs(x) - 1)
        else
            y = (2 * x - 10)

        println(y)
    }




