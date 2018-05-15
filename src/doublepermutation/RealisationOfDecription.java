
package doublepermutation;

import java.util.Scanner;
import java.lang.Math;

public class RealisationOfDecription {
    
    //ввод пользователем зашифрованного текста и его запись в массив
    public static char[] getCypherText(){
        Scanner sc = new Scanner(System.in);
        System.out.println("¬ведите шифртекст без пробелов");
        String cypherText = sc.next();
        char[] textArray = cypherText.toCharArray();
        for(int i = 0; i < textArray.length; i++) {
         System.out.println(textArray[i] + " ");
        } 
    return textArray;
    }
    
    public static char[] getKeyForRows(){
        Scanner sc = new Scanner(System.in);
        System.out.println("¬ведите ключ дл€ строк");
        String keyForRows = sc.next();
        char[] keyForRowsArray = keyForRows.toCharArray();
        for(int i = 0; i<keyForRowsArray.length; i++){
            System.out.println(keyForRowsArray[i] + " ");
        }
    return keyForRowsArray;
    }
    
    public static char[] getKeyForColumns(){
        Scanner sc = new Scanner(System.in);
        System.out.println("¬ведите ключ дл€ столбцов");
        String keyForColumns = sc.next();
        char [] keyForColumnsArray = keyForColumns.toCharArray();
        for (int i = 0; i<keyForColumnsArray.length; i++){
            System.out.println(keyForColumnsArray[i] + " ");
        }
    return keyForColumnsArray;
    }
    
    public static char[][] initMatrix(char[] keyForRowsArray, char[] keyForColumnsArray, char[] textArray){
        int dimension = (int) Math.sqrt(textArray.length)+1;
        char [][] cypherMatrix = new char [dimension] [dimension];
        for (int i =0; i<cypherMatrix.length; i++){
            for (int j = 0; j<cypherMatrix.length; j++){
                
            }
        }
    }
    
    
    
}
        