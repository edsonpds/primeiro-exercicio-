public class MinhaClasse {
    public static void main (String [] args) {
        String primeiroNome = "Edson";
        String segundoNome = "Peres"; 

        String nomeCompleto = nomeCompleto (primeiroNome,segundoNome);
        System.out.println(nomeCompleto);
  
    }
        
    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "resultado " + primeiroNome.concat(" ").concat(segundoNome);

    }
       
    
}
