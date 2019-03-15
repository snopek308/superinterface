package lab1;

public abstract class Course {

    public String courseName;
    public String courseNumber;
    public double credits;

    abstract void setCredits(double credits);

    abstract String getCourseName();

    abstract void setCourseName(String courseName);

    abstract String getCourseNumber();

    abstract void setCourseNumber(String courseNumber);

}
