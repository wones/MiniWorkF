package workF.test;

import java.util.Scanner;

import static java.lang.Thread.sleep;

/**
 * @author:wones
 * @desc:处理请求
 * @date:2022/9/7 23:34
 */
public abstract class Handler {
    public static int Day_1 = 1;
    public static int Day_3 = 3;
    public static int Day_5 = 5;
    protected String handerName;
    protected int minDay;
    protected int maxDay;
    protected Handler nextHander;
    public Handler(){}

    public void setNextHander(Handler nextHander) {
        this.nextHander = nextHander;
    }

    public Handler(String handerName, int minDay, int maxDay) {
        this.handerName = handerName;
        this.minDay = minDay;
        this.maxDay = maxDay;
    }

    public Handler(String handerName, int maxDay) {
        this.handerName = handerName;
        this.maxDay = maxDay;
    }
    protected void dealRequest(Request request) {
        if(request.getDay() < this.minDay){
            System.out.println("当前主管为："+handerName);
            System.out.println("已经处理；流程结束");
            return;
        }
        if(this.nextHander != null){
            if(request.getDay() > maxDay){
                System.out.println("当前主管为："+handerName);
                System.out.println("该主管没有权限，已提交到上一级部门");
                this.nextHander.dealRequest(request);
            }
        } else {
            if(request.getDay() > maxDay){
                System.out.println("当前主管为："+handerName);
                System.out.println("该流程超出审核范围；拒绝！");
                isUnpass(request);
            }else {
                this.answer(request);
                System.out.println("流程处理完成！");
            }
        }
    };
    protected  final void answer(Request request){
        System.out.println("当前主管为："+handerName);
        System.out.println("请对流程进行审核：yes or no?");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        if("yes".equals(answer)){
            isPass(request);
        }else if("no".equals(answer)){
            isUnpass(request);
        }else{
            System.out.println("无效输入，请重新输入！");
            answer(request);
        }
    }
    private final void isPass(Request request){
        request.setFlag(true);
    }
    protected final void isUnpass(Request request){
        request.setFlag(false);
    }

}
