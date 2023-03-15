package exceptions.java;

public class Book {
private String title;
private int pageNumber;
private String author;
private String publisher;

public final String errorMsg = "errore hai sbagliato, riprova...";

//CONSTRUCTOR
    public Book(String title, int pageNumber, String author, String publisher) {
            if (constructorStringValidation(title)){
                throw new RuntimeException(errorMsg);
            }else{this.title = title;}
        if (constructorNumberValidation(pageNumber)){
            throw new RuntimeException(errorMsg);
        }else{this.pageNumber = pageNumber;}
        if (constructorStringValidation(author)){
            throw new RuntimeException(errorMsg);
        }else {this.author = author;}
        if (constructorStringValidation(publisher)){
            throw new RuntimeException(errorMsg);
        }else{this.publisher = publisher;}
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

    //TO-STRING
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", pageNumber=" + pageNumber +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                '}' + "\n";
    }

    //VALIDATION PROCESS
    public boolean constructorStringValidation(String string){
        return string.trim().equalsIgnoreCase("") || string == null;
    }

    public boolean constructorNumberValidation(int number){
        return number <= 0;
    }
}
