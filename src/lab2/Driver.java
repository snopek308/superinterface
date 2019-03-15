package lab2;

import java.util.ArrayList;

public class Driver {

    public static void main(String[] args) {

        ArrayList<Course> courseList = new ArrayList();
        courseList.add(new IntroJavaCourse("Intro1","100"));
        courseList.add(new AdvancedJavaCourse("AdvJava1","201"));
        courseList.add(new IntroToProgrammingCourse("IntroTo1","090"));

        Course course = new IntroJavaCourse("Intro2","100");

        courseList.add(course);

        for(int i = 0; i<courseList.size(); i++)
        {
            System.out.println(courseList.get(i).getCourseName());
        }
    }
}
