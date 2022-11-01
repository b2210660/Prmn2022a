public class lecture04 {
    public static void main(String[] args){
        int[] array = new int[100];

        for(int i=0 ; i<100 ; i++){
            array[i] = i+1;
        }

        int sum = 0;

        for(int i=0 ; i<100 ; i++){
            if(i%2 == 0){
                sum = array[i];
            }
        }

        System.out.println("偶数の合計は" + sum);

    }
}
