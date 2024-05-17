package Pertemuan_7.mergeSort;

public class Main {

    public static void main(String[] args) {
        int data[] ={10,40,30,50,70,20,100,90};
        System.out.println("Sorting dengan merge sort");
        MergeSortTest mSort = new MergeSortTest();
        System.out.println("data awal");
        mSort.printArray(data);
        mSort.mergeSort(data);
        System.out.println("setelah diurutkan");
        mSort.printArray(data);
    }
}