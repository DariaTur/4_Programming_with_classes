package by.epam.training.module4;

import java.util.ArrayList;

/*
 * 3.Создать объект класса Государство, используя классы Область, Район, Город.
 *   Методы: вывести на консоль столицу, количество областей, площадь, областные центры. 
 */
public class Main {

	public static void main(String[] args) {
		District baranovichiDistrict = new District("Барановичский", "Барановичи", new ArrayList<City>());
		baranovichiDistrict.addCity(new City("Городище", 1873));
		baranovichiDistrict.addCity(new City("Жемчужный", 4136));
		 
		District braslavDistrict = new District("Браславский", "Браслав", new ArrayList<City>()); 
		braslavDistrict.addCity(new City("Браслав", 9829));
		braslavDistrict.addCity(new City("Опса",537));
		 
		Region brestRegion = new Region("Брестская", new ArrayList<District>(), "Брест");
		brestRegion.addDistrict(baranovichiDistrict);
		
		Region vitebskRegion = new Region("Витебская", new ArrayList<District>(), "Витебск");
		brestRegion.addDistrict(braslavDistrict);
		
		Region minskRegion = new Region("Минская", new ArrayList<District>(), "Минск");
		Region gomelRegion = new Region("Гомельская", new ArrayList<District>(), "Гомель");
		Region mogilevRegion = new Region("Могилевская", new ArrayList<District>(), "Могилев");
		Region grodnoRegion = new Region("Гродненская", new ArrayList<District>(), "Гродно");
		
		State belarus = new State(new ArrayList<Region>(),"Минск",207600);
		belarus.addRegion(grodnoRegion);
		belarus.addRegion(mogilevRegion);
		belarus.addRegion(minskRegion);
		belarus.addRegion(brestRegion);
		belarus.addRegion(vitebskRegion);
		belarus.addRegion(gomelRegion);
		
		System.out.println("Столица: "+belarus.getCapital());
		System.out.println("Количество областей: "+belarus.getAmountOfRegions());
		System.out.println("Площадь: "+belarus.getSquare());
		System.out.print("Областные центры: ");
		for(Region reg : belarus.getRegions()) {
			System.out.print(reg.getCenter()+" ");
		}
		
		
		
		

	}

}
