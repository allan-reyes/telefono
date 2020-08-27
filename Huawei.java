
public class Huawei {
	int botones;
	double bocinaFrontal;
	double bocinaAltas;
	String pantalla;
	int camaraFrontal;
	int camaraTrasera1;
	int camaraTrasera2;
	double puertoDeCargaUSB;
	boolean sensorDeAproximidad;
	boolean sensorGiroSensor;
	double alto;
	double ancho;
	double profundidad;
	double peso;
	
	Huawei(){
		botones = 4;
		bocinaFrontal = 100;			//UNIDADES DB
		bocinaAltas = 200;				//UNIDADES DB
		pantalla = "LCD";
		camaraFrontal = 12;				//UNIDADES MP
		camaraTrasera1 = 30;			//UNIDADES MP
		camaraTrasera2 = 40;			//UNIDADES MP
		puertoDeCargaUSB = 3.1;
		sensorDeAproximidad = true;
		sensorGiroSensor = true;
		alto = 158.3;					//UNIDADES MM
		ancho = 75.3;					//UNIDADES MM
		profundidad = 7.6;				//UNIDADES MM
		peso = 165;						//UNIDADES GR
}
		
		/*SECCION DE LOS SETTERS Y GETTERS*/
		
	public int getBotones() {
		return botones;
	}


	public void setBotones(int botones) {
		this.botones = botones;
	}


	public double getBocinaFrontal() {
		return bocinaFrontal;
	}


	public void setBocinaFrontal(double bocinaFrontal) {
		this.bocinaFrontal = bocinaFrontal;
	}


	public double getBocinaAltas() {
		return bocinaAltas;
	}


	public void setBocinaAltas(double bocinaAltas) {
		this.bocinaAltas = bocinaAltas;
	}


	public String getPantalla() {
		return pantalla;
	}


	public void setPantalla(String pantalla) {
		this.pantalla = pantalla;
	}


	public int getCamaraFrontal() {
		return camaraFrontal;
	}


	public void setCamaraFrontal(int camaraFrontal) {
		this.camaraFrontal = camaraFrontal;
	}


	public int getCamaraTrasera1() {
		return camaraTrasera1;
	}


	public void setCamaraTrasera1(int camaraTrasera1) {
		this.camaraTrasera1 = camaraTrasera1;
	}


	public int getCamaraTrasera2() {
		return camaraTrasera2;
	}


	public void setCamaraTrasera2(int camaraTrasera2) {
		this.camaraTrasera2 = camaraTrasera2;
	}


	public double getPuertoDeCargaUSB() {
		return puertoDeCargaUSB;
	}


	public void setPuertoDeCargaUSB(double puertoDeCargaUSB) {
		this.puertoDeCargaUSB = puertoDeCargaUSB;
	}


	public boolean isSensorDEAproximidad() {
		return sensorDeAproximidad;
	}


	public void setSensorDEAproximidad(boolean sensorDeAproximidad) {
		this.sensorDeAproximidad = sensorDeAproximidad;
	}


	public boolean isSensorGiroSensor() {
		return sensorGiroSensor;
	}


	public void setSensorGiroSensor(boolean sensorGiroSensor) {
		this.sensorGiroSensor = sensorGiroSensor;
	}


	public double getAlto() {
		return alto;
	}


	public void setAlto(double alto) {
		this.alto = alto;
	}


	public double getAncho() {
		return ancho;
	}


	public void setAncho(double ancho) {
		this.ancho = ancho;
	}


	public double getProfundidad() {
		return profundidad;
	}


	public void setProfundidad(double profundidad) {
		this.profundidad = profundidad;
	}


	public double getPeso() {
		return peso;
	}
}
