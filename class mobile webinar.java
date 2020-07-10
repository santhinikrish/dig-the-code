// Define the Mobile class below
class Mobile{
    private int price;
    public double getTenPercentDiscount(){
        return (double)price*0.1;
    }
    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price=price;
    }
}
public class Hello {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
Mobile m = new Mobile();
m.setPrice(sc.nextInt());
System.out.printf("%.2f", m.getTenPercentDiscount());
}
}
