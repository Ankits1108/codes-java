public class Elseif {
    public static void main(String args []){
        int age = 21;
        if (age>=18){
            System.out.println("adult");
        } 
        else if (age<18 && age>13){
            System.out.println("teenager");
        }else {
            System.out.println("child");
        }
    }
}
