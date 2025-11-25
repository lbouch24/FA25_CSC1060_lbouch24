public class Time{
	private int hours, minutes, seconds;
	public Time() {
		this(0,0,0);
	}
	public Time(int hours, int minutes,int seconds) {
		this.hours = (hours >= 0 && hours < 24) ? hours : 0;
		this.minutes = (minutes >= 0 && minutes < 60) ? minutes : 0;
		this.seconds = (seconds >= 0 && seconds <60) ? seconds : 0;
	}
	public void increment(int ts) {
		this.seconds += ts;
		if (this.seconds >= 60) {
			this.minutes += this.seconds / 60;
			this.seconds %= 60;
		}
		if (this.minutes >= 60) {
			this.hours += this.minutes / 60;
			this.minutes %= 60;
		}
		if(this.hours >= 24) {
			this.hours %= 24;
		}
	}
	public void print(boolean day) {
		if(day) {
			System.out.printf("%02d:%02d:%02d%n", hours, minutes,seconds);
		} else {
			int displayHours = hours % 12;
			if(displayHours == 0) displayHours = 12;
			String ampm = (hours < 12) ? "AM" : "PM";
			System.out.printf("%02d:%02d:%02d %s%n", displayHours, minutes, seconds, ampm);
		}
	}
}
