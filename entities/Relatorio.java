package entities;

import java.util.LinkedList;

public class Relatorio {
	private LinkedList<FenomenoClimatico> fenomenos;
	private LinkedList<Animal> animais;
	
	public Relatorio()
	{
		fenomenos = new LinkedList<>();
		animais = new LinkedList<>();
	}
	
	
	public LinkedList<FenomenoClimatico> getFenomenos() {
		return fenomenos;
	}
	
	public void addFenomeno(FenomenoClimatico fenomeno)
	{
		fenomenos.add(fenomeno);
	}
	
	public void rmFenomeno(FenomenoClimatico fenomeno)
	{
		fenomenos.remove(fenomeno);
	}
	
	
	public void addAnimal(Animal animal)
	{
		animais.add(animal);
	}
	
	public void rmAnimal(FenomenoClimatico fenomeno)
	{
		animais.remove(fenomeno);
	}
	public void gerarRelatorio()
	{
		System.out.println("FENOMENOS");
		for(FenomenoClimatico fenomeno : fenomenos)
		{
			fenomeno.imprimirInformacoes();
			System.out.println("Animais afetados");
			System.out.println("==========================");
		}
		
		System.out.println("ANIMAIS");
		for(Animal animal : animais)
		{
			animal.imprimirInformacoes();
			System.out.println("=========================");
		}
	}

	
}
