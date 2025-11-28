import java.util.ArrayList;
public class CSclasses {
    public static void printCourseUsingToString(Course c) {
        System.out.println(c.toString());
    }
    public static void printCourseNoToString(Course c) {
        System.out.println("Course Number: " + c.getCourseNumber());
        System.out.println("Current Students: " + c.getNumStudents());
        System.out.println("Max Students: " + c.getMaxStudents());
        System.out.println("Credits: " + c.getCredits());
        if (c instanceof InPersonCourse) {
            System.out.println("Room Number: " + ((InPersonCourse)c).getRoomNumber());
        }
        if (c instanceof FullRemoteCourse) {
            System.out.println("Contact Email: " + ((FullRemoteCourse)c).getContactEmail());
        }
        if (c instanceof RealTimeRemoteCourse) {
            System.out.println("Zoom Info: " + ((RealTimeRemoteCourse)c).getZoomInfo());
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ArrayList<Course> courseList = new ArrayList<>();
        InPersonCourse ipc = new InPersonCourse();
        ipc.setCourseNumberNumStudentsMaxStudentsCredits("CSC1059", 23, 30, 5.0);
        ipc.setRoomNumber("Room 219");
        FullRemoteCourse frc = new FullRemoteCourse();
        frc.setCourseNumberNumStudentsMaxStudentsCredits("CSC1060", 25, 30, 5.0);
        frc.setContactEmail("rwonch@mycourses-mail.cccs.edu");
        RealTimeRemoteCourse rrc = new RealTimeRemoteCourse();
        rrc.setCourseNumberNumStudentsMaxStudentsCredits("CSC1061", 18, 30, 5.0);
        rrc.setZoomInfo("Zoom ID: robert.wonch00");
        courseList.add(ipc);
        courseList.add(frc);
        courseList.add(rrc);
        for (Course c : courseList) {
            printCourseUsingToString(c);
            System.out.println("______________________");
        }
    }
}
