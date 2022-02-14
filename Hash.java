import java.util.Hashtable;

public class Hash {
    Hashtable<Integer,Integer> list;

    Hash(){
        this.list = new Hashtable<Integer, Integer>();
        for (int i = 0; i < 6; i ++){
            this.list.put(i, 2*i + 1);
        }
    }

    Hash(int n){
        this.list = new Hashtable<Integer,Integer>();
        for (int i = 0 ; i < n ; i++){
            this.list.put(i, (int)(Math.random()*(9999-1000)));
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
        this.list.put(this.list.size(), value);

        for (int i = index; i < this.list.size(); i++){
            int temp = this.list.get(this.list.size()-1);
            this.list.replace(this.list.size()-1, this.list.get(i));
            this.list.replace(i, temp);
        }
    }    

    public void swapValue(int indexOne, int indexTwo){
        int temp = this.list.get(indexOne);
        this.list.put(indexOne, list.get(indexTwo));
        this.list.put(indexTwo, temp);
    }

    public void printList(){
        for (int i = 0 ; i < this.list.size(); i++){
            System.out.print(this.list.get(i));
            System.out.print(" ");
        }
        System.out.println("");
    }

    public int findValue(int value){
        int index = 0;
        for (int i = 0; i < this.list.size(); i++){
            if (value == this.list.get(i)){
                index =  i;
                break;
            }
            else{
                index = -1;
            }
        }
        return index;
    }
}
