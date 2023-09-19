package fpoo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Arquivo {

	private String nomeArquivo;
	private String tipoArquivo;

	String path = "c:\\temp\\ultimoTiro.txt";

	public String getNomeArquivo() {
		return nomeArquivo;
	}

	public void setNomeArquivo(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
	}

	public String getTipoArquivo() {
		return tipoArquivo;
	}

	public void setTipoArquivo(String tipoArquivo) {
		this.tipoArquivo = tipoArquivo;
	}
	public void gravaArquivo (String Arquivo) throws IOException{
		//Grava os arquivos
		BufferedWriter buffWrite = new BufferedWriter (new FileWriter(path));
		this.nomeArquivo = Arquivo;
		buffWrite.append(Arquivo + "\n");
		buffWrite.close();
	}

	public void LerArquivo(String arquivo) throws IOException{
		BufferedReader buffRead = new BufferedReader(new FileReader(path));
		while (true) {
			if(arquivo != null) {
				System.out.println(arquivo);
			}else
				break;
			arquivo = buffRead.readLine();
		}
		buffRead.close();
	}

}

