package OOPS_inheritance;
 class Encapsulation {
    public int FoodID;
    public String Foodname;
    public String Fodtype;
    public int Foodrate;
    public long Foodcode;

    public int getFoodID() {
        return FoodID;
    }

    public void setFoodID(int foodID) {
        FoodID = foodID;
    }

    public String getFoodname() {
        return Foodname;
    }

    public void setFoodname(String foodname) {
        Foodname = foodname;
    }

    public String getFodtype() {
        return Fodtype;
    }

    public void setFodtype(String fodtype) {
        Fodtype = fodtype;
    }

    public int getFoodrate() {
        return Foodrate;
    }

    public void setFoodrate(int foodrate) {
        Foodrate = foodrate;
    }

    public long getFoodcode() {
        return Foodcode;
    }

    public void setFoodcode(long foodcode) {
        Foodcode = foodcode;
    }
}
public class  Encap extends Encapsulation{
    public static void main(String[] args) {


        Encap ee=new Encap();
        ee.setFoodID(1);
        ee.setFoodname("Idly");
        ee.setFodtype("tiffen");
        ee.setFoodrate(10);
        ee.setFoodcode(1234567890l);
        System.out.println(ee.getFoodID()+"\n"+ee.getFoodname()+"\n"+ee.getFodtype()+"\n"+ee.getFoodrate()+"\n"+ee.getFoodcode()+"\n");
    }


}


