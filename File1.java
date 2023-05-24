import java.util.Scanner;
public class File1 {

    public static void main(String[] args) {
      int scelta = 0;
      System.out.println("Inserisci il numero del mese");
      Scanner in = new Scanner(System.in);
      scelta = in.nextInt();
      
      File1 f1 = new File1();
      
      switch (scelta){
        case 1: f1.printGennaio(in); 
                break;
        case 2: f1.printGennaio(in); 
                break;
        case 3: f1.printGennaio(in); 
                break;
        case 4: f1.printGennaio(in); 
                break;
        case 5: f1.printGennaio(in); 
                break;
        case 6: f1.printGennaio(in); 
                break;
        case 7: f1.printGennaio(in); 
                break;
        case 8: f1.printGennaio(in); 
                break;
        case 9: f1.printSettembre(in); 
                break;
        case 10: f1.printGennaio(in); 
                break;
        case 11: f1.printGennaio(in); 
                break;
        case 12: f1.printGennaio(in); 
                break;
        default: f1.stampaMessaggio("Funzionalità non prevista!");
      }
    }
    
    void stampaMessaggio(String m){
      System.out.println(m);
    }

    void printGennaio(Scanner in){
      //Inserire il codice qui
    }
    
    void printFebbraio(Scanner in){
      //Inserire il codice qui
    }
    
    void printMarzo(Scanner in){
      //Inserire il codice qui
    }
    
    void printAprile(Scanner in){
      //Inserire il codice qui
    }
    
    void printMaggio(Scanner in){
      //Inserire il codice qui
    }
    
    void printGiugno(Scanner in){
      //Inserire il codice qui
    }

    void printLuglio(Scanner in){
      //Inserire il codice qui
    }

    void printAgosto(Scanner in){
      //Inserire il codice qui
    }

    void printSettembre(Scanner in){
      //Inserire il codice qui
    }

    void printOttobre(Scanner in){
      //Inserire il codice qui
    }

    void printNovembre(Scanner in){
      //Inserire il codice qui
    }
    
    void printDicembre(Scanner in){
      //Inserire il codice qui
    }

}