public class EmployeeBook {

    private static Employee[] employees = new Employee[10];

    public void printEmployees() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i].toString());
            }
        }
    }

    //Метод подсчета суммы зарплаты в месяц
    public double sumSalary() {
        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null){
                sum += employees[i].getSalary();
            }
        }
        return sum;
    }

    //Метод подсчета средней зарплаты в месяц
    public double averageSalary() {
        int count = 0;
        for (Employee tempEmployees : employees) {
            if (tempEmployees != null){
                count++;
            }
        }
        return (sumSalary() / count);
    }

    //Метод поиска минимальной зарплаты в месяц
    public Employee minSalary() {
        double tempSalary = employees[0].getSalary();
        int tempIndex = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && tempSalary > employees[i].getSalary()) {
                tempSalary = employees[i].getSalary();
                tempIndex = i;
            }
        }
        return employees[tempIndex];
    }

    //Метод поиска максимальной зарплаты в месяц
    public Employee maxSalary() {
        double tempSalary = employees[0].getSalary();
        int tempIndex = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && tempSalary < employees[i].getSalary()) {
                tempSalary = employees[i].getSalary();
                tempIndex = i;
            }
        }
        return employees[tempIndex];
    }

    //Метод печати ФИО сотрудников
    public void printFullName() {
        for (Employee tempEmployees : employees) {
            if (tempEmployees != null) {
                System.out.println(tempEmployees.getLastName() + " " + tempEmployees.getFistName() + " " + tempEmployees.getMiddleName());
            }
        }
    }

    //Индексация зарплаты
    public void indexSalary(double percent) {
        for (Employee tempEmployees : employees) {
            if (tempEmployees != null){
                tempEmployees.setSalary(tempEmployees.getSalary() + tempEmployees.getSalary() * percent / 100);
            }
        }
    }

    //Поиск сотрудника с минимальной зарплатой в отделе
    public Employee minSalaryInDepartment(int number) {
        double tempSalary = employees[0].getSalary();
        int tempIndex = 0;
        for (Employee tempEmployees : employees) {
            if (tempEmployees != null && tempEmployees.getNumberOfDepartment() == number) {
                tempSalary = tempEmployees.getSalary();
                break;
            }
            tempIndex += 1;
        }
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getNumberOfDepartment() == number && tempSalary > employees[i].getSalary()) {
                tempSalary = employees[i].getSalary();
                tempIndex = i;
            }
        }
        return employees[tempIndex];
    }

    //Поиск сотрудника с максмальной зарплатой в отделе
    public Employee maxSalaryInDepartment(int number) {
        double tempSalary = employees[0].getSalary();
        int tempIndex = 0;
        for (Employee tempEmployees : employees) {
            if (tempEmployees != null && tempEmployees.getNumberOfDepartment() == number) {
                tempSalary = tempEmployees.getSalary();
                break;
            }
            tempIndex += 1;
        }
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getNumberOfDepartment() == number && tempSalary < employees[i].getSalary()) {
                tempSalary = employees[i].getSalary();
                tempIndex = i;
            }
        }
        return employees[tempIndex];
    }

    //Подсчет зарплаты по отделу
    public double sumSalaryInDepartment(int number) {
        double sum = 0;
        for (Employee tempEmployees : employees) {
            if (tempEmployees != null && tempEmployees.getNumberOfDepartment() == number) {
                sum += tempEmployees.getSalary();
            }
        }
        return sum;
    }

    //Подсчет средней зарплаты по отделу
    public double averageSalaryInDepartment(int number) {
        int count = 0;
        for (Employee tempEmployees : employees) {
            if (tempEmployees != null && tempEmployees.getNumberOfDepartment() == number) {
                count++;
            }
        }
        return (sumSalaryInDepartment(number) / count);
    }

    //Индексация зарплаты по отделу
    public void indexSalaryInDepartment(double percent, int number) {
        for (Employee tempEmployees : employees) {
            if (tempEmployees != null && tempEmployees.getNumberOfDepartment() == number) {
                tempEmployees.setSalary(tempEmployees.getSalary() + tempEmployees.getSalary() * percent / 100);
            }
        }
    }

    //Печать ФИО сотрудников отдела
    public void printEmployeeInDepartment(int number) {
        for (Employee tempEmployees : employees) {
            if (tempEmployees != null && tempEmployees.getNumberOfDepartment() == number) {
                System.out.println("id: " + tempEmployees.getIdEmployee() + " ФИО: " + tempEmployees.getLastName() + " " + tempEmployees.getFistName() + " "
                        + tempEmployees.getMiddleName() + ", зарплата: " + tempEmployees.getSalary());
            }
        }
    }

    //Поиск сотрудников отдела с зарплатой меньше заданной
    public void salaryIsLess(double number) {
        for (Employee tempEmployees : employees) {
            if (tempEmployees != null && tempEmployees.getSalary() < number) {
                System.out.println("id: " + tempEmployees.getIdEmployee() + " ФИО: " + tempEmployees.getLastName() + " " + tempEmployees.getFistName() + " "
                        + tempEmployees.getMiddleName() + ", зарплата: " + tempEmployees.getSalary());
            }
        }
    }

    //Поиск сотрудников отдела с зарплатой больше заданной
    public void salaryIsMore(double number) {
        for (Employee tempEmployees : employees) {
            if (tempEmployees != null && tempEmployees.getSalary() >= number) {
                System.out.println("id: " + tempEmployees.getIdEmployee() + " ФИО: " + tempEmployees.getLastName() + " " + tempEmployees.getFistName() + " "
                        + tempEmployees.getMiddleName() + ", зарплата: " + tempEmployees.getSalary());
            }
        }
    }

    // Добавление нового сотрудника
    public void newEmployee(String lastName, String fistName, String middleName, int numberOfDepartment, double salary) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = new Employee(lastName, fistName, middleName, numberOfDepartment, salary);
                break;
            }
        }
    }

    // Удаление сотрудника по ФИО и id
    public void deleteEmployee(String lastName, String fistName, String middleName, int id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getLastName() == lastName && employees[i].getFistName() == fistName &&
                    employees[i].getMiddleName() == middleName && employees[i].getIdEmployee() == id) {
                employees[i] = null;
                break;
            }
        }
    }

    // Удаление сотрудника по id
    public void deleteEmployee(int id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getIdEmployee() == id) {
                employees[i] = null;
                break;
            }
        }
    }

    //Изменение зарплаты
    public void changeSalary(String lastName, String fistName, String middleName, double newSalary) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getLastName() == lastName && employees[i].getFistName() == fistName &&
                    employees[i].getMiddleName() == middleName) {
                employees[i].setSalary(newSalary);
            }
        }
    }

    //Изменение номера отдела
    public void changeNumberOfDepartment(String lastName, String fistName, String middleName, int newDepartment) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getLastName() == lastName && employees[i].getFistName() == fistName &&
                    employees[i].getMiddleName() == middleName) {
                employees[i].setNumberOfDepartment(newDepartment);
            }
        }
    }


}
