import java.util.*;
class StudentSide{                                         //*storing student infomation*/
      public String name ,id , address;
      
      public StudentSide(String name ,String id, String address){
     this.name = name ;  this.id=id; this.address=address;
     }
     @Override
     public String toString() {
        
        return "Name:" + name + ", ID: "+ id + ", Address: "+ address;
    
    
       }
    }



class studentinfo{                            //*creating ArrayList */
    Scanner sc=new Scanner(System.in);
     public ArrayList<StudentSide>students;
     public studentinfo(ArrayList<StudentSide>students){
     this.students=students;
     }
        
    
    }
    

 public class BusSystem {
 public static void main(String[] args) {
    int a; String sname;   char c;
    Scanner sc=new Scanner(System.in);
     ArrayList<StudentSide> si = new ArrayList<>(); //Array list obj
        StudentSide s1 = new StudentSide("saanesh", "1","collector");
        si.add(s1);
        StudentSide s2 = new StudentSide("saijal", "2","bhawarkua");
        si.add(s2);
        StudentSide s3 = new StudentSide("archna", "3","rajwara");
        si.add(s3);
        StudentSide s4 = new StudentSide("santosh", "4" ,"vijay nagar");
        si.add(s4);
        StudentSide s5 = new StudentSide("sandeep", "5","nalakha");
        si.add(s5);
        StudentSide s6 = new StudentSide("sanjna", "6","bholaram");
        si.add(s6);
        StudentSide s7 = new StudentSide("kanchan", "7","sindhi colony");
        si.add(s7);

        studentinfo sif = new studentinfo(si); //studentinfo obj for Arraylist
        do{

       System.out.println(" 1 : student list");
       System.out.println(" 2 : student search");
       System.out.println(" 3 : student search by id");
       System.out.println(" 4 : add student ");
       System.out.println(" 5 : search stopage");
       
       a=sc.nextInt();
        
          switch (a) {
            case 1:
                System.out.println(sif.students);
                break;
              case 2:
                      System.out.println("enter student name ");
                      sname=sc.next();
                      if (si.contains(sname))

                      
                      {
                      System.out.println(si.contains(sname));
                      }
                      else
                      System.out.println("5 does not exist in the ArrayList");
                       break;
                       case 3:
                       System.out.println("enter student id ");
                      int sid=sc.nextInt();
                       if (si.contains(sid)){
                      System.out.println(sid+" exists in the ArrayList");
                       }
                      else 
                      System.out.println("5 does not exist in the ArrayList");
                       break;
                       case 4:
                       System.out.println("enter student name");
                       String addname = sc.nextLine();
                       System.out.println("enter student id");
                       String addid = sc.nextLine();
                       System.out.println("enter adressh");
                       String add=sc.nextLine();
                       for (int i = 0; i < si.size(); i++) {
                        System.out.println(si.size());
                         StudentSide s8 = new StudentSide(addname , addid, add);
                         si.add(s8);
                       }
                          
                         break;
                         default:
                         System.out.println("invalid");
                           break;
                    }
                           System.out.println("if want to continue so press Y");
                           c=sc.next().charAt(0);
                }
                     
                         while( c=='y' | c=='Y');
                        }  
                    
                    
            }     
            
        
    


