public class question2 {
    public static String min_max (int[] x){
int min= x[0];
int max= x[0];
        for (int i = 0; i <= x.length - 1; i++){
            if (x[i]<min)
                min=x[i];
            if (x[i]>max)
                max=x[i];
        }
      return "min is "+min+" and max is "+max;
    }

    public static void main(String[] args) {
        int [] x = {0,-11,7,77,21};
        System.out.println( min_max(x));
    }
}
