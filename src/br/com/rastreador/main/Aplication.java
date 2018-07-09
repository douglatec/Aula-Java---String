package br.com.rastreador.main;

import br.com.rastreador.entities.Sttstring;

public class Aplication {

	public static void main(String[] args) {

		String report = "SA200STT;133537;306;20180601;03:00:21;5bf15;-12.689363;-038.384340;000.000;062.98;11;1;3009155;12.75;100000;2;2684;045363;4.1;1";
		String reportSplitted[] = report.split(";");

		// private String cabecalho;
		// private int id;
		// private String modelo;
		// private String data;
		// private String horario;
		// private String cellId;
		// private double lat;
		// private double lon;
		// private double veloc;
		// private double curso;
		// private int numbSat;
		// private int fix;
		// private int odom;
		// private double batPrinc;
		// private int io;
		// private int mode;
		// private int cont;
		// private int horim;
		// private double batBack;
		// private int memory;

		Sttstring sttReporte = new Sttstring();

		sttReporte.setCabecalho(reportSplitted[0]);
		sttReporte.setId(Integer.parseInt(reportSplitted[1]));
		sttReporte.setId(Integer.parseInt(reportSplitted[2]));
		sttReporte.setCabecalho(reportSplitted[3]);
		sttReporte.setCabecalho(reportSplitted[4]);
		sttReporte.setCabecalho(reportSplitted[5]);
		sttReporte.setCabecalho(Double.parseDouble(reportSplitted[6]));
		sttReporte.setCabecalho(reportSplitted[7]);
		sttReporte.setCabecalho(reportSplitted[8]);
		sttReporte.setCabecalho(reportSplitted[9]);
		sttReporte.setCabecalho(reportSplitted[10]);
		sttReporte.setCabecalho(reportSplitted[11]);
		sttReporte.setCabecalho(reportSplitted[12]);
		sttReporte.setCabecalho(reportSplitted[13]);
		sttReporte.setCabecalho(reportSplitted[14]);
		sttReporte.setCabecalho(reportSplitted[15]);
		sttReporte.setCabecalho(reportSplitted[16]);
		sttReporte.setCabecalho(reportSplitted[17]);
		sttReporte.setCabecalho(reportSplitted[18]);
		sttReporte.setCabecalho(reportSplitted[19]);
		sttReporte.setCabecalho(reportSplitted[20]);

	}

}
