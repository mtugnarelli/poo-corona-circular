
/**
 * Una Corona Circular es una figura geométrica plana delimitada por dos circunferencias concéntricas. 
 * 
 */
public class CoronaCircular {

	private Circulo interior;
	
	private Circulo exterior;

	/**
	 * pre : 0 < radioInterior < radioExterior
	 * post: crea la Corona Circular con los radios interno y externo indicados.
	 *       
	 * @param radioInterior
	 * @param radioExterior
	 */
	public CoronaCircular(double radioInterior, double radioExterior) {
		
		if ((radioInterior > 0) &&  (radioInterior < radioExterior)) {
			
			this.interior = new Circulo(radioInterior);
			this.exterior = new Circulo(radioExterior);
		
		} else {

			/* si los radios no cumplen con la precondición, mantiene la consistencia del objeto
			 * dejandolo con un estado válido */
			this.interior = new Circulo(1.0);
			this.exterior = new Circulo(2.0);
		}
	}
	
	/**
	 * post: devuelve el radio interior de la corona.
	 */
	public double calcularRadioInterior() {
		
		return this.interior.calcularRadio();
	}
	
	/**
	 * post: devuelve el radio exterior de la corona.
	 */
	public double calcularRadioExterior() {
		
		return this.exterior.calcularRadio();
	}
	
	/**
	 * post: devuelve el perímetro total
	 *       (exterior mas interior)
	 */
	public double calcularPerimetro() {
		
		return this.interior.calcularPerimetro() + this.exterior.calcularPerimetro();
	}
	
	/**
	 * post : devuelve el área que encierra.
	 */
	public double calcularArea() {
		
		return this.exterior.calcularArea() - this.interior.calcularArea();
	}
		
	/**
	 * pre : 0 < radioInterior < radioExterior.
	 * post: cambia el radioInterior por el indicado.
	 * 
	 * @param radioInterior
	 */
	public void cambiarRadioInterior(double radioInterior) {
		
		if (radioInterior < this.exterior.calcularRadio()) {
			
			this.interior.cambiarRadio(radioInterior);
		}
	}

	/**
	 * pre : radioExterior > radioInterior.
	 * post: cambia el radioExterior por el indicado.
	 * 
	 */
	public void cambiarRadioExterior(double radioExterior) {

		if (radioExterior > this.interior.calcularRadio()) {
			
			this.exterior.cambiarRadio(radioExterior);
		}
	}
	
	/**
	 * post: devuelve el diámetro de la corona.
	 */
	public double calcularDiametro() {
	
		return this.exterior.calcularDiametro();
	}
}