import java.util.*;
public class StudentGradTracker {

    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);

       System.out.print("Enter Number Of Students: ");
       int n=sc.nextInt();
       sc.nextLine();

       String[] names = new String[n];
       int[] grades = new int[n];

       int total=0;
       int highest=0;
       int lowest=100;
       String topper="";
       for(int i=0;i<n;i++){
        System.out.println("\n=====Student "+ (i+1)+" ===== ");
        System.out.println("Enter Student Name: ");
        names[i]=sc.nextLine();

        while(true){
            System.out.println("Enter Grade(0-100)");
            if(sc.hasNextInt()){
            grades[i]=sc.nextInt();
            sc.nextLine();

            if(grades[i]>=0 && grades[i]<=100){
                break;
            }
        }
            else{
            System.out.print("Invalid Grade");
            }
           sc.nextLine();
        }
           total+=grades[i];

           if(grades[i]>highest){
                highest=grades[i];
                topper=names[i];
           }
           if(grades[i]<lowest){
            lowest=grades[i];
           }
        }
        double average=(double) total/n;

        System.out.println("\n======= STUDENT SUMMARY REPORT =======");
         
        System.out.printf("%-15s %-10s %-10s %-10s\n",
                     "NAME","GRADE","STATUS","LETTER");
        
                    for(int i=0;i<n;i++){
                    String status=grades[i]>=40?"PASS" : "FAIL";
                        String letter;

                        if(grades[i]>=90){
                            letter="O";
                        }
                        else if(grades[i]>=80){
                            letter="A+";
                        }
                        else if(grades[i]>=70){
                            letter="A";
                        }
                        else if(grades[i]>=60){
                            letter="B+";
                        }
                        else if(grades[i]>=50){
                            letter="B";
                        }
                        else if(grades[i]>=40){
                            letter="C";
                        }
                        else{
                           letter="F";
                        }
                        System.out.printf("%-15s %-10s %-10s %-10s\n",
                              names[i],
                              grades[i],
                              status,
                              letter
                        );
                     }
                     System.out.println("\n-----------------------------");
                     System.out.println("Total Students : "+n);
                     System.out.printf("Average Score : %.2f\n",average);
                     System.out.println("Highest Score :"+highest);
                     System.out.println("Lowest Score :"+lowest);
                     System.out.println("Topper :"+topper);


         sc.close();
       }
    }
