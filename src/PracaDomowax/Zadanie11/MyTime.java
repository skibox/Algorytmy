package PracaDomowax.Zadanie11;

public class MyTime {
	private int hour = 0;
	private int minute = 0;
	private int second = 0;

	public MyTime() {

	}

	public MyTime(int hour, int minute, int second) {
		setTime(hour, minute, second);
	}

	public void setTime(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}

	@Override
	public String toString() {
		StringBuilder output = new StringBuilder();
		if (hour < 10)
			output.append("0").append(hour + ":");
		else
			output.append(hour + ":");

		if (minute < 10)
			output.append("0").append(minute + ":");
		else
			output.append(minute + ":");

		if (second < 10)
			output.append("0").append(second);
		else
			output.append(second);

		return output.toString();
	}

	public MyTime nextSecond() {
		if (this.second >= 59) {
			this.second = 0;
			this.nextMinute();
		} else
			this.second++;

		return this;
	}

	public MyTime nextMinute() {
		if (this.minute >= 59) {
			this.minute = 0;
			this.nextHour();
		} else
			this.minute++;

		return this;
	}

	public MyTime nextHour() {
		if (this.hour >= 23) {
			this.hour = 0;
		} else
			this.hour++;

		return this;
	}

	public MyTime previousSecond() {
		if (this.second == 0) {
			this.second = 59;
			this.previousMinute();
		} else
			this.second--;

		return this;
	}

	public MyTime previousMinute() {
		if (this.minute == 0) {
			this.minute = 59;
			this.previousHour();
		} else
			this.minute--;

		return this;
	}

	public MyTime previousHour() {
		if (this.hour == 0) {
			this.hour = 23;
		} else
			this.hour--;

		return this;
	}

}
