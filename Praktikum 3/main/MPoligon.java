// File     : Poligon.java 02/04/2023
// Penulis  : Wildan Adji Prabowo
// Deskripsi: Representasi dasar dari objek poligon (segi banyak)

package org.main;

import org.bangundatar.*;

public class MPoligon{
	public static void main(String[] args) {
		PersegiPanjang persegi = new PersegiPanjang(10,10,4);
		persegi.printInfo();
		System.out.println("Luas Persegi Panjang : "+persegi.hitungLuas());
		
		Segitiga segitiga = new Segitiga(2,3,3);
		segitiga.printInfo();
		System.out.println("Luas Persegi Panjang : "+segitiga.hitungLuas());
	}
}