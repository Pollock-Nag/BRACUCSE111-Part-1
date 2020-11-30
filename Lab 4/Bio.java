public class Bio{
  public static void main (String [] args){
    Student s1= new Student();
    Student s2= new Student();
    Student s3= new Student();
    s1.setName("John");
    s1.getName();
    s1.setID("18201183");
    s1.getID();
    s1.setAddress("Dhaka");
    s1.getAddress();
    s1.setCGPA(4.00);
    s1.getCGPA();
    s2.setName("Mike");
    s2.getName();
    s2.setID("18101183");
    s2.getID();
    s2.setAddress("Rajshahi");
    s2.getAddress();
    s2.setCGPA(3.75);
    s2.getCGPA();
    s3.setName("Carol");
    s3.getName();
    s3.setID("18131183");
    s3.getID();
    s3.setAddress("Khulna");
    s3.getAddress();
    s3.setCGPA(3.33);
    s3.getCGPA();
    System.out.println(s1.name+" "+s1.id+" "+s1.add+" "+s1.cgpa);
    System.out.println(s2.name+" "+s2.id+" "+s2.add+" "+s2.cgpa);
    System.out.println(s3.name+" "+s3.id+" "+s3.add+" "+s3.cgpa);
      
  }
}
