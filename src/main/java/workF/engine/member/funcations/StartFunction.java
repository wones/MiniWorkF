package workF.engine.member.funcations;

import workF.engine.member.FlowObject;

/**
 * @author:wones
 * @desc:定义开始事件的功能
 * @date:2022/9/9 14:32
 */
public class StartFunction implements RunFunction{
    @Override
    public void doRun(FlowObject flowObject) throws InterruptedException {
        System.out.println("开始执行改名字流程");
    }
}
