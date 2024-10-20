public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1. Присвоить 4 строковых переменных и вывести в консоль:");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = firstName + " " + middleName + " " + lastName;
        System.out.println("Ф. И. О. сотрудника — " + fullName);
        System.out.println();
        System.out.println("Задача 2. ФИО верхним регистром:");
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullName.toUpperCase());
        System.out.println();
        System.out.println("Задача 3. ё заменить на е:");
        String fullName3 = "Иванов Семён Семёнович";
        System.out.println("Данные Ф. И. О. сотрудника —  " + fullName3.replace('ё','е'));

    }
}