package com.Juaracoding.project;

import java.util.Scanner;

public class Main {

	public static void main(String [] args) {
		MenggambarDenganJava gambar = new MenggambarDenganJava();
		String ulang = "Y";
		Scanner hasil = new Scanner(System.in);
		
		int bentuk = hasil.nextInt();
		
		
		
//		gambar.setResultKal(gambar.kotak(5));
//		gambar.hasil();
//		gambar.setResultKal(gambar.segitiga(5));
//		gambar.hasil();
//		gambar.setResultKal(gambar.segitigaTerbalik(5));
//		gambar.hasil();
		gambar.campur(5);
//		gambar.hasil();
		gambar.segitigaSelangseling(5);
		//gambar.hasil();
//		gambar.setResultKal(gambar.gabungGambar(5));
//		gambar.hasil();
		}
	
}
