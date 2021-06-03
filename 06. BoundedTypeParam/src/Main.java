// cara membatasi data yg boleh digunakan di generic param type

class NumberData<T extends Number>{ //hanya memperbolehkan class number dan turunanny
    private T data;
    public NumberData(T data){
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
//        NumberData<String> STring = new NumberData<>("Rafi") Tidak boleh (ERROR)
        NumberData<Integer> IntegerNumber = new NumberData<>(100);
        System.out.println(IntegerNumber.getData());
    }
}
