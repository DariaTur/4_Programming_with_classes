package by.epam.training.module4;

public class Train {
	private String destination;
	private int number;
	private String departureTime;
	
	public Train() {};
	
	public Train(String destination, int number, String departureTime) {
		this.destination = destination;
		this.number = number;
		this.departureTime = departureTime;
	}
	
	@Override
	public String toString() {
		return "Train [destination = " +destination+", number = "+number+", departureTime = "+departureTime+"]";
	}
	
	@Override
	public int hashCode() {
		int result = 17;
		result = 31*result+(destination != null ? destination.hashCode() : 0);
		result = 31*result+number;
		result = 31*result+(departureTime != null ? departureTime.hashCode() : 0);
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) 
			return true;
		if(obj == null)
			return false;
		if(this.getClass() != obj.getClass())
			return false; 
		
		Train object = (Train) obj;
		return this.number == object.number && this.departureTime.equals(object.departureTime) && this.destination.equals(object.destination);
	}
	
	public static Train[] sortByNumbers(Train[] trains) {
		boolean p = true;
		while (p) {
			p = false;
			for(int i = 0; i<trains.length-1; i++) {
				if(trains[i].number>trains[i+1].number) {
					p = true;
					Train temp = trains[i];
					trains[i] = trains[i+1];
					trains[i+1] = temp;
				}
			}
		}
		return trains;
	}
	
	private static boolean isLater(String t1, String t2) {
		String[] time1 = t1.split(":");
		String[] time2 = t2.split(":");
		
		if(Integer.parseInt(time1[0])>Integer.parseInt(time2[0])) {
			return true;
		} else if(Integer.parseInt(time1[0])==Integer.parseInt(time2[0]) && Integer.parseInt(time1[1])>Integer.parseInt(time2[1])) {
			return true;
		}
		
		return false;
	}
	
	public static Train[] sortByDestination(Train[] trains) {
		boolean p = true;
		while (p) {
			p = false;
			for(int i = 0; i<trains.length-1; i++) {
				if(trains[i].destination.compareTo(trains[i+1].destination)>0) {
					p = true;
					Train temp = trains[i];
					trains[i] = trains[i+1];
					trains[i+1] = temp;
				} else if(trains[i].destination.compareTo(trains[i+1].destination)==0) {
					if(isLater(trains[i].departureTime, trains[i+1].departureTime)) {
						p = true;
						Train temp = trains[i];
						trains[i] = trains[i+1];
						trains[i+1] = temp;
					}
				}
			}
		}
		return trains;
	}
	
	public void view() {
		System.out.println("Место прибытия: "+destination+ "\nВремя отправления: "+departureTime+ "\nНомер поезда: "+number);
	}
	
	public static void printTrainByNumber(Train[] trains, int num) {
		for(Train t : trains) {
			if(t.number == num) {
				t.view();
			}
		}
	}
	
	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		if(number > 0) {
			this.number = number;
		}
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}
	
	
}
