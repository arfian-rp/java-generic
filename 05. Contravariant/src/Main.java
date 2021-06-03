// cara mengatasi invariant dari parent ke child (kebalikan covariant)
// contravariant bisa write & read, namun berhati2 ketika melakukan read
// terutama jika sampai parent nya punya banyak child
class A<T>{
    private T data;
    public A(T data){
        this.data=data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

public class Main {
    public static void main(String[] args) {
        A<Object> objectA = new A<>("Arfian");
        A<? super String> dataString = objectA; //contravariant <? super String>
        System.out.println(dataString.getData());
        process(objectA);
    }
    public static void process(A<? super String> a){
        a.setData("rafi"); //tidak error
        System.out.println(a.getData());
    }
}
