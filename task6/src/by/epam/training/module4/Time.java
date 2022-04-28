package by.epam.training.module4;
/*
 * 6.Составьте описание класса для представления времени.
 *   Предусмотрте возможности установки времени и изменения его отдельных полей (час, минута, секунда)
 *   с проверкой допустимости вводимых значений. В случае недопустимых  значений полей поле 
 *   устанавливается  в  значение  0.  Создать  методы  изменения  времени на заданное количество часов, минут и секунд.
 */
public class Time {
	private int hour;
	private int minute;
	private int second;
	
	public Time() {};
	
	public Time(int hour, int minute) {
		if((hour < 0 || hour > 23) || (minute < 0 || minute > 60)) {
			this.hour = 0;
			this.minute = 0;
		} else {
			this.hour = hour;
			this.minute = minute;
		}
	}
	
	public Time(int hour, int minute, int second) {
		if((hour < 0 || hour > 23) || (minute < 0 || minute > 60) || (second < 0 || second > 60)) {
			this.hour = 0;
			this.minute = 0;
			this.second = 0;
		} else {
			this.hour = hour;
			this.minute = minute;
			this.second = second;
		}
	}
	
	public void setHour(int hour) {
		if(hour<0 || hour>23) {
			System.out.println("Неверное входное значение");
		} else {
			this.hour = hour;
		}
	}
	
	public int getHour() {
		return hour;
	}
	
	public void setMinute(int minute) {
		if(minute<0 || minute>59) {
			System.out.println("Неверное входное значение");
		} else {
			this.minute = minute;
		}
	}
	
	public int getMinute() {
		return minute;
	}
	
	public void setSecond(int second) {
		if(second<0 || second>59) {
			System.out.println("Неверное входное значение");
		} else {
			this.second = second;
		}
	}
	
	public int getSecond() {
		return second;
	}
	
	public void changeHours(int h) {
		if(hour+h>23) {
			hour = (hour+h)%24;
		} else {
			hour = hour+h;
		}
	}
	
	@Override
	public int hashCode() {
		int result = 17;
		result = 31*result + hour;
		result = 31*result + minute;
		result = 31*result + second;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass())
			return false;
		Time object = (Time) obj;
		return this.hour == object.hour && this.minute == object.minute && this.second == object.second;
		
	}
	
	@Override
	public String toString() {
		return "Time [hour = "+hour+", minute = "+minute+", second = "+second+"]";
	}
	
	public void changeMinutes(int m) {
		if(minute+m>59) {
			changeHours((minute+m)/60);
			minute = (minute+m)%60;
		} else {
			minute = minute+m;
		}
	}
	
	public void changeSeconds(int s) {
		if(second+s>59) {
			changeMinutes((second+s)/60);
			second = (second+s)%60;
		} else {
			second = second+s;
		}
	}
	
	public String getInfo() {
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}
}
