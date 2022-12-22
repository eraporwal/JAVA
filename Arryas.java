class student{
    public int rollno;
    public String name;
    student (int rollno, String name){
        this.rollno =rollno;
        this.name = name;
    }
    }


public class Arryas {
    public static void main(String[] args) {
        student [] arr;
        arr = new student[5];
        arr[0]= new student(31,"shree" );
        arr[1]= new student(2,"shreee" );

        arr[2]= new student(3,"shre" );

        arr[3]= new student(1,"shri" );

       
       for(int i =0;i<arr.length;i++){
              System.out.println(" " + i +" "+ arr[i].rollno + arr[i].name);
       }

}
}  
