public class Book {
  public static void main(String[] args) {

    Title title = new Title();
    Author author = new Author();
    Content content = new Content();

    title.setTitle("Название книги");
    author.setAuthor("Автор");
    content.setContent("Содержание");

    title.show();
    author.show();
    content.show();
  }
}
