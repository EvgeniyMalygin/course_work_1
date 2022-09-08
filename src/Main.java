public class Main {
    public static void main(String[] args) {
        double persent = 10.5; // Процент индексации зарплаты
        int number = 2; //Номер отдела для поиска минимальной и максимальной зарплаты в отделе
        double salaryIsLess = 40000; //Значение для поиска сотрудников с меньшей зарплатой
        double salaryIsMore = 20000; //Значение для поиска сотрудников с большей зарплатой
        EmployeeBook tempEmployeeBook = new EmployeeBook();
        // Заполнение в программе
        tempEmployeeBook.newEmployee("Петров", "Иван", "Сергеевич", 1, 12000);
        tempEmployeeBook.newEmployee("Иванов", "Иван", "Сергеевич", 2, 14000);
        tempEmployeeBook.newEmployee("Сидоров", "Петр", "Иванович", 3, 12030);
        tempEmployeeBook.newEmployee("Сергеев", "Демид", "Петрович", 4, 11200);
        tempEmployeeBook.newEmployee("Терновский", "Олег", "Михайлович", 5, 53023);
        tempEmployeeBook.newEmployee("Мимиков", "Федор", "Никодимович", 1, 11230);
        tempEmployeeBook.newEmployee("Демидов", "Ринат", "Магомедович", 1, 23450);
        tempEmployeeBook.newEmployee("Черкасов", "Николай", "Петрович", 2, 32456);
        tempEmployeeBook.newEmployee("Козлов", "Олег", "Константинович", 2, 33123);
        tempEmployeeBook.newEmployee("Ястребов", "Дмитрий", "Сергеевич", 3, 33678);
        //Печать всех данных сотрудников
        tempEmployeeBook.printEmployees();
        System.out.println("========================================================================");
        System.out.println("Сумма затрат на зарплаты за месяц: " + tempEmployeeBook.sumSalary());
        System.out.println("Среднее значение зарплат за месяц: " + tempEmployeeBook.averageSalary());
        System.out.println("Минимальная зарплата у сотрудника: " + tempEmployeeBook.minSalary().toString());
        System.out.println("Максимальная зарплата у сотрудника: " + tempEmployeeBook.maxSalary().toString());
        System.out.println("========================================================================");
        //Печать ФИО сотрудников
        tempEmployeeBook.printFullName();
        System.out.println("========================================================================");
        //Печать данных после индексации зарплаты
        tempEmployeeBook.indexSalary(persent);
        System.out.printf("Зарплата после индексации на %s процентов \n", persent);
        tempEmployeeBook.printEmployees();
        System.out.println("========================================================================");
        System.out.printf("Минимальная зарплата в отделе № %s у сотрудника %s \n", number,
                tempEmployeeBook.minSalaryInDepartment(number).toString());
        System.out.println("========================================================================");
        System.out.printf("Максимальная зарплата в отделе № %s у сотрудника %s \n", number,
                tempEmployeeBook.maxSalaryInDepartment(number).toString());
        System.out.println("========================================================================");
        System.out.printf("Сумма затрат на зарплату в отделе № %s составляет %s \n", number,
                tempEmployeeBook.sumSalaryInDepartment(number));
        System.out.println("========================================================================");
        System.out.printf("Средняя зарплата  в отделе № %s составляет %s \n", number,
                tempEmployeeBook.averageSalaryInDepartment(number));
        System.out.println("========================================================================");
        //Печать данных после индексации зарплаты в отделе
        tempEmployeeBook.indexSalaryInDepartment(persent, number);
        tempEmployeeBook.printEmployees();
        System.out.println("========================================================================");
        // Печать сотрудников отдела
        tempEmployeeBook.printEmployeeInDepartment(number);
        System.out.println("========================================================================");
        // Печать сотрудников с зарплатой меньше заданной
        System.out.printf("Список сотрудников с зарплатой меньше %s \n", salaryIsLess);
        tempEmployeeBook.salaryIsLess(salaryIsLess);
        System.out.println("========================================================================");
        // Печать сотрудников с зарплатой больше заданной
        System.out.printf("Список сотрудников с зарплатой больше %s \n", salaryIsMore);
        tempEmployeeBook.salaryIsMore(salaryIsMore);
        //Удаление сотрудника по ФИО и id
        String lastNameEmployee = "Мимиков";
        String fistNameEmployee = "Федор";
        String middleNameEmployee = "Никодимович";
        int idEmployee = 5;
        System.out.println("========================================================================");
        System.out.printf("Удален сотрудник id: %s  ФИО %s %s %s \n", idEmployee, lastNameEmployee, fistNameEmployee, middleNameEmployee);
        tempEmployeeBook.deleteEmployee(lastNameEmployee, fistNameEmployee, middleNameEmployee, idEmployee);
        tempEmployeeBook.printEmployees();
        System.out.println("========================================================================");
       //Удаление сотрудника по id
        idEmployee = 9;
        tempEmployeeBook.deleteEmployee(idEmployee);
        System.out.printf("Удален сотрудник id: %s \n", idEmployee);
        tempEmployeeBook.printEmployees();
        System.out.println("========================================================================");
        //Изменение размера зарплаты
        lastNameEmployee = "Петров";
        fistNameEmployee = "Иван";
        middleNameEmployee = "Сергеевич";
        double newSalary = 21000;
        System.out.printf("Изменена зарплата %s %s %s на значение %s \n", lastNameEmployee, fistNameEmployee, middleNameEmployee, newSalary);
        tempEmployeeBook.changeSalary(lastNameEmployee, fistNameEmployee, middleNameEmployee, newSalary);
        tempEmployeeBook.printEmployees();
        System.out.println("========================================================================");
        //Изменение номера отдела
        int newDepartment = 4;
        System.out.printf("Изменен номер отдела %s %s %s на значение %s \n", lastNameEmployee, fistNameEmployee, middleNameEmployee, newDepartment);
        tempEmployeeBook.changeNumberOfDepartment(lastNameEmployee, fistNameEmployee, middleNameEmployee, newDepartment);
        tempEmployeeBook.printEmployees();
        System.out.println("========================================================================");
        //Печать списков сотрудников по отделам
        int numberOfDepartment = 5; //Количество отделов
        for (int i = 1; i <= numberOfDepartment; i++) {
            System.out.printf("Сотрудники отдела №%s \n", i);
            tempEmployeeBook.printEmployeeInDepartment(i);
            }
    }
}
