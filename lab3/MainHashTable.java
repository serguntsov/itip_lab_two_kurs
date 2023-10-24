package lab3;
import java.util.HashMap;

public class MainHashTable {
    public static void main(String[] args) {
        HashMap<String, Book> table = new HashMap<>();
        // Добавление книг
        Book book1 = new Book("Капитанская дочка", "А.С. Пушкин", 100000000);
        Book book2 = new Book("Дело о конокрадстве", "М.Г. Розовский", 10000);
        Book book3 = new Book("Чайка по имени Джонатан Ливингстон", "Ричард Бах", 600000);

        table.put("978-5-9287-3324-7", book1);
        table.put("5-9697-0288-9", book2);
        table.put("978-5-907097-26-1", book3);

        // Поиск
        Book foundBook = table.get("978-5-9287-3324-7");
        if (foundBook != null) {
            System.out.println("Название: " + foundBook.getName());
            System.out.println("Автор: " + foundBook.getAuthor());
            System.out.println("Количество копий: " + foundBook.getCopy());
        } else {
            System.out.println("Книга не найдена");
        }

        // Удаление
        table.remove("978-5-9287-3324-7");
        System.out.println("Количество элементов таблицы: " + table.size());
        System.out.println("Пустая таблица: " + table.isEmpty());
    }

    static class Book {
        private String name;
        private String author;
        private int copy;

        public Book(String name, String author, int copy) {
            this.name = name;
            this.author = author;
            this.copy = copy;
        }

        public String getName() {
            return name;
        }

        public String getAuthor() {
            return author;
        }

        public int getCopy() {
            return copy;
        }

        public void setCopy(int copy) {
            this.copy = copy;
        }
    }
}
