/**
 * Created by Студент on 12.09.2018.
 */
public class Book {
    private int id;
    private String name;
    private String author;
    private String pub_house;
    private int year_of_pub;
    private int number_of_pages;
    private String price;
    private String bookbinding;

    public Book() {}
    public Book(int id, String name, String author, String pub_house, int year_of_pub, int number_of_pages, String price, String bookbinding) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.pub_house = pub_house;
        this.year_of_pub = year_of_pub;
        this.number_of_pages = number_of_pages;
        this.price = price;
        this.bookbinding = bookbinding;
    }

    public String getPub_house() {
        return pub_house;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear_of_pub() {
        return year_of_pub;
    }

    public String getName() {
        return name;
    }

    public int getNumber_of_pages() {
        return number_of_pages;
    }

    public String getPrice() {
        return price;
    }

    public String getBookbinding() {
        return bookbinding;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPub_house(String pub_house) {
        this.pub_house = pub_house;
    }

    public void setYear_of_pub(int year_of_pub) {
        this.year_of_pub = year_of_pub;
    }

    public void getData(String value) {
        if (value == this.getAuthor()) {
            System.out.println("Автор: "+this.getAuthor()+ ", книга: " + this.getName());
        } else if (value == this.getPub_house()) {
            System.out.println("Издательство: "+ this.getPub_house()+ ", книга: " + this.getName());
        }
    }
    public void getData(int value) {
            if(value==this.getYear_of_pub()){
                System.out.println("Год: "+this.getYear_of_pub()+", книга: "+this.getName());
            }
    }
}
