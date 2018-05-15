package doublepermutation;

import java.util.Scanner;
import java.lang.Math;

public class RealisationOfCypher {
    
    // ввод пользователем шифруемого текста, преобразование его в в массив
    public static char[] getText(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите фразу для шифрования БЕЗ пробелов");
        String cypherText = sc.next();
        char[] textArray = cypherText.toCharArray();
        for(int i = 0; i < textArray.length; i++) {
         System.out.println(textArray[i] + " ");
        } 
    return textArray;
    }
    
    // заполнение матрицы пользователем с клавиатуры
    public static char[][] initMatrix(int textCount, char [] textArray){
        double t = Math.sqrt(textCount);
        int x = (int) t;
        if (t%x != 0){
            t = t+2;
            int dimension = (int) t;
            char [][] cypherMatrix = new char [dimension][dimension];
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите ключ для столбцов из " + (dimension-1) + " эдементов");
                for (int j=1; j<cypherMatrix.length; j++){
                    cypherMatrix [0][j] = sc.next().charAt(0);
                }
            System.out.println("Введите ключ для строк из " + (dimension-1) + " эдементов");
                for (int i=1; i<cypherMatrix.length; i++){
                    cypherMatrix [i][0] = sc.next().charAt(0);
                }
                
                char [] newTextArray = new char [(dimension*dimension)-((dimension*2)-1)];
                
                for (int a = 0; a<textArray.length; a++){
                    newTextArray[a] = textArray[a];
                }
                for (int a = textArray.length; a<newTextArray.length; a++){
                    newTextArray[a] = 'x';
                }
            int temp = 0;
                for (int i=1; i<cypherMatrix.length; i++){
                    for (int j=1; j<cypherMatrix.length; j++){
                        cypherMatrix[i][j] = newTextArray[temp];
                        temp++;
                    }
                }
                return cypherMatrix;
            }
        else{
        int dimension = (int) t;
        char [][] cypherMatrix = new char [dimension+1][dimension+1];
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите ключ для столбцов из " + dimension + " эдементов");
            for (int j=1; j<cypherMatrix.length; j++){
                cypherMatrix [0][j] = sc.next().charAt(0);
            }
        System.out.println("Введите ключ для строк из " + dimension + " эдементов");
            for (int i=1; i<cypherMatrix.length; i++){
                cypherMatrix [i][0] = sc.next().charAt(0);
            }
        
            int temp = 0;
            for (int i=1; i<cypherMatrix.length; i++){
                for (int j=1; j<cypherMatrix.length; j++){
                    cypherMatrix[i][j] = textArray[temp];
                    temp++;
            }
        }
    return cypherMatrix;
    }
    }
    
    //вывод матрицы на экран
    public static void showMatrix(char [][] cypherMatrix){
        for (int i=0; i<cypherMatrix.length;i++){
            for (int j=0;j<cypherMatrix.length;j++){
                if (j==cypherMatrix.length-1){
                System.out.print(cypherMatrix[i][j] + " ");
                System.out.println();
                }
                else {
                System.out.print(cypherMatrix[i][j] + " ");
                }
            }
        }
    }
    
    //построчная сортировка матрицы по ключу
    public static char [][] SortRowsByKey(char [][] cypherMatrix){
        for (int k=0; k<cypherMatrix.length-1;k++){
            for (int j=0; j<1; j++){
                for (int i=0; i<cypherMatrix.length-1; i++){
                    int code = (int) cypherMatrix[i][j];
                    int code2 = (int) cypherMatrix[i+1][j];
                    if (code > code2){
                        int temp = code;
                        code = code2;
                        code2 = temp;
                        char first = (char) code2;
                        char second = (char) code;
                        cypherMatrix[i][j] = second;
                        cypherMatrix[i+1][j] = first;
                        for (int a=1; a<cypherMatrix.length;a++){
                            char temp2 = cypherMatrix[i][a];
                            cypherMatrix[i][a] = cypherMatrix[i+1][a];
                            cypherMatrix[i+1][a] = temp2;
                        }
                    }
                }
            }
        }
    return cypherMatrix;
    }
    
    // сортировка столбцов по ключу
    public static char [][] SortColumnsByKey(char[][] cypherMatrix){
    for (int k=0; k<cypherMatrix.length-1;k++){
            for (int i=0; i<1; i++){
                for (int j=0; j<cypherMatrix.length-1; j++){
                    int code = (int) cypherMatrix[i][j];
                    int code2 = (int) cypherMatrix[i][j+1];
                    if (code > code2){
                        int temp = code;
                        code = code2;
                        code2 = temp;
                        char first = (char) code2;
                        char second = (char) code;
                        cypherMatrix[i][j] = second;
                        cypherMatrix[i][j+1] = first;
                        for (int a=1; a<cypherMatrix.length; a++){
                            char temp2 = cypherMatrix[a][j];
                            cypherMatrix[a][j] = cypherMatrix[a][j+1];
                            cypherMatrix[a][j+1] = temp2;
                            
                        }
                    }
                }
            }
        }
    return cypherMatrix;
    }
    
     public static char [] CypherTextResult(char [][] cypherMatrix){
    char [] cypherText =new char[cypherMatrix.length*cypherMatrix.length];
    int temp = 0;
    for (int i = 1; i<cypherMatrix.length; i++){
        for (int j = 1; j<cypherMatrix.length; j++){
            cypherText [i*cypherMatrix.length+j] = cypherMatrix[i][j];
            temp++;
            }
        }
        System.out.print("Зашифрованный текст = ");
        for (int i = 6; i<cypherText.length;i++){
           System.out.print(cypherText[i] + " ");
       } 
       return cypherText;
    }
}
