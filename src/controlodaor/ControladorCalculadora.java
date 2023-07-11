package controlodaor;

public class ControladorCalculadora 
{
	private Double numeroUno ;
	private Double numeroDos ;
	private String  variableOperacion = "" ;
	
	// generar un constructor sin field :
	
	

	public ControladorCalculadora() 
	{
		
		
		
	}
	// generar setters y getters :
	
	public Double getNumeroUno() {
		return numeroUno;
	}
	public void setNumeroUno(Double numeroUno) {
		this.numeroUno = numeroUno;
	}
	public Double getNumeroDos() {
		return numeroDos;
	}
	public void setNumeroDos(Double numeroDos) {
		this.numeroDos = numeroDos;
	}
	
	public Double sumar() {
		return numeroUno + numeroDos ;
	}
	public Double restar() {
		return numeroUno - numeroDos ;
	}
	
	public Double multiplicar() {
		return numeroUno * numeroDos ;
		
	}
	
	public Double dividir() {
		return numeroUno / numeroDos ;	
		}
	
	public String getVariableOperacion() {
		return variableOperacion;
	}

	public void setVariableOperacion(String variableOperacion) {
		this.variableOperacion = variableOperacion;
	}
	
	public Double eligeOperacion() {
		
	}
	
	
	
	
}

