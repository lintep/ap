public class Main07_20 {

    public static void main(String[] args) {
        ijadVaMorattabSaziVaChapeArraye();
    }

    static void ijadVaMorattabSaziVaChapeArraye() {

//        double[] array = new double[5];
//        double[] array = {78.654, 2.3, 43, 9, 4.3, 0.8, 98, 2.3};
        double[] array = ijadeArraye();
        printeAraye(array);

        sortArray(array);
//        for (int i = 0; i < array.length; i++) {
//            String msg = array[i] + " ";
//            System.out.print(msg);
//        }
        printeAraye(array);
    }

    static double[] ijadeArraye(){
        //کارکرد: ایجاد آرایه
        //خروجی: آرایه اعداد اعشاری
        //ورودی: ندارد
        int length = 1+ (int) (Math.random() * 100);

        double[] array = new double[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random()*100;
            array[i] = Math.round(array[i]*100)/100.0;
        }
        return array;
    }

    static void printeAraye(double[] inputArray){
        System.out.println("lenght: "+inputArray.length);
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(" "+inputArray[i]);
        }
        System.out.println();
    }

    static void sortArray(double[] inputArray){
        for (int i = 0; i < inputArray.length; i++) {
//            double min = array[i];
            int minIndex=i;
            for (int j = i+1; j < inputArray.length; j++) {
                if (inputArray[j]<inputArray[minIndex]){
//                    min=array[j];
                    minIndex=j;
                }
            }
            double temp = inputArray[i];
//            array[i]=min;
            inputArray[i]=inputArray[minIndex];
            inputArray[minIndex]=temp;
        }
//        return inputArray;
    }


    static int[] sortArray(int[] inputArray){
        for (int i = 0; i < inputArray.length; i++) {
//            double min = array[i];
            int minIndex=i;
            for (int j = i+1; j < inputArray.length; j++) {
                if (inputArray[j]<inputArray[minIndex]){
//                    min=array[j];
                    minIndex=j;
                }
            }
            int temp = inputArray[i];
//            array[i]=min;
            inputArray[i]=inputArray[minIndex];
            inputArray[minIndex]=temp;
        }
        return inputArray;
    }

    static double[] sortArray(){
        double[] inputArray = ijadeArraye();
        for (int i = 0; i < inputArray.length; i++) {
//            double min = array[i];
            int minIndex=i;
            for (int j = i+1; j < inputArray.length; j++) {
                if (inputArray[j]<inputArray[minIndex]){
//                    min=array[j];
                    minIndex=j;
                }
            }
            double temp = inputArray[i];
//            array[i]=min;
            inputArray[i]=inputArray[minIndex];
            inputArray[minIndex]=temp;
        }
        return inputArray;
    }

}
