import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    private static void task3() {
        String fullName = "Иванов Семён Семёнович";
        String fullNameTrue = fullName.replace("ё","е");
        System.out.println(fullNameTrue);
    }

    public static void task1 () {
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + firstName + middleName;
        System.out.println("Имя сотрудника - " + fullName);
    }

    public static void task2 () {
        String fullName = "ivanov ivan ivanovich";
        System.out.println(fullName.toUpperCase());


    }
}