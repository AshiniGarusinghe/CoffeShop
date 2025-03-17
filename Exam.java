import java.util.Scanner;
public class Exam {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Do you want to enter student's details? (Y/N)");
        String reply = input.next();

        
         switch (reply) {
            case "Y":
                System.out.print("Enter Student Name: ");
                String name = input.next();
    
                System.out.print("Enter Student Address: ");
                String address = input.next();
    
                System.out.print("Enter Number of Subjects: ");
                int num = input.nextInt();

                int[] all = new int[num];

                int max = 0;
                int total =0;
                
                for(int i=1;i<=num;i++){
                    System.out.print("Enter Marks of Subjects "+i+": ");
                    all[i-1] = input.nextInt();

                    int marks = all[i-1];
    
                    if(max<marks){
                        max=marks;
                    }
                    
                    total = total+marks;
                }

                System.out.println();
                
                System.out.println("A. Show Student Details");
                System.out.println("B. Show Maximum Mark");
                System.out.println("C. Show Student Average Mark");
                System.out.println("D. Show Student Result");
                System.out.println("E. Show Student All Marks");
                System.out.println("X. Exit");
        
                
                double average = (double)total/num;

                System.out.println();
    
                
                
                while(true){
                System.out.println("-->");
                String letter = input.next();

                    
                    switch(letter){
                        case "A":
                            System.out.println("Student name is "+name+" and address is "+address);
                                break;
                            case "B":
                                System.out.println("Student's maximum mark is "+max);
                                break;
                            case "C":
                                System.out.println("Student's average mark is "+average);
                                break;
                            case "D":
                                if(average>=50){
                                    System.out.println("Pass");
                                }else{
                                    System.out.println("Fail");
                                }
                                break;
                            case "E":
                                for(int i=1;i<=all.length;i++){
                                    System.out.println("Student's Subject "+i+"mark: "+all[i]);
                                }
                                break;
                            case "X":
                                return;
                            default:
                                System.out.println("Invalid Entry");         
                            }
                        }
    
                    
                case "N":
                     return;
                default:
                    System.out.println("Invalid Entry");
            }
        
    
    
        }
}
 

