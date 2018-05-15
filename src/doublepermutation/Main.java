package doublepermutation;

public class Main {

    public static void main(String[] args) {
        char [] textArray = RealisationOfCypher.getText();
        int textCount = textArray.length;
        char [][] cypherMatrix = RealisationOfCypher.initMatrix(textCount, textArray);
       // RealisationOfCypher.showMatrix(cypherMatrix);
        RealisationOfCypher.SortRowsByKey(cypherMatrix);
        RealisationOfCypher.SortColumnsByKey(cypherMatrix);
        RealisationOfCypher.CypherTextResult(cypherMatrix);
    }
}