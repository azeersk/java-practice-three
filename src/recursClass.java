public class recursClass {
    public static int fact(int a) {
        if (a == 0) {
            return 1;
        } else {
            return (a*fact(a-1));
        }
    }

    public static int recursionOf(int b){
        int result = 0;
        if(b==0){
            return 1;
        }
        else{
            result = result + recursionOf(b-1);
            return (result + recursionOf(b-1));
        }
    }

    public static int Count(int a){
        if(a==0){
            return 1;
        }
        else{
            return (2*Count(a-1));
        }
    }


    public static void main(String[] args){
        System.out.println(fact(6));
        System.out.println(recursionOf(7));
        System.out.println(Count(5));
    }
}
