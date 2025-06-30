public class Att3 {
    public static void main (String[] args){     

        int[][] matriz = { {1, 2, 3, 4}, {5, 6, 7, 8}, {9, 9, 8, 7}, {6, 7, 5, 4}};

            System.out.println("Matriz: ");
            for(int i=0; i<matriz[0].length; i++){
                for(int y=0; y<matriz.length; y++){
                    System.out.print("[" + matriz[i][y] + "] ");        
                }
                System.out.println();
            }
        
            System.out.println("Valores da coluna principal: ");
            for(int i=0; i<matriz.length; i++){
                for(int y=0; y<matriz[i].length; y++){
                if(i==y){ 
                    System.out.println("[" + matriz[i][i] + "] ");
                }          
                }
            }
            System.out.println("Valores da coluna secundaria: ");
                for(int i=0; i<matriz.length; i++){
                for(int y=0; y<matriz[i].length; y++){
                    if(i+y==3){ 
                    System.out.println("[" + matriz[i][y] + "]");
                    }
                }
                }
            
            System.out.println("Matriz transposta: ");
            for(int i=0; i<matriz[0].length; i++){
                for(int y=0; y<matriz.length; y++){
                    System.out.print("[" + matriz[y][i] + "] ");        
                }
                System.out.println();
            }
        
    
        }
    }