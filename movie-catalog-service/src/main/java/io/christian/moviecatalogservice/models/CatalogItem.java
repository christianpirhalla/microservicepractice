package io.christian.moviecatalogservice.models;

public class CatalogItem {

    private String name;
    private String desc;
    private int rating;

    public CatalogItem(String name, String desc, int rating){
        this.name = name;
        this.desc = desc;
        this.rating = rating;
    }

    public String getName(){
        return this.name;
    }

    public String getDesc(){
        return this.desc;
    }

    public int getRating(){
        return this.rating;
    }
}
