package week4;

/**
 * 860. 柠檬水找零
 */
public class LemonadeChange {
    public boolean lemonadeChange(int[] bills) {
        if (bills == null || bills.length == 0){
            return false;
        }
        int five = 0;
        int ten = 0;
        for (int i = 0; i < bills.length; i++) {
            if(bills[i] == 5){
                five++;
            }
            if(bills[i] == 10){
                if(--five < 0){
                    return false;
                }
                ten++;
            }
            if (bills[i] == 20){
                if (five > 0 && ten > 0){
                    five--;
                    ten--;
                    continue;
                }
                if (five - 3 >= 0){
                    five = five -3;
                    continue;
                }
                return false;
            }
        }
        return true;
    }
}
