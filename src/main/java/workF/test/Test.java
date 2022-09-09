package workF.test;

/**
 * @author:wones
 * @desc:测试类
 * @date:2022/9/8 0:26
 */
public class Test {
    public static void main(String[] args) {
        Request request = new Request(8,"wones","go home");

        DirectHandler directHandler = new DirectHandler("d",3);
        GroupHandler groupHandler = new GroupHandler("g",7);
        WorkHandler workHandler = new WorkHandler("w",14);
        directHandler.setNextHander(groupHandler);
        groupHandler.setNextHander(workHandler);
        System.out.println("审核流程开始：");
        directHandler.dealRequest(request);
        System.out.println("审核结果为：");
        System.out.println(request.isFlag());
        if(request.isFlag()){
            System.out.println("你可以回家了");
        }else {
            System.out.println("好好工作，下一次多给你发一天假");
        }

    }
}
