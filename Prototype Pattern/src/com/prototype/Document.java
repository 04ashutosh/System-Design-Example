package com.prototype;

import java.util.*;

public class Document implements Prototype{
    private String title;
    private String content;

    private List<String> tags;

    public Document(String title, String content, List<String> tags){
        this.title = title;
        this.content = content;
        this.tags = tags;
    }

    //Shallow Copy
    @Override
    public Prototype clone(){
        return new Document(this.title,this.content,this.tags);
    }

    //Deep Copy
    @Override
    public Prototype deepClone(){
        List<String> clonedTags = new ArrayList<>(this.tags);
        return new Document(this.title,this.content,clonedTags);
    }

    //Getter and Setters
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public List<String> getTags() {
        return tags;
    }
    public void addTag(String tag){
        this.tags.add(tag);
    }

    @Override
    public String toString(){
        return "Document [Title="+ title + ", Content=" + content + ", Tags=" + tags + "]";
    }
}