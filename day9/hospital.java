class HospitalManagement {
    String patient = "Ravi";

    void display() {
        System.out.println("Patient Name: " + patient);
    }

    public static void main(String[] args) {
        HospitalManagement h = new HospitalManagement();
        h.display();
    }
}