package br.com.rastreador.entities;

public class Sttstring {

	private String cabecalho;
	private int id;
	private String modelo;
	private String data;
	private String horario;
	private String cellId;
	private double lat;
	private double lon;
	private double veloc;
	private double curso;
	private int numbSat;
	private int fix;
	private int odom;
	private double batPrinc;
	private int io;
	private int mode;
	private int cont;
	private int horim;
	private double batBack;
	private int memory;

	public String getCabecalho() {
		return cabecalho;
	}

	public void setCabecalho(String cabecalho) {
		this.cabecalho = cabecalho;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public String getCellId() {
		return cellId;
	}

	public void setCellId(String cellId) {
		this.cellId = cellId;
	}

	public double getLat() {
		return lat;
	}

	public void setLat(double lat) {
		this.lat = lat;
	}

	public double getLon() {
		return lon;
	}

	public void setLon(double lon) {
		this.lon = lon;
	}

	public double getVeloc() {
		return veloc;
	}

	public void setVeloc(double veloc) {
		this.veloc = veloc;
	}

	public double getCurso() {
		return curso;
	}

	public void setCurso(double curso) {
		this.curso = curso;
	}

	public int getNumbSat() {
		return numbSat;
	}

	public void setNumbSat(int numbSat) {
		this.numbSat = numbSat;
	}

	public int getFix() {
		return fix;
	}

	public void setFix(int fix) {
		this.fix = fix;
	}

	public int getOdom() {
		return odom;
	}

	public void setOdom(int odom) {
		this.odom = odom;
	}

	public double getBatPrinc() {
		return batPrinc;
	}

	public void setBatPrinc(double batPrinc) {
		this.batPrinc = batPrinc;
	}

	public int getIo() {
		return io;
	}

	public void setIo(int io) {
		this.io = io;
	}

	public int getMode() {
		return mode;
	}

	public void setMode(int mode) {
		this.mode = mode;
	}

	public int getCont() {
		return cont;
	}

	public void setCont(int cont) {
		this.cont = cont;
	}

	public int getHorim() {
		return horim;
	}

	public void setHorim(int horim) {
		this.horim = horim;
	}

	public double getBatBack() {
		return batBack;
	}

	public void setBatBack(double batBack) {
		this.batBack = batBack;
	}

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;
	}

	// public Sttstring(String cabecalho, int id, String modelo, String data, String
	// horario, String cellId, double lat,
	// double lon, double veloc, double curso, int numbSat, int fix, int odom,
	// double batPrinc, int io, int mode,
	// int cont, int horim, double batBack, int memory) {
	// super();
	// this.cabecalho = cabecalho;
	// this.id = id;
	// this.modelo = modelo;
	// this.data = data;
	// this.horario = horario;
	// this.cellId = cellId;
	// this.lat = lat;
	// this.lon = lon;
	// this.veloc = veloc;
	// this.curso = curso;
	// this.numbSat = numbSat;
	// this.fix = fix;
	// this.odom = odom;
	// this.batPrinc = batPrinc;
	// this.io = io;
	// this.mode = mode;
	// this.cont = cont;
	// this.horim = horim;
	// this.batBack = batBack;
	// this.memory = memory;
	// }
	@Override
	public String toString() {
		return "Sttstring [cabecalho=" + cabecalho + ", id=" + id + ", modelo=" + modelo + ", data=" + data
				+ ", horario=" + horario + ", cellId=" + cellId + ", lat=" + lat + ", lon=" + lon + ", veloc=" + veloc
				+ ", curso=" + curso + ", numbSat=" + numbSat + ", fix=" + fix + ", odom=" + odom + ", batPrinc="
				+ batPrinc + ", io=" + io + ", mode=" + mode + ", cont=" + cont + ", horim=" + horim + ", batBack="
				+ batBack + ", memory=" + memory + "]";
	}

}
