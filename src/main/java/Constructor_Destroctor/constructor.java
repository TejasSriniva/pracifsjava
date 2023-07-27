package Constructor_Destroctor;

public class constructor {
    String Accountholdername;
    Long AccountNo;
    double AccountBalance;

    public constructor() {
        System.out.println("This is default constructor");
        Accountholdername = "Tejas";
        AccountBalance = 100000;
        AccountNo = 123455680l;
        System.out.println("Account Holder" + Accountholdername + "\n Account No" + AccountBalance + "\n Account balance" + AccountBalance);
    }

    public constructor(String AccountHolderName, Long Accountno, Double AccountBalance) {
        this.Accountholdername = AccountHolderName;//
        AccountNo = Accountno;
        this.AccountBalance = AccountBalance;
        System.out.println("AccountHolder is :" + AccountHolderName + "\n AccountBalance :" + AccountBalance + "\n Account Number :" + Accountno);
    }

    public static void main(String[] args) {
//        Classname objname=bnew Constructorname(or)MethodName;
        constructor def = new constructor();//Initialization an object is called constructor
        constructor def1 = new constructor("Mao", 1234223456765l, 89000.0);

    }
}
