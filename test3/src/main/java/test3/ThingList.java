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

    public List<String> deleteThing(int k){
        if(notFinishList.size() == 0){
        //    System.out.println("未完成的项目中不包含此项目，请检查输入是否正确");
        }else if(notFinishList.size() < k){
        //    System.out.println("未完成的项目不包含此序列，请重新输入");
            return null;
        }else{
            notFinishList.remove(k-1);
        }
        return notFinishList;
        // PrintAllList();
        // System.out.println("Delete List Finish!");
    }


    public List<String> changeToFinish(int k){
        if(notFinishList.size() == 0){
        //    System.out.println("未完成的项目中不包含此项目，请检查输入是否正确");
        }else if(notFinishList.size() < k){
        //    System.out.println("未完成项目中没有此序号，请重新输入");
            return null;;
        }else{
            String str = notFinishList.get(k-1);
            notFinishList.remove(k-1);
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
