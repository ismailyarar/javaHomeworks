package com.company;

public class Category {
    int categoryId;
    String categoryName;
    String categoryDescription;

    public Category(){

    }

    public Category(int categoryId, String categoryName, String categoryDescription) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.categoryDescription = categoryDescription;
    }
}
