public class SortingHat{

  public static java.util.Scanner console = new java.util.Scanner(System.in); //inserire stringa da tastiera

    public static String ask(String prompt){
    
      System.out.print(prompt +":");
      String answer = console.nextLine(); //legge e restituice ciò che gli scrivi
      return answer;
    }
   public static int askNumber(String prompt){
    
      System.out.print(prompt +":");
      String answer = console.nextLine(); //legge e restituice ciò che gli scrivi
      int n = Integer.parseInt(answer);
      return n;
    }

  public static int hashName(String name){
    String noSpace = name.replace(" ","").toLowerCase();
     int hash = 0;
     for(int i = 0; i < noSpace.length(); i++) {
       hash = hash + noSpace.codePointAt(i)* (int)Math.pow(7,i);
       return hash;
     }
     
  

     System.out.println(noSpace);
     return 0;
  }


  public static void main(String[] args){
    
    System.out.print("Numero Studenti :");
   
     String answer = console.nextLine();
     int numStud = Integer.parseInt(answer);
     
     
    
    
    for( int i = 0; i < numStud ; i++) {
     System.out.print("Numero Studenti :");
     String nome = console.nextLine();
     System.out.println(hashName(nome));
      
       //String s = ask("Nome Studente "); //nome studente
      //System.out.println(s);
      //hashName(s);
      
    }
  
  } //main

} //classe