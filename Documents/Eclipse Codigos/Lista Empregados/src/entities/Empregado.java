package entities;

public class Empregado {
	private String name;
	private Integer id;
	private Double salario;
	
	public Empregado(String name, Integer id, Double salario) {
		this.name = name;
		this.id = id;
		this.salario = salario;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	public void aumentoSalarial(Double percentual) {
		this.salario += salario*percentual/100;
	}
	
	public String toString() {
		return id +", "+ name + ", "+String.format("%.2f", salario);
		
		
	}
}
