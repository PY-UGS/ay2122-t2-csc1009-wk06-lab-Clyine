import java.util.Arrays;
import java.util.LinkedList;

public class List {
    LinkedList<Integer> list;

    List(){
        list = new LinkedList<Integer>(Arrays.asList(1,3,5,7,9,11));
    }

    List(int n){
        list = new LinkedList<Integer>();
        for (int i = 0 ; i < n ; i++){
            this.list.add(i, (int)(Math.random()*(9999-1000)));
        }
    }

    public void addAndSort(int value){
        int index = 0;
        for (int i = 0; i < this.list.size(); i++){
            if (value < this.list.get(i)){
                index =  i;
                break;
            }
            else{
                index = this.list.size();
            }
        }
        this.list.add(index, value);
    }

    public void swapValue(int indexOne, int indexTwo){
        int temp = this.list.get(indexOne);
        this.list.set(indexOne, list.get(indexTwo));
        this.list.set(indexTwo, temp);
    }

    public void printList(){
        for (int i = 0 ; i < this.list.size(); i++){
            System.out.print(this.list.get(i));
            System.out.print(" ");
        }
        System.out.println("");
    }

    public int findValue(int value){
        return this.list.indexOf(value);
    }

}