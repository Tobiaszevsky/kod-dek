import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class gra {
	static ArrayList<Integer> gracza=new ArrayList<Integer>();
	static ArrayList<Integer> komputera=new ArrayList<Integer>();
	public static void main(String[] args) {
		char[] [] pola= {{' ','|',' ','|',' '},
				{'-','+','-','+','-'},
				{' ','|',' ','|',' '},
				{'-','+','-','+','-'},
				{' ','|',' ','|',' '},};
		wypiszpola(pola);
		int i=0;
		while(i<1){
		Scanner scan=new Scanner(System.in);
		Random rand=new Random();
		System.out.println("Podaj numer pola 1-9");
		int liczba1=scan.nextInt();
		while(gracza.contains(liczba1) || komputera.contains(liczba1)) {
			System.out.println("Pozycja zajeta podaj jeszcze raz");
			liczba1=scan.nextInt();
		}
		wstawianie(pola, liczba1, "Gracz");
		System.out.println();
		wypiszpola(pola);
		int liczba2=rand.nextInt(9)+1;
		while(gracza.contains(liczba2) || komputera.contains(liczba2)) {
			liczba2=rand.nextInt(9)+1;
			}
		wstawianie(pola, liczba2, "Komputer");
		System.out.println();
		wypiszpola(pola);
		String wynik=czywygrales();
		System.out.println(wynik);
		if(wynik.length()>0) {
			i=1;
		}
		}
	}
		
	

public static void wypiszpola(char[][] pola) {		
	for(char[] row : pola) {
		for(char c : row) {
		System.out.print(c);
		}
		System.out.println();
}
}
public static void wstawianie(char[][] pola,int liczba1, String gracz) {
	
	char symbol =' ';
	if(gracz.equals("Gracz")) {
		symbol='X';
		gracza.add(liczba1);
	}
	else if(gracz.equals("Komputer")) {
		symbol='O';
		komputera.add(liczba1);
	}
	if(gracz.equals("Gracz")) {
		switch(liczba1) {
		case 1:
			pola[0][0]=symbol;
			break;
		case 2:
			pola[0][2]=symbol;
			break;
		case 3:
			pola[0][4]=symbol;
			break;
		case 4:
			pola[2][0]=symbol;
			break;
		case 5:
			pola[2][2]=symbol;
			break;
		case 6:
			pola[2][4]=symbol;
			break;
		case 7:
			pola[4][0]=symbol;
			break;
		case 8:
			pola[4][2]=symbol;
			break;
		case 9:
			pola[4][4]=symbol;
			break;	
		default:
			System.out.println("Podaj poprawn¹ liczbe");
			break;
	}
	}
	else if(gracz.equals("Komputer")){
		switch(liczba1) {
		case 1:
			pola[0][0]=symbol;
			break;
		case 2:
			pola[0][2]=symbol;
			break;
		case 3:
			pola[0][4]=symbol;
			break;
		case 4:
			pola[2][0]=symbol;
			break;
		case 5:
			pola[2][2]=symbol;
			break;
		case 6:
			pola[2][4]=symbol;
			break;
		case 7:
			pola[4][0]=symbol;
			break;
		case 8:
			pola[4][2]=symbol;
			break;
		case 9:
			pola[4][4]=symbol;
			break;
	}
		
	}
	
}
public static String czywygrales() {
	List toplin=Arrays.asList(1, 2 , 3);
	List midlin=Arrays.asList(4, 5 , 6);
	List botlin=Arrays.asList(7, 8 , 9);
	List topcol=Arrays.asList(1, 4 , 7);
	List midcol=Arrays.asList(2, 5 , 8);
	List botcol=Arrays.asList(3, 6 , 9);
	List krzyz1=Arrays.asList(1, 5 , 9);
	List krzyz2=Arrays.asList(7, 5 , 3);
	List<List>wygrana=new ArrayList<List>();
	wygrana.add(toplin);
	wygrana.add(midlin);
	wygrana.add(botlin);
	wygrana.add(topcol);
	wygrana.add(midcol);
	wygrana.add(botcol);
	wygrana.add(krzyz1);
	wygrana.add(krzyz2);
	for(List l : wygrana) {
		if(gracza.containsAll(l)) {
			return "Gratulacje pokona³eœ bota :p";
		}	
		else if(komputera.containsAll(l)) {
			return "Bot cie pokona³ XD";
		}
		else if(gracza.size() +komputera.size() == 9) {
			return "Czeski remis";
		}
	}
	
	return "";
}
}


