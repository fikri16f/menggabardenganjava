package com.Juaracoding.project;

public class MenggambarDenganJava {

//	private String namaGambar="";
//	private double resultKalkulasi = 0;
//	
//	
//	public double getResultKalulasi() {
//		return resultKalkulasi;
//	}
//	
//	public void setResultKal(double resultKalkulasi) {
//		this.resultKalkulasi = resultKalkulasi;
//	}
//	
//	public MenggambarDenganJava(String gambar) {
//		this.namaGambar = gambar;
//	}
	
	
	public void kotak (int nilai) {
		
		System.out.println("===== Kotak =====");
		System.out.println(" ");
		for (int i = 0; i< nilai; i++) {	
			for (int j = 0; j<nilai; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	public void segitiga(int nilai) {
		
		System.out.println("===== Segitiga =====");
		System.out.println(" ");
		for(int x=0; x<nilai; x++) {	
			for(int y=0; y<=x; y++) {
				System.out.print("*");
						}	
			System.out.println("");
		}
	}
	
	public void segitigaTerbalik(int nilai) {
		
		System.out.println("===== Segitiga Terbalik=====");
		System.out.println(" ");
		for(int x=0; x<nilai; x++) {	
			for(int y=x; y<nilai; y++) {
				System.out.print("*");
						}	
			System.out.println("");
		}
	}
	
	
	public void segitigaSelangseling(int nilai) {
		
		System.out.println("===== Gambar Selang Seling =====");
		System.out.println(" ");
		for (int a = 0; a < nilai;a++){
			 
		    for (int b = 0;b < nilai;b++){
		    	if ((a+b) %2 == 0) {
		        System.out.print("*");
	       
		        }else {
		        	System.out.print("!");
		        }
		    	 if ( (a + b) == 4){
			            break;
		    	}
		    }
		    System.out.println(" ");
		}
	}

	public void campur(int nilai) {
	
		System.out.println("===== Gambar Campur =====");
		System.out.println(" ");
		for(int x = 0 ; x < nilai; x++) {
			for (int y = 0 ; y < nilai ;y++) {
				if (y<=x) {
					System.out.print("*");
				}else {
					System.out.print("#");
				}
			}
			System.out.println(" ");
		}
}
	
	
	public void gabungGambar(int nilai) {
		
		System.out.println("===== Gabung Gambar =====");
		System.out.println(" ");
		for(int x=0; x<nilai; x++) {
			for(int y=0; y<=nilai; y++) {
				if(y<=x) {
					System.out.print("*");
				}else {
					System.out.print("!");
				}

			}
			System.out.println();

		}
			
			for(int x=0; x<nilai; x++) {
				for(int y=0; y<=nilai; y++) {
					if(y<=x) {
						System.out.print("*");
					}else {
						System.out.print("!");
					}

				}
				System.out.println();
			}
}
	

			
//	public void hasil () {
//		System.out.println (this.getResultKalulasi());
//	}
	
	
	


	
	
}
	