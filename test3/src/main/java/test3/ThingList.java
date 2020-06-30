package test3;

import java.util.LinkedList;
import java.util.List;

public class ThingList {
    private List<String> notFinishList;
    private List<String> haveFinishList;
    public ThingList(){
        notFinishList = new LinkedList<>();
        haveFinishList = new LinkedList<>();
    }
    public List<String> addThing(String str){
        notFinishList.add(str);

       return notFinishList;
        //System.out.println("Add List Finish!");
    }

    public List<String> deleteThing(String str){
        notFinishList.remove(str);

        return notFinishList;
       // System.out.println("Delete !List Finish");
    }


    public List<String> changeToFinish(String str){
        notFinishList.remove(str);
        haveFinishList.add(str);

        return haveFinishList;
    }


}
