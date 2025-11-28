public class RealTimeRemoteCourse extends OnlineCourse {
    private String zoomInfo;
    public String getZoomInfo() {
        return this.zoomInfo;
    }
    public void setZoomInfo(String zoomInfo) {
        this.zoomInfo = zoomInfo;
    }
    @Override
    public String toString() {
        return super.toString() +
               "Zoom Info: " + this.zoomInfo + "\n";
    }
}
