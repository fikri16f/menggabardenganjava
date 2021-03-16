package com.Juaracoding.project;

public class gambarbentuk {

	
	
	public static void main (String [] args) {

	//bangun kotak
		
		System.out.println("===== Kotak =====");
		System.out.println(" ");
		for (int a = 0; a < 5;a++){ //1
			 
		    for (int b = 0;b < 5;b++){ //2
		        System.out.print("*");
		 
		    }
		    System.out.println(" ");
		 
		}
	
	
	//Bangun Segitiga
	System.out.println("===== Segitiga =====");
	System.out.println(" ");
	
	for (int a = 0; a < 5;a++){ //1
		 
	    for (int b = 0;b < 5;b++){ //2
	        System.out.print("*");
	        if (a == b){
	            break;
	        }
	    }
	    System.out.println(" ");
	}
	

	//Segitiga Terbalik
	System.out.println("===== Segitiga Terbalik=====");
	System.out.println(" ");
	
	for (int a = 0; a < 5;a++){
		 
	    for (int b = 0;b < 5;b++){
	        System.out.print("*");
        if ( (a + b) == 4){
	            break;
	        }
	    }
	    System.out.println(" ");
	}
	
	//Gambar Selang-seling
	System.out.println("===== Gambar Selang Seling =====");
	System.out.println(" ");
	
	for (int a = 0; a < 5;a++){
		 
	    for (int b = 0;b < 5;b++){
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
	
	//Gambar Campur
	System.out.println("===== Gambar Campur =====");
	System.out.println(" ");
	for(int x = 0 ; x < 5; x++) {
		for (int y = 0 ; y <= 5 ;y++) {
			if (y<=x) {
				System.out.print("*");
			}else {
				System.out.print("#");
			}
		}
		System.out.println(" ");
	 
	}
	
	
	//Gabung Gambar
	System.out.println("===== Gabung Gambar =====");
	System.out.println(" ");
	for(int x = 0 ; x < 5; x++) {
		for (int y = 0 ; y <= 5 ;y++) {
			if (y<=x) {
				System.out.print("*");
			}else {
				System.out.print("#");
			}
		}
		System.out.println(" ");
	 
	}
	for (int a = 0; a < 5;a++){
		 
	    for (int b = 0;b < 5;b++){
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
	
	
	
	//batas atas
	}



	public void hasil() {
		System.out.println();
		
	}

	

}
	
