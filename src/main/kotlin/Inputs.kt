import com.sun.jdi.IntegerType
import java.util.*
import java.time.LocalDate;
import java.time.Period

fun main() {
    print("What is your name?")
    var yourName = readLine()
    print("Enter the month of your birthday: ")
    val month = readLine()
    print("Enter the day of your birthday: ")
    val day = Integer.valueOf(readLine())
    print("Enter the year of your birthday: ")
    val year = Integer.valueOf(readLine())

    val yearToday = 2021
    val yearToday2 = Calendar.getInstance().get(Calendar.YEAR);

    print("Your name is $yourName and your birthdate is on $month $day $year. Your age is " +
            yearToday2.minus(year))
}