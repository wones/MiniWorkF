package workF.test;

/**
 * @author:wones
 * @desc:具体处理者
 * @date:2022/9/7 23:59
 */
public class DirectHandler extends Handler{
    public DirectHandler(String handerName, int minDay, int maxDay){
        super(handerName,minDay,maxDay);
    }
    public DirectHandler(String handerName, int maxDay){
        super(handerName,maxDay);
    }
//    @Override
//    protected void dealRequest(Request request) {
//        if(request.getDay() < this.minDay){
//            System.out.println("直接主管：已经处理；流程结束");
//            return;
//        }
//        if(this.nextHander != null){
//           if(request.getDay() > maxDay){
//               this.nextHander.dealRequest(request);
//           }
//        } else {
//            if(request.getDay() > maxDay){
//                System.out.println("该流程超出审核范围；拒绝！");
//                isUnpass(request);
//            }else {
//                this.answer(request);
//                System.out.println("流程处理完成！");
//            }
//        }
//    }
}
