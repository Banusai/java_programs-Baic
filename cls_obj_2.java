class Computer{

    public void playMusic(){
        System.out.println("Music is Playing...");
    }

    public String Calc(int n){
        return "Hello";
    }

}

public class cls_obj_2 {
    public static void main(String args[]){

        Computer com=new Computer();

        com.playMusic();
        String str=com.Calc(10);

        System.out.println(str);
    }
    
}
