import java.util.Scanner;
public class StudentDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter How Many Student you want to add:");
        int n = sc.nextInt();
        StudentDetail s[]=new StudentDetail[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter Enrollment Number:");
            long enroll=sc.nextInt();
            System.out.print("Enter Name:");
            sc.nextLine();
            String name=sc.nextLine();
            System.out.print("Enter Semester:");
            int sem=sc.nextInt();
            System.out.print("Enter CPI:");
            float cpi=sc.nextFloat();
            s[i]=new StudentDetail(enroll,name,sem,cpi);
        }
        for(int i=0;i<n;i++){
            System.out.println("==============================");
            s[i].printDetails();
        }
    }
}
class StudentDetail{
    long enroll;
    String name;
    int sam;
    float cpi;
    StudentDetail(long enroll,String name,int sam,float cpi){
        this.enroll=enroll;
        this.name=name;
        this.sam=sam;
        this.cpi=cpi;
    }
    void printDetails(){
        System.out.println("Enrollment Number:"+this.enroll);
        System.out.println("Name:"+this.name);
        System.out.println("Samester:"+this.sam);
        System.out.println("CPI:"+this.cpi);
    }
}