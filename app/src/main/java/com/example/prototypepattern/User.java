package com.example.prototypepattern;




/**
 * Created by W on 2018/12/15.
 */

public class User implements Cloneable{
    @Override
    public User clone(){
        User user = null;
        try{
            user = (User)super.clone();

        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return user;
    }
    public int age;
    public String name;
    public String phoneNum;
    public Address address;
    @Override
    public String toString(){
        return "User [ age= " + age +", name =  " + name + ",address= " + address + "]";
    }
}
