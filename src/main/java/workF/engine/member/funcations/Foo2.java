package workF.engine.member.funcations;

import workF.engine.member.FlowObject;

/**
 * @author:wones
 * @desc:描述类的功能
 * @date:2022/9/9 14:47
 */
public class Foo2 implements RunFunction{
    @Override
    public void doRun(FlowObject flowObject) throws InterruptedException {
        System.out.println("www");
    }
}
