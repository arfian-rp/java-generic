//secara default, saat ini kita membuat generic param type,
//sifat nya invariant
//invariant = tidak boleh di subtitusi dengan subtype(child) atau supertype(parent)
//artinya saat kita membuat objek Contoh<Object>, maka tidak sama dengan Contoh<String>
//polymorfisme != generic


public class Main {
    public static void main(String[] args) {
        myData<Integer> myinteger = new myData<>(122);
//        myData<Object> myobject = myinteger; error, begitupun sebaliknya
        System.out.println(myinteger.getData());
    }
}
