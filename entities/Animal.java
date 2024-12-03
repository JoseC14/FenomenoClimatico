package entities;

public class Animal implements Monitoravel{
	private String especie;
	private AreaGeografica habitat;
	
	public Animal(String especie, AreaGeografica habitat) {
		this.especie = especie;
		this.habitat = habitat;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public AreaGeografica getHabitat() {
		return habitat;
	}

	public void setHabitat(AreaGeografica habitat) {
		this.habitat = habitat;
	}
	
	@Override
	public void imprimirInformacoes()
	{
		System.out.println("Especie: "+getEspecie());
		System.out.println("Habitat: "+getHabitat().getBioma());
	}
	
	
}
