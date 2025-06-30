public class Att1 {
    
    public static void main (String[] args){

        int[][] numeros = { {1, 7, 9, 4, 6}, {5, 6, 7, 4, 3}, {1, 2, 3, 1, 5}, {5, 4, 1, 2, 1}, {1, 9, 7, 4, 8} };
        int somaImpares = 0;
        int[] somaLinhas = new int[5];
        int[] somaColunas = new int[5];

        System.out.println("Matriz: ");
        for(int i=0; i<5; i++){
            for(int y=0; y<5; y++){
                System.out.print("[" + numeros[i][y] + "] ");        
            }
            System.out.println();
        }

        for (int i = 0; i < numeros.length; i++) {
            for (int y = 0; y < numeros[i].length; y++) {
                somaLinhas [i] += numeros[i][y];
                somaColunas [y] += numeros[i][y];
                if (numeros[i][y] % 2 != 0) {
                    somaImpares += numeros[i][y];
                }
            }   
        }
        System.out.println();
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Soma da linha " + i + ": " + somaLinhas[i]);
        }
        System.out.println();
        for (int y = 0; y < numeros[0].length; y++) {
            System.out.println("Soma da coluna " + y + ": " + somaColunas[y]);
        }
        System.out.println();       
        System.out.println("Soma dos impares: "+ somaImpares);

    }
}