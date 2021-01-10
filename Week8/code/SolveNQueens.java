package week8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SolveNQueens {
    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for (char[] i : board){
            Arrays.fill(i,'.');
        }
        List<List<String>> res = new ArrayList<List<String>>();
        backtrack(board, res, 0);
        return res;
    }

    public void backtrack(char[][] board, List<List<String>> res, int n){
        if(n == board[0].length){
            res.add(chatToString(board));
            return;
        }
        for(int i=0;i<board[n].length;i++){
            if(!isValidate(board, n, i)){
                continue;
            }
            board[n][i] = 'Q';
            backtrack(board, res, n+1);
            board[n][i] = '.';
        }
    }

    public boolean isValidate(char[][] board, int n, int j){
        for(int i=0;i<n;i++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        for(int i=n-1,k=j-1;i>=0&&k>=0;i--,k--){
            if(board[i][k]=='Q'){
                return false;
            }
        }
        for(int i=n-1,k=j+1;i>=0&&k<board[i].length;i--,k++){
            if(board[i][k]=='Q'){
                return false;
            }
        }
        return true;
    }

    public List<String> chatToString(char[][] board){
        List<String> result = new ArrayList<String>();
        for(int i=0;i<board[0].length;i++){
            result.add(String.valueOf(board[i]));
        }
        return result;
    }
}
