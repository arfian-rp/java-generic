public class Main {
    public static void main(String[] args) {
        String[] nama = {"Arfian", "Rafi", "Pradana"};
        Integer[] numbers = {1,2,3,4,5};

        ArrayHelper arrayku = new ArrayHelper();

        System.out.println(arrayku.<String>count(nama));
        System.out.println(arrayku.count(numbers));
    }
}
