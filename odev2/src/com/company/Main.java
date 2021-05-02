package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Category category1 = new Category(1, "Yazılım", "Yazılım Eğitimleri");
        Category category2 = new Category();
        category2.categoryId = 2;
        category2.categoryName = "Yabancı Dil";
        category2.categoryDescription = "Yabancı Dil Kursları";

        Course course1 = new Course(1, "Angular", "Max", category1);
        Course course2 = new Course(2, "React", "Engin demiroğ", category2);

        User user1 = new User(1, "ismyarar@gmail.com");
        User user2 = new User(2, "ogrenci2@udemy.com.tr");

        Course[] courses = {course1, course2};
        User[] users = {user1, user2};
        Category[] category = {category1, category2};


        for (Course course : courses) {
            System.out.println(course.courseName);
        }

        for (Category categories : category) {
            System.out.println(categories.categoryName);
        }

        for (User user : users
        ) {
            System.out.println(user.email);
        }
        System.out.println("***********");
        CourseManager courseManager = new CourseManager();
        courseManager.addCourse(course1);
        courseManager.deleteCourse(course2);

        UserManager userManager = new UserManager();
        userManager.register(user1);

    }
}
