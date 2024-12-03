package entities;

public class FenomenoClimatico implements Monitoravel{
	
	private String nome;
	private double duracao;
	private double intensidade;
	private AreaGeografica areaImpactada;
	
	public FenomenoClimatico(String nome, double duracao, double intensidade)
	{
		this.nome = nome;
		this.duracao = duracao;
		this.intensidade = intensidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getDuracao() {
		return duracao;
	}

	public void setDuracao(double duracao) {
		this.duracao = duracao;
	}

	public double getIntensidade() {
		return intensidade;
	}

	public void setIntensidade(double intensidade) {
		this.intensidade = intensidade;
	}

	public AreaGeografica getAreaImpactada() {
		return areaImpactada;
	}

	public void setAreaImpactada(AreaGeografica areaImpactada) {
		this.areaImpactada = areaImpactada;
	}
	
	@Override
	public void imprimirInformacoes() {
		System.out.println(getNome());
		System.out.println("Duração: "+getDuracao()+" minutos");
		System.out.print("Intensidade: ");
		if(getNome() =="Terremoto")
		{
			if(getIntensidade() > 1 && getIntensidade() <= 4)
			{
				System.out.println("Baixa");
			}
			else if(getIntensidade() > 5 && getIntensidade()<=7)
			{
				System.out.println("Moderada");
			}
			else if(getIntensidade()> 6 && getIntensidade() <= 10)
			{
				System.out.println("Alta");
			}
		}else if(getNome() =="Chuva")
		{
			if(getIntensidade() > 1 && getIntensidade() <= 30)
			{
				System.out.println("Fraca");
			}
			else if(getIntensidade() > 30 && getIntensidade()<=60)
			{
				System.out.println("Moderada");
			}
			else if(getIntensidade()> 60 && getIntensidade() <= 100)
			{
				System.out.println("Forte");
			}
		}
		System.out.println(areaImpactada.getArea()+" Metros quadrados - " + areaImpactada.getBioma());
		
		
	}
}
