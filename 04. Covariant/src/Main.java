// cara mengatasi Invariant dari child ke parent
// covariant = read only,(tidak bisa mengubah data generic

public class Main {
    public static void main(String[] args) {
        dataku<Integer> integerdataku = new dataku<>(133);
        process(integerdataku);

        dataku<? extends Object> dataku = integerdataku; //bisa (sama saja)
    }

    public static void process(dataku<? extends Object> Dataku){ // <? extends Object> = covariant
        System.out.println(Dataku.getData());

//        Dataku.setData(2); ERROR
    }
}
