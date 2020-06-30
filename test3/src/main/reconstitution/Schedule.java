import java.util.Scanner;

public class Schedule {
    public static void main(String[] args) {
        //创建一个计划表 
        ThingList TL = new ThingList();
        String cmd = new String();
        String list = new String();
        Scanner in = new Scanner(System.in);
        while(true){
            //输入add添加计划，输入delete删除计划，输入change更改计划
            //输入exit退出计划表
            System.out.println("说明：\n输入add添加计划，输入delete删除计划，输入change更改计划，" +
                    "输入exit退出计划表");
            cmd = in.nextLine();
            if(cmd.equals("exit")) break;
            else if(cmd.equals("add")){
                System.out.println("请输入要添加的计划:");
                list = in.nextLine();
                TL.addThing(list);
            }else if(cmd.equals("delete")){
                if(TL.checkIsEmpty()){
                    System.out.println("暂无可删除的计划，请重新输入指令");
                    continue;
                }
                TL.PrintAllList();
                System.out.println("请输入要删除的计划的序号:");
                list = in.nextLine();
                int k = Integer.parseInt(list);
                TL.deleteThing(k);
            }else if(cmd.equals("change")) {
                if(TL.checkIsEmpty()){
                    System.out.println("暂无可更改的计划，请重新输入指令");
                    continue;
                }
                TL.PrintAllList();
                System.out.println("请输入要更改的计划的序号:");
                int k = in.nextInt();
                TL.changeToFinish(k);
            }else{
                System.out.println("命令输入错误，请重新输入");
            }
            System.out.println("请继续你的计划表，若退出，请输入exit");
        }
    }
}