public class array_of_objects {
    public static void main(String[] args) 
    {
       Student S1 = new Student();
       S1.rollno = 28;
       S1.name = "Rajat";
       S1.marks = 88; 

       Student S2 = new Student();
       S2.rollno = 13;
       S2.name = "Saurav";
       S2.marks = 92; 

       Student S3 = new Student();
       S3.rollno = 26;
       S3.name = "Rahul";
       S3.marks = 90; 

       //Array of students formation
       Student students[] = new Student[3];
       students[0] = S1;
       students[1] = S2;
       students[2] = S3;

       for (int i = 0; i < students.length; i++) 
       {
            System.out.println(students[i].rollno + "|" + students[i].name + "|"+ " marks : " + students[i].marks);
       }

       // Enhanced for loop
       System.out.println("This is with enhanced for loop"); 
       for(Student stud : students)
       {
        System.out.println(stud.rollno + "|" + stud.name + "|"+ " marks : " + stud.marks);  
       }
    }
}
class Student
{
    int rollno;
    String name;
    int marks;
}
