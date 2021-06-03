// kadang ada kasus kita tidak peduli dengan generic type pada object
//misal kita hanya ingin memprint data T, tidak peduli tipe apapun
//wildcard bisa dibuat dengan mengganti generic param type dengan ?
class B<T>{
    private T data;
    public B(T data){
        this.data=data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
}

public class Main {
    public static void main(String[] args) {
        printJarak(new B<>(100));
        printJarak(new B<>("Arfian"));
        printJarak(new B<>(false));
    }

    public static void printJarak(B<?> data){ //<?> = wildcard
        System.out.println(data.getData());
    }
}