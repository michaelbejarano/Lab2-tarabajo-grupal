public class StudentReport {
    public static void main(String[] args) {
        // Crear modelo
        StudentModel student = new StudentModel("Mike", 21);

        // Crear vista
        StudentView view = new StudentView();

        // Crear controlador
        StudentController controller = new StudentController(student, view);

        // Mostrar reporte inicial
        controller.updateView();

        // Cambiar datos
        controller.setStudentName("Juan Perez");
        controller.setStudentAge(22);

        // Mostrar reporte actualizado
        controller.updateView();
    }
}
