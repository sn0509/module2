public class InsertionSort {
    public static int[] list = {1,5,25,33,69,10,55,22,1};

    public static void InsertionSort(int[]list){
        int pos,x;
        for (int i=0; i<list.length; i++){
            x=list[i];
            pos=i;
            while (pos>0 &&x< list[pos-1]){
                list[pos]=list[pos-1];
                pos--;
            }
            list[pos]=x;
        }
    }

    public static void main(String[] args) {
        InsertionSort(list);
        for (int i=0; i < list.length;i++){
            System.out.print(list[i] + " ");
        }
    }
}
