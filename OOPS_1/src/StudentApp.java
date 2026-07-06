
class Student{

        //Data Security
        private int rollNo;
        private String name;
        private String address;

        //setter method
        public void setRollNo(int rollno){
                this.rollNo = rollno;
        }
        public void setName(String name){
                this.name = name;
        }
        public void setAddress(String address){
                this.address = address;
        }

        //getter method
        public int getRollNo(){
            return rollNo;
        }
        public String getName(){
            return name;
        }
        public String getAddress(){
            return address;
        }



}
public class StudentApp {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setAddress("satna");
        s1.setName("Aryan");
        s1.setRollNo(21);

        System.out.println("Roll no. is = "+s1.getRollNo());
        System.out.println("name is = "+s1.getName());
        System.out.println("address is = "+s1.getAddress());
    }

}
