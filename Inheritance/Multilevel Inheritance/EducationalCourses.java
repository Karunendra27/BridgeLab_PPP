// Base class
class Course {
    String courseName;
    int duration; 

    Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    void displayCourse() {
        System.out.println("Course: " + courseName + ", Duration: " + duration + " weeks");
    }
}

// subclass
class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;

    OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    @Override
    void displayCourse() {
        super.displayCourse();
        System.out.println("Platform: " + platform + ", Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}

// subclass
class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount; 

    PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded,
                     double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    double getFinalFee() {
        return fee - (fee * discount / 100);
    }

    @Override
    void displayCourse() {
        super.displayCourse();
        System.out.println("Fee: $" + fee + ", Discount: " + discount + "%");
        System.out.println("Final Fee after discount: $" + getFinalFee());
    }
}

public class EducationalCourses {
    public static void main(String[] args) {
        Course c1 = new Course("Data Structures", 8);
        OnlineCourse c2 = new OnlineCourse("Java Programming", 6, "Udemy", true);
        PaidOnlineCourse c3 = new PaidOnlineCourse("AI with Python", 10, "Coursera", true, 200.0, 20.0);

        c1.displayCourse();
        System.out.println();
        c2.displayCourse();
        System.out.println();
        c3.displayCourse();
    }
}
