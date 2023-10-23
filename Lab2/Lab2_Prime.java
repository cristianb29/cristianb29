package Lab2;

public class Lab2_Prime {
    public static void main(String[] args){
        int[] arr = {1, 2017, 2019, 5};
        int prim=1;
        for (int i=0; i<arr.length; i++)
        {
            if (arr[i]==0 || arr[i]==1)
            {
                continue;
            }
            for (int d=2; d<=arr[i]/2; d++)
                if (arr[i]%d==0) {
                    prim=0;
                }
            if (prim==1)
                System.out.println(arr[i] + " ");
            prim=1;
        }
    }

}
