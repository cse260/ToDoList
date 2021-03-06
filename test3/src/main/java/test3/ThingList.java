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
        // PrintAllList();
        // System.out.println("Add List Finish!");
    }

    public List<String> deleteThing(String str){
        if(notFinishList.size() == 0){
        //    System.out.println("未完成的项目中不包含此项目，请检查输入是否正确");
        }else{
            notFinishList.remove(str);
        }
        return notFinishList;
        // PrintAllList();
        // System.out.println("Delete List Finish!");
    }


    public List<String> changeToFinish(String str){
        if(notFinishList.size() == 0){
        //    System.out.println("未完成的项目中不包含此项目，请检查输入是否正确");
        }else{
            notFinishList.remove(str);
            haveFinishList.add(str);
        }
        return haveFinishList;
        // System.out.println("Change Finish!");
    }

    public void PrintAllList(){
        System.out.println("未完成的项目：");
        if(notFinishList.size() == 0) System.out.println("暂时没有未完成的项目！");
        for(int i = 0;i<notFinishList.size();i++){
            System.out.print(i+1+": ");
            System.out.println(notFinishList.get(i));
        }
        System.out.println("已完成的项目：");
        if(haveFinishList.size() == 0) System.out.println("暂时还未完成项目");
        for(int i = 0;i<haveFinishList.size();i++){
            System.out.print(i+1+": ");
            System.out.println(haveFinishList.get(i));
        }
        System.out.println("---------------------------------------");
    }
    public boolean checkIsEmpty(){
        return notFinishList.isEmpty();
    }
    
}