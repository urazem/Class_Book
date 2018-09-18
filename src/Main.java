/**
 * Created by Студент on 12.09.2018.
 */
public class Main {
    static Book[] masBook = new Book[5];
    public static void main(String [] args){
        masBook[0] = new Book(1, "Современные операционные системы", "Э.Таненбаум, Х.Бос", "Питер",2015, 1120, "2000р", "мягкий" );
        masBook[1] = new Book(2, "Командная строка Linux. Полное руководство", "Уильям Шотс", "Питер",2017, 480, "1000р", "твердый" );
        masBook[2] = new Book(3, "Алгоритмы. Построение и анализ", "Т.Кормен, Ч.Лейзерсон, Р.Ривест, К.Штайн ", "Вильямс",2013, 1328, "1800р", "твердый" );
        masBook[3] = new Book(4, "Приемы объектно-ориентированного проектирования. Паттерны проектирования ", "Э.Гамма, Р.Хелм, Р.Джонсон, Д.Влиссидес", "Питер",2015, 368, "1200р", "мягкий" );
        masBook[4] = new Book(5, "Идеальный программист", "Роберт Мартин", "Питер",2012, 224, "1050р", "твердый" );
        String author="Уильям Шотс";
        String pub_house = "Питер";
        int year_of_pub = 2015;
       for(int i=0;i<5;i++){
           masBook[i].getData(author);
       }
       for(int i=0;i<5;i++){
           masBook[i].getData(pub_house);
       }
       for(int i=0;i<5;i++){
           masBook[i].getData(year_of_pub);
       }
    }

}



