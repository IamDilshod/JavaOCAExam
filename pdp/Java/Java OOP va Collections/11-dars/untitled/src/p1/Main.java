package p1;

public class Main {
    public static void main(String[] args) {
//        Main main=new Main();
//        main.show(3.3f);
//        main.show("Salom");
//        main.show(3);
//        main.show("sa"+9);
//        main.show(9+"pp");
//
//        System.out.println("-----------------------");
//        Integer arr1[]={1,3,67,34,90,2};
//        String arr2[] ={"one", "two", "three", "four"};
//
//        main.printArr(arr1);
//        main.printArr(arr2);


    }

    public<T> void show(T t){
        System.out.println(t);
    }

    public <E> void printArr(E[] arr){
        for(E val : arr){
            System.out.print(val +"\t");
        }
        System.out.println();
    }

}
