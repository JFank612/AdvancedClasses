import java.text.DecimalFormat

class Employee constructor
        (var name: String,
         var position: String,
         var salary: Boolean,
         var pay: Double,
         var shift: Int,
         var beginDate: String){
    
    var total = 0.00

    fun calculate(hoursIn: Double){
        total = if((hoursIn >= 40) && !salary)
            40 * pay + (hoursIn-40)*1.5 * pay
        else
            pay * hoursIn
        if(shift == 2)
            total *= 1.05
        else if (shift == 3)
            total *= 1.1
    }

    fun display(){
        val format = DecimalFormat("$###,###,###.00")
        println("Name: " + name + "\nStart Date: " + beginDate + "\nShift: " + shift + "\n" +
                position + " is salary: " + salary + "\nPay Rate: " + format.format(pay) + " per hour" +
                   "\nTotal Pay: " + format.format(total))
    }
}