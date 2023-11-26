package com.proftelran.org.Homework_11;

public class Book {
    private String title;
    private String authorFullName;
    private int birthAuthor;
    private int pageCount;
    private int publicationYear;
    private String publisherName;
    private int publisherFoundingYear;

    public Book(String title, String authorFullName, int birthAuthor, int pageCount, int publicationYear, String publisherName, int publisherFoundingYear) {
        this.title = title;
        this.authorFullName = authorFullName;
        this.birthAuthor = birthAuthor;
        this.pageCount = pageCount;
        this.publicationYear = publicationYear;
        this.publisherName = publisherName;
        this.publisherFoundingYear = publisherFoundingYear;
    }


    public String getTitle() {
        return title;
    }

    public String getAuthorFullName() {
        return authorFullName;
    }

    public int getPageCount() {
        return pageCount;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public int getPublisherFoundingYear() {
        return publisherFoundingYear;
    }


    public int getAuthor() {
        return birthAuthor;
    }
}
