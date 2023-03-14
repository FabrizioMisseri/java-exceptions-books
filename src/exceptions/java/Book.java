package exceptions.java;

public class Book {
String title;
int pageNumber;
String author;
String publisher;

//CONSTRUCTOR
    public Book(String title, int pageNumber, String author, String publisher) {

        if (title.equalsIgnoreCase("") || pageNumber <= 0 || author.equals("") || publisher.equals("")){
            throw new RuntimeException("SASSONE");
        }else{
            this.title = title;
            this.pageNumber = pageNumber;
            this.author = author;
            this.publisher = publisher;
        }
    }

    //GETTER
    public String getTitle() {
        return title;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    //SETTER

    public void setTitle(String title) {
        if (title.equals("")){
            throw new RuntimeException("non stringa vuota");
        }
        this.title = title;
    }

    public void setPageNumber(int pageNumber) {
        if (pageNumber <= 0){
            throw new RuntimeException("non stringa vuota");
        }
        this.pageNumber = pageNumber;
    }

    public void setAuthor(String author) {
        if (author.equals("")){
            throw new RuntimeException("non stringa vuota");
        }
        this.author = author;
    }

    public void setPublisher(String publisher) {
        if (publisher.equals("")){
            throw new RuntimeException("non stringa vuota");
        }
        this.publisher = publisher;
    }

    //to-String

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", pageNumber=" + pageNumber +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                '}' + "\n";
    }
}
