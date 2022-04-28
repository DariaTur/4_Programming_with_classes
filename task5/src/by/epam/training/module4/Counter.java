package by.epam.training.module4;

public class Counter {
	private int minValue;
	private int maxValue;
	private int currentValue;

	
	public Counter() {
		minValue = 0;
		maxValue = 100;
		currentValue = 0;
	}
	
	public Counter(int minValue, int maxValue, int currentValue) {
		if(currentValue > maxValue || currentValue<minValue || minValue>=maxValue) {
			throw new IllegalArgumentException("Некорректные аргументы");
		}
		this.minValue = minValue;
		this.maxValue = maxValue;
		this.currentValue = currentValue;
	}
	
	public void increase() {
		if(currentValue<maxValue) {
			currentValue++;
		} else {
			System.out.println("Увеличение невозможно");
		}
	}
	
	public void decrease() {
		if(currentValue>minValue) {
			currentValue--;
		} else {
			System.out.println("Уменьшение невозможно");
		}
	}
	
	public void viewState() {
		System.out.println("Нижняя граница счетчика: "+ minValue 
				+ "\nВерхняя граница счетчика: "+maxValue
				+"\nТекущее значение: "+currentValue);
	}
	
	
	@Override
	public int hashCode() {
		int result = 17;
		result = 31*result + currentValue;
		result = 31*result + maxValue;
		result = 31*result + minValue;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Counter other = (Counter) obj;
		return currentValue == other.currentValue && maxValue == other.maxValue && minValue == other.minValue;
	}
	
	@Override
	public String toString() {
		return "Counter [minValue=" + minValue + ", maxValue=" + maxValue + ", currentValue=" + currentValue + "]";
	}

	public int getMinValue() {
		return minValue;
	}

	public void setMinValue(int minValue) {
		this.minValue = minValue;
	}

	public int getMaxValue() {
		return maxValue;
	}

	public void setMaxValue(int maxValue) {
		this.maxValue = maxValue;
	}

	public int getCurrentValue() {
		return currentValue;
	}

	public void setCurrentValue(int currentValue) {
		this.currentValue = currentValue;
	}
	
}
