public class Att2Petri {
    
    public static void main (String[] args){

        int [][] matriz = new int[3][5];

        for(int i=0; i<3; i++){
            for(int j=0; j<5; j++){
                matriz[i][j] = (int)(Math.random() * 101);
            }           
        }

        //Matriz
        for(int i=0; i<3; i++){
            for(int j=0; j<5; j++){
                System.out.print(" ["+matriz[i][j]+"] ");
            }
            System.out.println("");
        }

        boolean existeRepetido=false;
        //1 Matriz
        for(int i=0; i<3; i++){
            for(int j=0; j<5; j++){
                //2 Matriz
                for(int x=0; x<3; x++){
                    for(int y=0; y<5; y++){
                        if(i == x && j == y)
                        continue;

                        if (matriz[i][j] == matriz[x][y]){
                            existeRepetido = true;
                        }
                    }
                }
            }
        }
    }

}