public class Mydata<T> {

    private T data;

    public Mydata(T data){
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data){
        this.data = data;
    }
}

