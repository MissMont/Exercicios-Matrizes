public class Att4 {
    
    public static void main(String[] args){

        int[][] quadrado = { {1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}};
        int[][] quadradoVazio = { {1, 1, 1, 1}, {1, 0, 0, 1}, {1, 0, 0, 1}, {1, 1, 1, 1}};
        int[][] escaleno = { {1, 0, 0, 0}, {1, 1, 0, 0}, {1, 1, 1, 0}, {1, 1, 1, 1}};

            System.out.println("Quadrado Preenchido\n");            
            for(int i=0; i<quadrado[0].length; i++){
                for(int y=0; y<quadrado.length; y++){
                    if(quadrado[i][y]==1){
                    System.out.print(" * "); 
                    }
                }
                System.out.println();
            }
            System.out.println("\n");  
            System.out.println("Quadrado Vazio\n");  
            for(int i=0; i<quadradoVazio[0].length; i++){
                for(int y=0; y<quadradoVazio.length; y++){
                    if(quadradoVazio[i][y]==1){
                    System.out.print(" * "); 
                    }
                    if(quadradoVazio[i][y]==0){
                    System.out.print("   "); 
                    }
                }
                System.out.println();
            }
            System.out.println("\n");  
            System.out.println("Escaleno\n");  
            for(int i=0; i<escaleno[0].length; i++){
                for(int y=0; y<escaleno.length; y++){
                    if(escaleno[i][y]==1){
                    System.out.print(" * "); 
                    }
                    if(escaleno[i][y]==0){
                    System.out.print("    "); 
                    }
                }
                System.out.println();
            }  
    }       
}