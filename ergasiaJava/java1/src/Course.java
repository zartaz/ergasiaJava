import java.util.ArrayList;

public class Course {
    private String lesson;
    private int maxStudents = 3;
    private ArrayList<Student> enrolled = new ArrayList<Student>();
    private int counter = 0;


    public Course(String lesson) {
        this.lesson = lesson;
    }

    public void addstudent(Student s) {
        if (counter > maxStudents-1)
            System.out.println("max student limit(3) reached");
        else {
            enrolled.add(s);
            counter++;
        }
    }

    public void printStudents(){
        for (int i = 0; i < enrolled.size(); i++) {
            enrolled.get(i).printinfo();
        }
    }

    public void removeStudent(String name){
        for (int i = 0; i < enrolled.size(); i++) {
            if (name.equals(enrolled.get(i).name)){
                enrolled.remove(i);
                System.out.println(name+" deleted giati den diavaze\n");
            }

        }
    }
}