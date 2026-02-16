import java.util.Scanner; // roll no:014    


public class Task2{


    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        System.out.print("enter university name:");
        String university=sc.nextLine();
        System.out.print("department name:");
        String department=sc.nextLine();
        System.out.print("enter total no of stud:");
        int total=sc.nextInt();

for (int i=1; i<=total; i++ )
{
    System.out.println("rollno of student" + " " + "is :" + i);
}
sc.close();
}


        
    }

