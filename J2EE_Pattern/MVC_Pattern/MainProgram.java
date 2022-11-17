public class MainProgram {
    
    public static void main(String[] args)
    {

        Student model=retriveStudentFromDatabase();
       

        StudentView studentView=new StudentView();

        StudentController studentController=new StudentController(studentView, model);

        studentController.updateView();

        studentController.setName("PVC");

        studentController.updateView();



    }

    public static Student retriveStudentFromDatabase()
    {

        Student student=new Student();

        student.setName("KMN");
        student.setRoll("101010");

        return student;


    }


}
