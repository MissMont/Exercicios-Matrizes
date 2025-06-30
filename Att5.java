public class Att5 {

    public static void main(String[] args){

        int[][] matriz = { {1, 1, 1}, {1, 2, 1}, {2, 1, 1}};
        int somaPrincipal = 0;
        int somaSecundaria = 0;

        System.out.println("Matriz: ");
        for (int i = 0; i < 3; i++) {             
            for (int y = 0; y < 3; y++) {         
                  System.out.print("[" + matriz[i][y] + "] ");
            }
            System.out.println();             
        }

        for (int i = 0; i < 3; i++) {             
            for (int y = 0; y < 3; y++) {         
              if(y+i==2){
                somaSecundaria += matriz[i][y];
              }
            }
        }
        for (int i = 0; i < 3; i++) {             
            for (int y = 0; y < 3; y++) {         
              if(y==i){
                somaPrincipal += matriz[i][i];
              }
            }
        }

        System.out.print("Soma da coluna Principal: ");
        System.out.println(somaPrincipal);
        System.out.print("Soma da coluna Secundaria: ");
        System.out.println(somaSecundaria);

        if(somaPrincipal == somaSecundaria){
            System.out.println("E um quadrado magico");
        } else {
            System.out.println("Nao e um quadrado magico");
        }

    }
}