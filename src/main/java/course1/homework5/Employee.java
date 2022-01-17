package course1.homework5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Employee {
    private String fullName;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String fullName, String position, String email, String phone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        Matcher match = Pattern.compile("\\w{2,}-\\w{1,}\\@\\w{2,}\\.[a-z]{2,9}|\\w{2,}\\@\\w{2,}\\.[a-z]{2,9}").matcher(email);
        match.find();
        try {
            this.email = match.group();
        } catch (IllegalStateException e) {
            System.out.println("Email: " + email + " - неверный формат");
            System.out.println();
        }
        match.reset();
        match = Pattern.compile("(\\+)(\\d{11})").matcher(phone);
        match.find();
        try {
            this.phone = match.group();
        } catch (IllegalStateException e) {
            System.out.println("Телефон: " + phone + " - неверный формат");
            System.out.println();
        }
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Зарплата: " + salary + " - Ошибка в данных");
            System.out.println();
        }
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Возраст: " + age + " - Ошибка в данных");
            System.out.println();
        }
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        Matcher match = Pattern.compile("\\w{2,}-\\w{1,}\\@\\w{2,}\\.[a-z]{2,9}|\\w{2,}\\@\\w{2,}\\.[a-z]{2,9}").matcher(email);
        match.find();
        try {
            this.email = match.group();
        } catch (IllegalStateException e) {
            System.out.println("Email: " + email + " - неверный формат");
            System.out.println();
        }
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        Matcher match = Pattern.compile("(\\+)(\\d{11})").matcher(phone);
        match.find();
        try {
            this.phone = match.group();
        } catch (IllegalStateException e) {
            System.out.println("Телефон: " + phone + " - неверный формат");
            System.out.println();
        }
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Зарплата: " + salary + " - Ошибка в данных");
            System.out.println();
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Возраст: " + age + " - Ошибка в данных");
            System.out.println();
        }
    }

    public void employeeInfo() {
        System.out.println("Должность: " + position + "\nФИО: " + fullName + "\nEmail: " + email + "\nТелефон: " + phone + "\nЗарплата: " + salary + "\nВозраст: " + age);
    }
}
