public class Main {

    public static void main(String[] args) {
	    Student zartas = new Student("zartas","paok");
        Student iskioupis = new Student("thanos","aris");
        Student petros = new Student("karakatsanis","tartes");
        Student leyki = new Student("lefki","dimitriou");

        Course python = new Course("Python");

        python.addstudent(zartas);
        python.addstudent(iskioupis);
        python.addstudent(petros);
//        python.addstudent(leyki); gia na testarw addstudent
        python.printStudents();
        python.removeStudent("thanos");
        python.printStudents();
    }
}
