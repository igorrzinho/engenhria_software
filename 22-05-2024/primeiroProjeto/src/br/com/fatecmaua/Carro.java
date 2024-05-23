package br.com.fatecmaua;

public class Carro {
	private String cor;
	private String marca;
	private String modelo;
	private int ano_fabricacao;
	private int ano_modelo;
	private String num_chassi;
	private String placa;
	private double vel_inicia;
	private double vel_atual;
	
	public String getCor(){
		return this.cor;
	}
	
	public void setCor(String nova_cor) {
		if (!nova_cor.equals("Dourado")) {
			
			this.cor = nova_cor;
		}else {
			System.out.println("cor invalida");
		}
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno_fabricacao() {
		return ano_fabricacao;
	}

	public void setAno_fabricacao(int ano_fabricacao) {
		if(ano_fabricacao <= 2024) {
			this.ano_fabricacao = ano_fabricacao;
		}else {
			System.out.println("Ano invalido");
		}
	}

	public int getAno_modelo() {
		return ano_modelo;
	}

	public void setAno_modelo(int ano_modelo) {
		this.ano_modelo = ano_modelo;
	}

	public String getNum_chassi() {
		return num_chassi;
	}

	public void setNum_chassi(String num_chassi) {
		this.num_chassi = num_chassi;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		if(placa.length() == 7) {
			this.placa = placa;			
		}
	}

	public double getVel_inicia() {
		return vel_inicia;
	}

	public void setVel_inicia(double vel_inicia) {
		this.vel_inicia = vel_inicia;
	}

	public double getVel_atual() {
		return vel_atual;
	}

	public void setVel_atual(double vel_atual) {
		this.vel_atual = vel_atual;
	}
	
	
	public Double acelerar(Double aceleracao) {
		if(vel_inicia == 0.0) {
			System.out.println("Carro parado");			
		}
		vel_atual += aceleracao;
		System.out.println("Carro esta a "+vel_atual+ "km/h");
		return vel_atual;
	}
	
	public Double desacelerar(Double desaceleracao) {
		if(desaceleracao >=  vel_atual) {
			System.out.println("Carro parado");		
			vel_atual -= desaceleracao;
			vel_atual -= desaceleracao;
			System.out.println("Carro esta a "+((vel_atual >= 0)?"carro em movimento ":"carro parado ")+vel_atual+ "km/h");
			return vel_atual;
		}else {
			System.out.println("valor maior que aceleração atual");
			return vel_atual;
		}	
	}
	
	
	public Carro(String cor, String marca, String modelo, int ano_fabricacao, int ano_modelo, String num_chassi,
			String placa, double vel_inicia, double vel_atual) {
		setCor(cor);
		setMarca(marca);
		setModelo(modelo);
		setAno_fabricacao(ano_fabricacao);
		setAno_modelo(ano_modelo);
		setNum_chassi(num_chassi);
		setVel_inicia(vel_inicia);
		setVel_atual(vel_atual);
	}

}
