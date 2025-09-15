class Course {
    // Class variable
    static String instituteName = "glaUniversity";

    // Instance variables
    String courseName;
    int duration; // in months
    double fee;

    // Constructor
    Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method
    void displayCourseDetails() {
        System.out.println("Course Name: " + courseName + 
                           ", Duration: " + duration + " months" +
                           ", Fee: ₹" + fee + 
                           ", Institute: " + instituteName);
    }

    // Class method
    static void updateInstituteName(String newName) {
        instituteName = newName;
    }

    // Main method for testing
    public static void main(String[] args) {
        Course c1 = new Course("Python Programming", 3, 15000);
        Course c2 = new Course("Data Science", 6, 40000);

        c1.displayCourseDetails();
        c2.displayCourseDetails();

        Course.updateInstituteName("GLA University");

        System.out.println("\nAfter Updating Institute Name:\n");
        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}
