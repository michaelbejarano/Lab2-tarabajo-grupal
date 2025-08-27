public class StudentController {
    private StudentModel model;
    private StudentView view;

    public StudentController(StudentModel model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    // Controla actualización de datos
    public void setStudentName(String name) {
        model.setName(name);
    }

    public String getStudentName() {
        return model.getName();
    }

    public void setStudentAge(int age) {
        model.setAge(age);
    }

    public int getStudentAge() {
        return model.getAge();
    }

    // Mostrar datos en la vista
    public void updateView() {
        view.printStudentDetails(model.getName(), model.getAge());
    }
}
