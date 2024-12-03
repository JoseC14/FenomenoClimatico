package application;

import entities.Animal;
import entities.AreaGeografica;
import entities.FenomenoClimatico;
import entities.Relatorio;

public class Main {

	public static void main(String[] args) {
		FenomenoClimatico fenomeno = new FenomenoClimatico("Chuva",270,5);
		AreaGeografica area = new AreaGeografica(500,"Caatinga",36);
		fenomeno.setAreaImpactada(area);
		Animal animal = new Animal("Preá",area);
		
		FenomenoClimatico fenomeno2 = new FenomenoClimatico("Terremoto",5,5);
		AreaGeografica area2 = new AreaGeografica(1000,"Savana",40);
		fenomeno2.setAreaImpactada(area2);
		Animal animal2 = new Animal("Leão", area2);
		
		Relatorio rel = new Relatorio();
		rel.addFenomeno(fenomeno);
		rel.addFenomeno(fenomeno2);
		
		rel.addAnimal(animal);
		rel.addAnimal(animal2);
		rel.gerarRelatorio();
	}

}
