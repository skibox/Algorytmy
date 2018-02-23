package Lista4.zadanie9;


public class Time {
	private int hour;
	private int minute;
	private int second;

	public Time() {

	}

	public Time(int hour, int minute, int second) {
		setTime(hour, minute, second);
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

	public void setTime(int hour, int minute, int second) {
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}
	
	public Time nextSecond(Time time) {
		Time newTime = new Time(getHour(),getMinute(),getSecond());
		
		if(newTime.getHour() == 23 && newTime.getMinute() == 59 && newTime.getSecond() == 59) {
			newTime.setHour(0);
			newTime.setMinute(0);
			newTime.setSecond(0);
		}
		else if (newTime.getMinute() == 59 && newTime.getSecond() == 59) {
			newTime.setHour(newTime.getHour() + 1);
			newTime.setMinute(0);
			newTime.setSecond(0);
		} else if (newTime.getSecond() == 59) {
			newTime.setMinute(newTime.getMinute() + 1);
			newTime.setSecond(0);
		} else {
			newTime.setSecond(newTime.getSecond() + 1);
		}
		
		return newTime;
	}

	public Time previousSecond(Time time) {
		Time newTime = new Time(getHour(),getMinute(),getSecond());
		
		if(newTime.getHour() == 23 && newTime.getMinute() == 59 && newTime.getSecond() == 59) {
			newTime.setHour(0);
			newTime.setMinute(0);
			newTime.setSecond(0);
		}
		else if (newTime.getMinute() == 59 && newTime.getSecond() == 59) {
			newTime.setHour(newTime.getHour() + 1);
			newTime.setMinute(0);
			newTime.setSecond(0);
		} else if (newTime.getSecond() == 59) {
			newTime.setMinute(newTime.getMinute() + 1);
			newTime.setSecond(0);
		} else {
			newTime.setSecond(newTime.getSecond() + 1);
		}
		
		return newTime;
	}
	
	@Override
	public String toString() {
		
		StringBuilder sBuilder = new StringBuilder();
		if(getHour() < 10) {
			sBuilder.append(0).append(getHour());
		}
		else sBuilder.append(getHour());
		
		sBuilder.append(":");
		
		if(getMinute() < 10) {
			sBuilder.append(0).append(getMinute());
		}
		else sBuilder.append(getMinute());
		
		sBuilder.append(":");
		
		if(getSecond() < 10) {
			sBuilder.append(0).append(getSecond());
		}
		else sBuilder.append(getSecond());
		
		return sBuilder.toString();
	
	}
}
