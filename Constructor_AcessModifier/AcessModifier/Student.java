class Student {
    // Access modifiers
    public int rollNumber;
    protected String name;
    private double CGPA;

    // Constructor
    Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Public methods to access and modify private CGPA
    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    public void displayStudent() {
        System.out.println("Roll Number: " + rollNumber + ", Name: " + name + ", CGPA: " + CGPA);
    }
}

// Subclass
class PostgraduateStudent extends Student {
    String specialization;

    PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
        super(rollNumber, name, CGPA);
        this.specialization = specialization;
    }

    public void displayPGStudent() {
        // Accessing protected member 'name'
        System.out.println("PG Student: " + name + ", Specialization: " + specialization);
    }

    public static void main(String[] args) {
        PostgraduateStudent pg = new PostgraduateStudent(101, "Aeshna", 9.1, "AI & Data Analytics");
        pg.displayStudent();
        pg.displayPGStudent();

        pg.setCGPA(9.3);
        System.out.println("Updated CGPA: " + pg.getCGPA());
    }
}
