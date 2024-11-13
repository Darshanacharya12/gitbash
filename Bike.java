class Bike {
 String Brand;
 int cost;
 int Mileage;
 Bike(String Brand,int cost,int Mileage)
  {
   this.Brand=Brand;
   this.cost=cost;
   this.Mileage=Mileage;														
  }
  public static void main(String[] args)
  {
    Bike B1 = new Bike("Bullet",250000,35);
     System.out.println(B1.Brand);
     System.out.println(B1.cost);
     System.out.println(B1.Mileage);
  }

}