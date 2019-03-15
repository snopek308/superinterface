package lab1;

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
        //This type of inheritance is awesome because it cuts down on duplicating the code.
        //It also is incredibly useful because we've only been writing small programs, this is finally an application for a larger program.
        //This feels like a "real life program."
    }
}
