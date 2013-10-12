/**
 * Un Círculo es el lugar geométrico de los puntos del plano cuya distancia a otro punto fijo, 
 * llamado centro, es menor o igual que una cantidad constante, llamada radio
 * 
 * 
 */
public class Circulo {

	private double diametro = 2;
	
	/**
	 * post: el Circulo queda inicializado con radio 1.
	 */
	public Circulo() {
	}

	/**
	 * pre : radio tiene que ser mayor a 0.
	 * post: el Circulo queda inicializado con el radio indicado
	 * 	     por parámetro.
	 * 
	 * @param radio : radio que va a tener el Circulo.
	 */
	public Circulo(double radio) {
		
		this.cambiarRadio(radio);
	}
	
	/**
	 * post: devuelve el radio que tiene el Círculo
	 */
	public double calcularRadio() {
		
		return this.diametro / 2;
	}

	/**
	 * post: devuelve el diámetro que tiene el Círculo.
	 */
	public double calcularDiametro() {
		
		return this.diametro;
	}
	
	/**
	 * post: devuelve el perímetro que tiene el Círculo.
	 */
	public double calcularPerimetro() {
		
		return this.diametro * Math.PI;
	}
	
	/**
	 * post: devuelve el área que encierra el Círculo.
	 */
	public double calcularArea() {
		
		return Math.PI * Math.pow(this.calcularRadio(), 2);
	}
	
	/**
	 * pre : radio debe ser mayor a 0.
	 * post: cambia el valor del radio por el dado.
	 * 
	 * @param radio : nuevo radio del Circulo
	 */
	public void cambiarRadio(double radio) {
		
		this.cambiarDiametro(radio * 2);
	}
	
	/**
	 * pre : diametro debe ser mayor a 0.
	 * post: cambiar el valor del diámetro por el indicado
	 * 
	 * @param diametro : nuevo diámetro del Círculo
	 */
	public void cambiarDiametro(double diametro) {
		
		if (diametro > 0) {
			
			this.diametro = diametro;
		}
	}
	
	/**
	 * pre : perimetro es mayor a 0.
	 * post: cambia el valor del perímetro por el indicado
	 * 
	 * @param perimetro : nuevo perímetro del Círculo
	 */
	public void cambiarPerimetro(double perimetro) {
		
		this.cambiarDiametro( perimetro / Math.PI );
	}
	
	/**
	 * pre : area es mayor a 0.
	 * post: cambia el valor del área por el indicado.
	 * 
	 * @param area : nuevo área del Círculo
	 */
	public void cambiarArea(double area) {
		
		this.cambiarDiametro( 2 * Math.sqrt(area / Math.PI) );
	}
} 
