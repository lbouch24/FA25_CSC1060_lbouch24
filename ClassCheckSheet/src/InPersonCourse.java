public class InPersonCourse extends Course {
    private String roomNumber;
    public String getRoomNumber() {
        return this.roomNumber;
    }
    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }
    @Override
    public String toString() {
        return super.toString() +
               "Room Number: " + this.roomNumber + "\n";
    }
}
