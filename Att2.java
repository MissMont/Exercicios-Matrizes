import java.util.HashSet;

public class Att2 {
    
    public static void main (String[] args){

        int[][] numeros = { {1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}};
        int impar = 0;
        int par = 0;
        HashSet<Integer> scanNum = new HashSet<>();
        boolean numRepetidos = false;

            System.out.println("Matriz: ");
            for(int i=0; i<3; i++){
                for(int y=0; y<5; y++){
                    System.out.print("[" + numeros[i][y] + "] ");        
                }
                System.out.println();
            }

            System.out.println("Numeros impares: ");
            for (int i = 0; i < numeros.length; i++) {
                for (int y = 0; y < numeros[i].length; y++) {
                    if (numeros[i][y] % 2 != 0) {
                        impar++;
                    }
                }   
            }
            System.out.println(impar +" ");

            System.out.println("Numeros pares: ");
            for (int i = 0; i < numeros.length; i++) {
                for (int y = 0; y < numeros[i].length; y++) {
                    if (numeros[i][y] % 2 == 0) {
                        par++;
                    }
                }   
            }
            System.out.println(par +" ");

            for (int i=0; i < numeros.length; i++){
                for (int y=0; y < numeros[i].length; y++){
                    int numMatriz = numeros[i][y];
                    if(scanNum.contains(numMatriz)){
                        numRepetidos = true;
                    }else {
                        scanNum.add(numMatriz);
                    }
                }       

            }

            if (numRepetidos){
                System.out.println("A matriz possui numeros repetidos!");
            } else {
                System.out.println("A matriz nao possui numeros repetidos!");
            }

    }
}
