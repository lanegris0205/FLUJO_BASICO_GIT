public class condicionalif {
// if anidado se puede colocar in if dentro de otro if
    public static void main(String[] args) {
        
        String pais ="ecuador";
        int edad=16;
        if (pais=="colombia" && edad>=18){
            System.out.println( " Eres Colombiano mayor edad, puedes votar");
        }
        if (pais=="colombia" && edad<18){
            System.out.println( " Eres Colombiano menor edad; no puedes votar");
        }
        else if(pais!="colombia"){
            System.out.println(" No eres Colombiano,no puedes votar");
        }
    }
    
}
