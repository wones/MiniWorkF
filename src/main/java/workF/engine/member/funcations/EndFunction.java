package workF.engine.member.funcations;

import workF.engine.member.FlowObject;

/**
 * @author:wones
 * @desc:定义结束事件的功能
 * @date:2022/9/9 14:33
 */
public class EndFunction implements RunFunction{
    @Override
    public void doRun(FlowObject flowObject) throws InterruptedException {
        System.out.println("流程执行完成！");
    }
}
