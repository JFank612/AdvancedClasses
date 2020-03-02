

fun main() {
    val emp1 = Employee("John Smith",
            positionFind(PositionTitle.Sales), false, 25.00, 1,"12/31/1999")
    val emp2 = Employee("Mary Johnson",
            positionFind(PositionTitle.Maintenance), false, 30.00, 3, "07/04/2001")
    val emp3 = Employee("Mike Brown",
            positionFind(PositionTitle.Administration), true, 45.00, 2, "06/17/1969")

    emp1.calculate(30.00)
    emp1.display()
    emp2.calculate(45.00)
    emp2.display()
    emp3.calculate(55.00)
    emp3.display()

}


fun positionFind(dir:PositionTitle):String{
    when (dir){
        PositionTitle.Administration -> return "Administration"
        PositionTitle.Production -> return "Production"
        PositionTitle.Sales -> return "Sales"
        PositionTitle.Maintenance -> return "Maintenance"
        PositionTitle.Technical -> return "Technical"
        PositionTitle.Secretarial -> return "Secretarial"
        else -> return "Position does not exist"
    }
}