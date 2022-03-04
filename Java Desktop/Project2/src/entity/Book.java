/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author GL552VW
 */
public class Book {
    
    private int book_id;
    private String book_title;
    private String book_author ;
    private String book_publish_year;
    private String book_category;
    private String book_keyword;
    private String book_status;
   

    public Book(int book_id, String book_title, String book_author,String book_publish_year, String book_category, String book_keyword,String book_status) {
        this.book_id = book_id;
        this.book_title = book_title;
        this.book_author = book_author;
        this.book_publish_year = book_publish_year;
        this.book_category = book_category;
        this.book_keyword = book_keyword;
        this.book_status = book_status;
    }


    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public String getBook_title() {
        return book_title;
    }

    public void setBook_title(String book_title) {
        this.book_title = book_title;
    }

    public String getBook_author() {
        return book_author;
    }

    public void setBook_author(String book_author) {
        this.book_author = book_author;
    }

    public String getBook_publish_year() {
        return book_publish_year;
    }

    public void setBook_publish_year(String book_publish_year) {
        this.book_publish_year = book_publish_year;
    }

    public String getBook_category() {
        return book_category;
    }

    public void setBook_category(String book_category) {
        this.book_category = book_category;
    }

    public String getBook_keyword() {
        return book_keyword;
    }

    public void setBook_keyword(String book_keyword) {
        this.book_keyword = book_keyword;
    }

    public String getBook_status() {
        return book_status;
    }

    public void setBook_status(String book_status) {
        this.book_status = book_status;
    }

   
    
    
}
