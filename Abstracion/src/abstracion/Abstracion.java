/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstracion;

/**
 *
 * @author Albert
 */
public class Abstracion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
    personas   per1 = new Diputado("A", "Diego", "Aguero");
    personas   per2 = new Senador("B",  "Alberto", "Ibarra");
    personas[] per3 = new personas[2];
    per3[0]= per1;
    per3[1]= per2;
        for (personas var : per3) {
          if (var instanceof Diputado) {
              System.out.println(""+ ((Diputado)var).getCamaraEnQueTrabaja() );       
                  
           }
          if (var instanceof Senador) {
              System.out.println(""+ ((Senador)var).getCamaraEnQueTrabaja() );       
                  
           }          
    }
    
}
}