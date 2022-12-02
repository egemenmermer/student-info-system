public class Student {
    String name,stuNo;
    int classes;
    Course c1;
    Course c2;
    Course c3;
    double avarage;
    boolean isPass;

    Student(String name, int classes, String stuNo, Course c1,Course c2,Course c3){
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        calcAvarage();
        this.isPass = false;
    }

    public void addBulkExamNote(int c1, int c2, int c3){
        if(c1 >= 0 && c1 <= 100){
            this.c1.note = c1;
        }
        if(c2 >= 0 && c2 <= 100){
            this.c2.note = c2;
        }
        if(c3 >= 0 && c3 <= 100){
            this.c3.note = c3;
        }
    }

    public void isPass(){
        if (this.c1.note == 0 || this.c2.note == 0 || this.c3.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        }else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }
    public void calcAvarage(){
        this.avarage = (this.c1.note + this.c2.note + this.c3.note) / 3;
    }
    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Tarih Notu : " + this.c1.note);
        System.out.println("Kimya Notu : " + this.c2.note);
        System.out.println("Fizik Notu : " + this.c3.note);
    }
}
