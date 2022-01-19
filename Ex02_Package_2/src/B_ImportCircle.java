import com.company.area.Circle;

class B_ImportCircle {
    public static void main(String args[]) {
        Circle c1 = new Circle();
        c1.setRad(3.5);
        System.out.println("반지름 3.5 원 넓이: " + c1.getArea());
        
        Circle c2 = new Circle();
        c2.setRad(5.5);
        System.out.println("반지름 5.5 원 넓이: " + c2.getArea());
    }
}