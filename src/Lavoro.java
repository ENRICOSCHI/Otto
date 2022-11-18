import java.util.*;// * prende tutte le funzioni all'interno della libreria util

public class Lavoro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Controllo contr= new Controllo();//nomina classe nel main
		int Nfor = contr.GrandezzaArray();//grandezza dell'array (così è più facile da gestire)
		int[] arrInp = new int[Nfor];//creazione array input giocatore
		contr.SottoLoZero(arrInp);//tutto a -1
		int[] arrRand = new int[Nfor];//inizializzazione array random
		contr.SottoLoZero(arrRand);//tutto a -1
		Scanner Input= new Scanner(System.in); //input
		
		int i=0;//indice i
		while(i<=Nfor-1) {//per controllare input user
			System.out.println("Inserie numeri");
			int n=Input.nextInt();//l'utente inserisce l'input
			if(n>-1 && n<91) {
				i=contr.ControlloDoppio(n, i,arrInp);//richiamo la funzione controllo nella classe
			}		
			else {
				System.out.println("Errore nell'inserire il numero\n");
			}
		}
			
		Random Rand = new Random();//nomina del random
		int k=0;//indice k
		while(k<=Nfor-1) {
			int r= Rand.nextInt(91);//numero casuale fino al 90
			k= contr.ControlloDoppio(r, k,arrRand);
		}
		String Utente= contr.Stampa(arrInp);
		System.out.print("Numeri inseriti: "+Utente +"\n");
		String Random = contr.Stampa(arrRand);
		System.out.print("Numeri estratti: "+Random+"\n");
		int punti = contr.Vincita(arrInp, arrRand);
		
		if(punti==0 || punti ==1) {
			System.out.println("Non hai vinto niente");
		}
		if(punti== 2) {
			System.out.println("AMBO!!");
		}
		if(punti == 3) {
			System.out.println("TERNA!!");
		}
		if(punti == 4) {
			System.out.println("QUATERNA!!");
		}
		if(punti ==5) {
			System.out.println("BINGO!!!");
		}
	}
}