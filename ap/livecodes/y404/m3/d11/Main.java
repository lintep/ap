package ap.livecodes.y404.m3.d11;

import com.google.gson.Gson;

public class Main {

    public static void main(String[] args) {

        Gson gson = new Gson();
        InnerClass obj1 = new InnerClass(1, 2);
        String json = gson.toJson(obj1);
        System.out.println(json);
        InnerClass obj2 = gson.fromJson(json, InnerClass.class);
        obj2.setX(111);
        System.out.println("obj1:"+obj1);
        System.out.println("obj2:"+obj2);

    }

    public static class InnerClass{
        private int x;
        private int y;

        public InnerClass(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public void setX(int x) {
            this.x = x;
        }

        @Override
        public String toString() {
            return "x="+x+ ", y="+y;
        }
    }
}
