/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgclass.exo.tab3_1;
import java.util.Scanner;
/**
 *
 * @author katongo
 */
public class ClassExoTab3_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //question 1
        int[][] ventes = new int[4][5];
        Scanner sc=new Scanner(System.in);
        for (int i=0; i<4; i++){
            for(int j=0; j<5; j++){
                System.out.println("Entrez_les_ventes_du_modèle_numero_");
                sc.nextInt(i);
                System.out.println("_par_le_vendeur_numero_");
               sc.nextInt(j);
                System.out.println(":_");
                ventes[i][j]=sc.nextInt();
            }
        }
        //question2
        for(int i=0; i<4; i++){
            int total =0;
            for(int j=0; j<5; j++){
                total=total+ventes[i][j];
            }
            System.out.println("Ventes_du_modèle_"+i+":_");
            System.out.println(total);
        }
        //question 3
        int[] prix={10000,20000,30000,40000};
        for(int ligne=0; ligne<5; ligne++){
            int total=0;
            for(int col=0; col<4; col++){
                total=total+(ventes[col][ligne]*prix[col]);
            }
            System.out.println("Ventes_du_vendeur_"+ligne+":_");
            System.out.println(total+"_euros");
        }
        
    }
    
}
