public class Main {
    public static void main(String[] args) {
        Mydata<String> myDataString = new Mydata<String>("Arfian");
        Mydata<Integer> myDataInteger = new Mydata<Integer>(100);

        String StringVal = myDataString.getData();
        Integer IntegerVal = myDataInteger.getData();

        System.out.println(StringVal.getClass());
        System.out.println(IntegerVal.getClass());


        pair<String, Integer> Dataku = new pair<String, Integer>("Arfian", 14);
        String nama = Dataku.getFirst();
        Integer usia = Dataku.getSecond();
        System.out.println(nama);
        System.out.println(usia);
    }
}
