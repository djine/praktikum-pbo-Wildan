// Nama File : OperasiTitik.java
// Nama      : Wildan Adji Prabowo
// Tanggal   : 04/03/2023
// Deskripsi : File operasi titik 

class OperasiTitik{
		
	 private void refleksiSumbuX(Titik t1){
        t1.setAbsis(t1.getAbsis());
        t1.setOrdinat(-1*(t1.getOrdinat()));
    }

    private void refleksiSumbuY(Titik t1){
        t1.setAbsis(-1*(t1.getAbsis()));
        t1.setOrdinat(t1.getOrdinat());
    }

    // Public method
    public Titik refleksiX(Titik t1){
        refleksiSumbuX(t1);
        return t1;
    }

    public Titik refleksiY(Titik t1){
        refleksiSumbuY(t1);
        return t1;
    }
}
	
	