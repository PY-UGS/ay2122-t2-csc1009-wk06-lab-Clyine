public class Main {
    public static void main(String[] args){
        List list = new List();
        list.printList();
        list.addAndSort(13);
        list.printList();
        list.swapValue(2, 5);
        list.printList();

        List random = new List(100000);
        int index = random.findValue((int)(Math.random()*(9999-1000)));
        System.out.println(index);

        Hash hList = new Hash();
        hList.printList();
        hList.addAndSort(4);
        hList.printList();
        hList.swapValue(2,5);
        hList.printList();

        Hash hRandom = new Hash(100000);
        int hIndex = hRandom.findValue((int)(Math.random()*(9999-1000)));
        System.out.println(hIndex);

    }
}
