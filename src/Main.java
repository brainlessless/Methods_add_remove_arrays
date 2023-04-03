import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class MyArray {
    int[] arr;
    int index;
    int size;

    {
        this.size = 3;
        this.index = 0;
        arr = new int[this.size];
    }

// add
    public void add (int value) {
    regeneration();
        arr[index++] = value;
    }

    public int length() {
        return this.index;
    }
    public void remove (int index) {
        if (index < this.index && index >= 0) {
            int[] newArr = new int[this.size];
            for (int i = 0, t = 0; i < this.index; i++) {
                if (i < index) {
                    newArr[i] = this.arr[i];
                }
                else if (i>index){
                    newArr[i-1] = this.arr[i];
                }
            }
            this.index--;
            this.arr = newArr;
        }
    }

    void add(int index, int element) {
        regeneration();

        int[] newArr = new int[this.size];

        for (int i = 0, j = 0; i < this.index; j++) {
            if (j == index) {
                newArr[j] = element;
            }
            else {
                newArr[j] = this.arr[i];
                i++;
            }

        }
            this.index++;
            this.arr = newArr;
    }

    public void regeneration() {
        if (index==size) {
            this.size = this.size*2;
            int[] newArr = new int[this.size];
            for (int i = 0; i < this.arr.length; i++) {
                newArr[i] = this.arr[i];
            }
            this.arr = newArr;
        }
    }
    public void print() {
        for (int i = 0; i < this.index; i++) {
            System.out.println(this.arr[i]);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        //List<Integer> arr = new ArrayList<>();
    MyArray arr = new MyArray();

        arr.add(1);
        arr.add(4);
        arr.add(6);
        arr.add(2);
        arr.add(3);
        arr.add(8);

        arr.add(2,5);


        arr.print();

        //System.out.println(arr.);


    }
}