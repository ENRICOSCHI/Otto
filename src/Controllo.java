
public class Controllo {

	private int NumeroGrandezzaArray = 5; //INT PER CAMBIARE LA GRANDEZZA DELL'ARRAY 
	public Controllo() {
		
	}
	public int GrandezzaArray() {
		return NumeroGrandezzaArray;
	}
	public void SottoLoZero(int[] a) {
		for(int i=0;i<NumeroGrandezzaArray; i++) {
			a[i]=-1;
		}
	}
	public int ControlloDoppio(int n,int i,int[] c) {
		boolean pres=false;
		for(int j=0;j<=i;j++) {
			if(c[j]== n) {//se � gi� esistente nell'array
				pres=true;
				i--;
				}
			break;//esci dal for j
			}
		if(pres==false) {
			c[i] = n;//inserire input
			i++;
		}
		
		return i;//ritorna i 
	}
	
	
	public int Vincita(int[] a, int[] b) {
		int p=0; //numeri uguali nei 2 array
		for(int z=0;z==NumeroGrandezzaArray-1;z++) {
			for(int y=z;y==NumeroGrandezzaArray-1;z++) {
				if(a[z] == b[y]) {
					p++;
				}
			}
		}
		return p;
	}
	
	public String Stampa(int[] a) {
		String stringa="";
		for(int i=0;i<a.length;i++) {
			int n = a[i];
			stringa= stringa+ " " + n + " ";
		}
		return stringa;
	}
}
