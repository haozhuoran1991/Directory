package com.company;

/**
 * Created by zhuorhao on 3/7/17.
 */
public class employee {
    private String Firstname;
    private String Lastname;
    private String Phonenumber;
    private String Department;

    public employee(String firstname,String lastname, String phonenumber, String department){
        this.Firstname=firstname;
        this.Lastname=lastname;
        this.Phonenumber=phonenumber;
        this.Department=department;
    }

    public String toString(){

        String s=this.Firstname+","+this.Lastname+" "+this.Phonenumber+" "+this.Department;
        return s;
    }

}
