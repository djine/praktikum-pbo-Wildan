// Nama: Wildan Adji Prabowo
// Nim : 24060121140097
// Tanggal : 25 Febuari 2023
// Deskripsi : Program utama dari class titik 

class MTitik{

		public static void main(String[] args){
				Titik t1 = new Titik();
				t1.setAbsis(1.0);
				t1.setOrdinat(2.0);
				
				Titik t2 = new Titik();
				t2.setAbsis(4.0);
				t2.setOrdinat(9.0);
				
				Titik t3 = new Titik();				
				t3.setAbsis(5.0);
				t3.setOrdinat(6.0);
				

				System.out.println("Jumlah objek titik : " + (int) Titik.counterTitik());
				System.out.println("t1("+t1.getAbsis()+", " + t1.getOrdinat()+")");
				System.out.println("t2("+t2.getAbsis()+", " + t2.getOrdinat()+")");
				System.out.println("t3("+t3.getAbsis()+", " + t3.getOrdinat()+")");
				
		}
}
