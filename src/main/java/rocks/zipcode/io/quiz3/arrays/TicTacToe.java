package rocks.zipcode.io.quiz3.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {

    String[][] board;

    public TicTacToe(String[][] board) {
        this.board=board;
    }

    public TicTacToe() {
    }

    public String[] getRow(Integer value) {
        return board[value];
    }

    public String[] getColumn(Integer value) {
        String[] column = new String[3];
//        column[0] = board[0][value];
//        column[1] = board[1][value];
//        column[2] = board[2][value];

        for (int i = 0; i < 3; i++) {
            column[i] = board[i][value];
        }

        return column;
    }

    public Boolean isRowHomogenous(Integer rowIndex) {
        String[] stringToCheck = getRow(rowIndex);
        return checkHomogeneity(stringToCheck);
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {
        String[] stringToCheck = getColumn(columnIndex);
        return checkHomogeneity(stringToCheck);
    }

    private Boolean checkHomogeneity(String[] stringToCheck) {
        String mark = stringToCheck[0];
        for (int i = 1; i < 3; i++) {
            if(!mark.equals(stringToCheck[i])){
                return false;
            }

        }

        return true;
    }

    public String[] getDiagnal1(){
        return new String[]{board[0][0], board[1][1],board[2][2]};
    }

    public String[] getDiagnal2(){
        return new String[]{board[0][2],board[1][1],board[2][0]};
    }



    public String getWinner() {

        for (int i = 0; i < 3; i++) {
            if(isRowHomogenous(i)){
                return board[i][0];
            }
        }

        for (int i = 0; i < 3; i++) {
            if(isColumnHomogeneous(i)){
                return board[0][i];
            }
        }

        if(checkHomogeneity(getDiagnal1()) || checkHomogeneity(getDiagnal2())){
            return board[1][1];
        }

        return "No Winner";
    }

    public String[][] getBoard() {
        return board;
    }
}
