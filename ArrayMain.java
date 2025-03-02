public class ArrayMain {

    public static void main(String[] args) {
        int[] ints = new int[5];
        ints[0] = 12;
        ints[1] = 12;
        ints[2] = 12;
        ints[3] = 12;

        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }

        int x;
        String s;

        double[] doubles;
//        System.out.println(doubles[0]);

        System.out.println("maxValue:" + maxValue(3, 7));

        int[] array=new int[3];
        array[0]=72;
        array[1]=24;
        array[2]=32;
        System.out.println("maxValue:" + maxValue(array));
        System.out.println("maxValue:" + maxValue(new int[]{1,2}));


        int[] array2=new int[0];
        System.out.println("maxValue:" + maxValue(array2));

    }

    static int maxValue(int x, int y) {
//        if (x>y)
//            return x;
//        else
//            return y;

//        if (x>y)
//            return x;
//        return y;

        return x > y ? x : y;

    }

    static int maxValue(int[] intArray) {
        int max = intArray[0];
        for (int i = 1; i < intArray.length; i++) {
            if (max < intArray[i])
                max = intArray[i];
        }
        return max;
    }
}
