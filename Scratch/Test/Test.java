public class Test {
    public static void main(String[] args) {
        i​nt[]a= new int[]{1,5,4,10};
        int[]b= new int[]{7,9,2,6,4,7};
        int[]c= new int[a.length];
        for (int i=0; i<a.length;i++){
            c[i]=a[i];
        }
        c[c.length]=b;

        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
    }
}