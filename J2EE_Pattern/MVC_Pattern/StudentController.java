public class StudentController {
    
    public StudentView studentView;
    public Student model;

    public StudentController(StudentView studentView,Student model)
    {

        this.studentView=studentView;
        this.model=model;


    }

    public String getName()
    {

        return model.getName();

    }

    public void setName(String name)
    {

        model.setName(name);

    }

    public String getRoll()
    {

        return model.getRoll();

    }

    public void setRoll(String roll)
    {

        model.setRoll(roll);

    }

    public void updateView()
    {

        studentView.StudentInfo(model.getName(),model.getRoll());

    }



}
