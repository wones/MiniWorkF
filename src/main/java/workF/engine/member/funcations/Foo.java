package workF.engine.member.funcations;

import workF.engine.member.FlowObject;

/**
 * @author:wones
 * @desc:描述类的功能
 * @date:2022/9/9 14:10
 */
public class Foo implements RunFunction{
    @Override
    public void doRun(FlowObject flowObject) throws InterruptedException {
        System.out.println("设置用户名字为：wones");
        flowObject.setName("wones");
    }
}
