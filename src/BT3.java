public class BT3 {
    public static void main(String[] args) {
        String[] arrNumber = {"e", "f", "g", "h", "i"};
        String[] arrString = {"a", "b", "c", "d"};
        String[] arrAll;
        arrAll = new String[arrString.length + arrNumber.length];
        int i = 0;
        for (; i < arrString.length; i++){
            arrAll[i] = arrString[i];
        }
        for (int j = 0; j < arrNumber.length; j++, i++) {
            arrAll[i] = arrNumber[j];
        }
        for (String el:arrAll) {
            System.out.println("arrAll " + el);
        }
    }
}