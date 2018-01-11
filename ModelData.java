package com.example.hp.recycleviewlab;

import java.util.ArrayList;

/**
 * Created by dell on 10/3/2017.
 */
public class ModelData {
   private String name="";
    private String phone="";

    public ModelData(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public static ArrayList Contact (int clist)
    {
        ArrayList<ModelData> arrayList=new ArrayList<ModelData>();
        for(int i=0;i<=clist;i++)
        {
            arrayList.add(new ModelData("std" + i ,"030012"));


        }
        return arrayList;
    }


}
