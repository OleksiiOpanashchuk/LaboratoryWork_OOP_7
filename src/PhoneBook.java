import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    public static void main(String[] args) {
        // Створення об'єкту HashMap для зберігання прізвищ та номерів телефонів
        Map<String, String> phoneBook = new HashMap<>();

        // Додавання елементів в карту
        phoneBook.put("Опанащук", "+380912345678");
        phoneBook.put("Володько", "+380612345678");
        phoneBook.put("Філяс", "+380631234567");
        phoneBook.put("Шимчук", "+380991234567");
        phoneBook.put("Дяков", "+380971534567");
        phoneBook.put("Бежик", "+380685434567");
        phoneBook.put("Староста", "+3806312514567");
        phoneBook.put("Куликовець", "+380121234567");
        phoneBook.put("Ткаченко", "+380966434567");
        phoneBook.put("Стоцький", "+3809121234567");

        // Виведення інформації з книги за допомогою циклу
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            String lastName = entry.getKey();
            String phoneNumber = entry.getValue();
            System.out.println("Прізвище: " + lastName + ", Номер телефону: " + phoneNumber);
        }

        // Знайдення номеру за прізвищем
        String lastNameToFind = "Залуцький";
        if (phoneBook.containsKey(lastNameToFind)) {
            String phoneNumber = phoneBook.get(lastNameToFind);
            System.out.println("Номер телефону для прізвища " + lastNameToFind + ": " + phoneNumber);
        } else {
            System.out.println("У книзі відсутній абонент з прізвищем " + lastNameToFind);
        }

        // Видалення запису з книги
        String lastNameToRemove = "Шимчук";
        phoneBook.remove(lastNameToRemove);
        System.out.println("Запис з прізвищем " + lastNameToRemove + " видалено.");

        // Виведення кількості записів у книзі
        int numberOfEntries = phoneBook.size();
        System.out.println("Кількість записів у книзі: " + numberOfEntries);
    }
}