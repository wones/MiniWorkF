package workF.engine.member.funcations;

import workF.engine.member.FlowObject;

/**
 * @author:wones
 * @desc:定义节点执行方法接口
 * @date:2022/9/9 13:56
 */
public interface RunFunction {
    public void doRun(FlowObject flowObject) throws InterruptedException;
}
