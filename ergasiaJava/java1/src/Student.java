public class Student {
    String name;
    String id;

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
    }
    public void printinfo(){
        System.out.println(name);
        System.out.println(id);
        System.out.println();
    }
}
