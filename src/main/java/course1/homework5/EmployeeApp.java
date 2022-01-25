package course1.homework5;

public class EmployeeApp {

    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Сосиска Наталья Валерьевна", "Главный бухгалтер", "sos-n-ska@mail.ru", "+79895326521", 80000, 23);
        employees[1] = new Employee("Кровопийца Тамара Михайловна", "Товаровед", "ghoul_tamara@yandex.ru", "+79317439836", 50000, 51);
        employees[2] = new Employee("Рукосуева Ольга Александровна", "Акушер-гинеколог", "ilovemyjob@gmail.com", "+79148496521", 100000, 44);
        employees[3] = new Employee("Блябляс Юлия Владимировна", "Логопед", "yulia_b@mail.ru", "+79126399643", 65000, 36);
        employees[4] = new Employee("Тараканчиков Сергей Николаевич", "Мастер по добыче", "cockroach-master@mail.ru", "+79641246475", 55000, 48);

        for (Employee employee:
             employees) {
            if (employee.getAge() > 40) {
                employee.employeeInfo();
                System.out.println();
            }
        }
    }
}
