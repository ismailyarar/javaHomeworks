package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Course course1 = new Course(1, "Angular", "Max");
        Course course2 = new Course(2, "React", "Engin demiroğ");

        User user1 = new User(1, "ismyarar@gmail.com");
        User user2 = new User(2, "ogrenci2@udemy.com.tr");

        Course[] courses = {course1, course2};
        User[] users = {user1, user2};

        for (Course course : courses) {
            System.out.println(course.courseName);
        }

        for (User user : users
        ) {
            System.out.println(user.email);
        }

        CourseManager courseManager = new CourseManager();
        courseManager.addCourse(course1);
        courseManager.deleteCourse(course2);

        UserManager userManager = new UserManager();
        userManager.register(user1);

    }
}
