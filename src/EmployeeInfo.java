import java.util.*;

public class EmployeeInfo {
    public static void main(String[] args) {
        List<Map<String, String>> employeeData = new ArrayList<>();

        Map<String, String> employee1 = new HashMap<>();
        employee1.put("Имя", "Кирилл");
        employee1.put("Возраст", "26");
        employee1.put("Должность", "Middle java dev");
        employee1.put("Зарплата", "150000 руб");

        Map<String, String> employee2 = new HashMap<>();
        employee2.put("Имя", "Виталий");
        employee2.put("Возраст", "28");
        employee2.put("Должность", "Senior java automation QA");
        employee2.put("Зарплата", "2000$");

        Map<String, String> employee3 = new HashMap<>();
        employee3.put("Имя", "Александр");
        employee3.put("Возраст", "31");
        employee3.put("Должность", "junior functional tester");
        employee3.put("Зарплата", "50000 руб");

        Map<String, String> employee4 = new HashMap<>();
        employee4.put("Имя", "Дементий");
        employee4.put("Возраст", "35");
        employee4.put("Должность", "dev-ops");
        employee4.put("Зарплата", "1500$");

        employeeData.add(employee1);
        employeeData.add(employee2);
        employeeData.add(employee3);
        employeeData.add(employee4);

        // Вывести имена всех сотрудников, младше 30
        System.out.println("Сотрудники младше 30 лет:");
        employeeData.stream()
                .filter(employee -> Integer.parseInt(employee.get("Возраст")) < 30)
                .map(employee -> employee.get("Имя"))
                .forEach(System.out::println);

        // Вывести имена всех сотрудников, получающих зарплату в рублях
        System.out.println("Сотрудники, получающие зарплату в рублях:");
        employeeData.stream()
                .filter(employee -> employee.get("Зарплата").contains("руб"))
                .map(employee -> employee.get("Имя"))
                .forEach(System.out::println);

        // Вычислить средний возраст всех сотрудников
        double averageAge = employeeData.stream()
                .mapToInt(employee -> Integer.parseInt(employee.get("Возраст")))
                .average()
                .orElse(0);
        System.out.println("Средний возраст всех сотрудников: " + averageAge);
    }
}