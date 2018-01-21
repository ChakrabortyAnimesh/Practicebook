package com.company;

public class Main  {

    public static void main(String[] args) {
	// write your code here
        Bicycle bajaz,apache;
        String animesh,asutosh,tag;
        bajaz=new Bicycle();
        bajaz.setOwnerName("Animesh");
        apache=new Bicycle();
        Account ani=new Account();
        ani.setAccountOwnerName("Animesh Chakraborty");
        ani.setInitialBalance(700.227);
        ani.add(78800);
        ani.deduct(30000);
        System.out.println(ani.getAccountOwnerName()+" has available balance $"+ani.getcurrentBalance());
        apache.setOwnerName("Asutosh");
        animesh=bajaz.getOwnerName();
        asutosh=apache.getOwnerName();
        bajaz.setTagNo("1404-BHC7");
        apache.setTagNo("1405-IND");
        tag= bajaz.getTagNo();

        System.out.println(animesh+" owns a new bicycle and his bike's tag no is: "+tag);
        System.out.println(asutosh+" is also owns a new bicycle and his bike's tag no is: "+apache.getTagNo());




    }
}
