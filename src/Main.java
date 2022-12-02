public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Ilber Ortayli", "HIS", "555");
        Teacher t2 = new Teacher("Marie Curie", "CHE", "555");
        Teacher t3 = new Teacher("Albert Einstein", "PHY", "555");

        Course tarih = new Course("Tarih", "HIS101", "HIS");
        Course kimya = new Course("Kimya", "CHE101", "CHE");
        Course fizik = new Course("Fizik", "PHY101", "PHY");

        tarih.addTeacher(t1);
        kimya.addTeacher(t2);
        fizik.addTeacher(t3);

        Student s1 = new Student("İnek Şaban", 4, "140144015", tarih, kimya, fizik);
        s1.addBulkExamNote(50,20,40,30,40,50);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi", 4, "2211133", tarih, kimya, fizik);
        s2.addBulkExamNote(100,50,40,30 ,40,50);
        s2.isPass();

        Student s3 = new Student("Hayta İsmail", 4, "221121312", tarih, kimya, fizik);
        s3.addBulkExamNote(50,20,40,30 ,40,50);
        s3.isPass();
    }
}