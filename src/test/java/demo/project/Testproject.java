package demo.project;

public class Testproject {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
                int x= 0;
                int y= 0;
                for (int z = 0; z < 5; z++) 
                {
                    System.out.println("The value of x and y before loop is "+x +" "+ y);
                    if (( ++x > 2 ) && (++y > 2)) 
                    {
                        System.out.println("the value of x and y is " +x +" " + y);
                    }
                }
    }
}
