package bankomat;
import java.util.Scanner;
public class bankomat {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int saldo=500;
        String haslo="zadanie";
        String login="bank";
        int pin=4321;
        if(logowanie(login, haslo)==1) {
        int m=0;
        while(m<1) {
        System.out.println("Co chcesz zrobi�? 1)Wp�aci� pi�ni�dze 2)Wyp�aci� pieni�dze 3)Zako�cz");
        int c=scanner.nextInt();
        switch(c) {
        	case 1:
        		wplac(saldo, pin);
        		break;
        	case 2:
        		wyplac(saldo, pin);
        		break;
        	case 3:
        		m=m+1;
        		break;
        	default:
        		System.out.println("Podaj poprawn� liczbe");
        }
        }
        }
    }
    public static int logowanie(String login, String haslo){
    	Scanner scanner = new Scanner(System.in);
        String a;
        String b;
        System.out.println("Podaj login: ");
		a = scanner.nextLine();
        System.out.println("Podaj has�o: ");
        b = scanner.nextLine();
        if(a.equals(login) && b.equals(haslo)){
            System.out.println("Zosta�e� poprawnie zalogowany");
            return 1;
        }
        else{
            System.out.println("Niepoprawny login lub haslo");
            return 0;
        } 
	}
    public static void wplac(int saldo, int pin) {
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("Podaj kwote wp�aty");
    	int a=scanner.nextInt();
    	int d=0;
    	while(d<1) {
    	System.out.println("Podaj pin karty");
    	int b=scanner.nextInt();
    	if(b==pin) {
    		saldo = saldo+a;
    		System.out.println("Wp�acono. Twoje saldo wynosi teraz: "+saldo);
    		d=d+1;
    	}
    	else {
    		System.out.println("Niepoprawny pin spr�buj ponownie");
    	}
    	}
    	
    }
    public static void wyplac(int saldo, int pin) {
    	Scanner scanner = new Scanner(System.in);
    	int d=0;
    	while(d<1) {
    	System.out.println("Podaj kwote wyp�aty");
    	int a=scanner.nextInt();
    	System.out.println("Podaj pin karty");
    	int b=scanner.nextInt();
    	if(b==pin && a<=saldo) {
    		saldo = saldo-a;
    		System.out.println("Wp�acono. Twoje saldo wynosi teraz: "+saldo);
    		d=d+1;
    	}
    	else {
    		System.out.println("Niepoprawny pin lub brak �rodk�w na koncie spr�buj ponownie");
    	}
    	}

    	
    }
    }

