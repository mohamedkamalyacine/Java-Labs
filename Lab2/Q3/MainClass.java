public class MainClass {
    public static void main(String[] args)
    {
        int[] arrInt = new int[1000];
        AlgorithmArray myaAlg = new AlgorithmArray();
        for (int i = 0; i < 1000; i++)
        {
            arrInt[i] = i*2;
            // System.out.println(arrInt[i]);
        }
        int x = myaAlg.max(arrInt);
        System.out.println("Max Number in Array is " + x);
        x = myaAlg.min(arrInt);
        System.out.println("Min Number in Array is " + x);
        
        System.out.println("The Time execution is " + System.nanoTime());
    }
}
