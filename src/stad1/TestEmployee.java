package stad1;

class Emp{
    String company = "AQM";  // Global Variable

    void showDetails(){
        int id = 123;       // Local Variable
        System.out.println("ID:" + id);
        System.out.println("Company: " + company );
    }
}

public class TestEmployee {
    public static void main(String args[]){
        Emp e = new Emp();
        e.showDetails();
    }
}
