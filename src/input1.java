import java.io.BufferedReader;
import java.io.InputStreamReader;

public class input1 {
    private static Object InputStreamReader;

    public static void main(String[] args)throws Exception
    {
        //creating instances

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        String StudentName;

        System.out.print("Enter student name");
        StudentName = input.readLine();

        System.out.println("Your name is "+ StudentName);
                
    }


}

