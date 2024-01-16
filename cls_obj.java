
class Calculator{
    public int add(int n1,int n2){

        int r=n1+n2;
        return r;
    }

    public int sub(int n1,int n2){

        int r1=n1-n2;
        return r1;
    }
}
public class cls_obj {
    public static void main (String[] args){


        int fn=2;
        int sn=5;
        Calculator calc=new Calculator();

        int r=calc.add(fn,sn);
        int r1=calc.sub(fn,sn);

        System.out.println(r);
        System.out.println(r1);



    }
    
}
