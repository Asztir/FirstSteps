package Petle;

public class ThreeNumbers {
    public static int numbers(int aNumber, int bNumber, int cNumber){
    if (aNumber >= bNumber && aNumber >= cNumber) {
        return aNumber;
    } else if (bNumber >= aNumber && bNumber >= cNumber) {
        return bNumber;
    } else if (cNumber >= aNumber && cNumber >= bNumber) {
        return cNumber;
    } else if (aNumber == bNumber && aNumber == cNumber) {
        return aNumber;
    }
        return aNumber;
}
}
