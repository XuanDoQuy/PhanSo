public class Helper {
    public static int UCLN(int a, int b){
        if (a<b){
            return UCLN(b,a);
        }else{
            int r;
            while(b!=0){
                r = a%b;
                a = b;
                b = r;
            }
            return a;
        }
    }
    public static int BCNN(int a, int b){
        return (int) a*b/UCLN(a,b);
    }
}
