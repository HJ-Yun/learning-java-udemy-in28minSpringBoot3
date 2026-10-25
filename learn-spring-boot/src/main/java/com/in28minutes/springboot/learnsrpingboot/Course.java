package com.in28minutes.springboot.learnsrpingboot;

public class Course {

    //entity
    //id, name, author
    private long id;
    private String name;
    private String author;

    Course(long id, String name, String author){
        super();
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public long getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public String getAuthor(){
        return this.author;
    }

    @Override
    public String toString(){
        return "Course : [id = " + id +", name = " + name + ", author = " + author + "]";
    }

//    public void setId(long id){
//        this.id = id;
//    }
//
//    public void setName(String name){
//        this.name = name;
//    }
//
//    public void setAuthor(String author){
//        this.author = author;
//    }
}
