package ap.livecodes.y404.m2.d23;

public class MyClass <E extends Comparable<E>> { //,T,K
    private E x;

    public E getE(){
        return x;
    }

    public MyClass(E x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "{x:"+this.x+"}";
    }
}
