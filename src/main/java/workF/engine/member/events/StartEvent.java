package workF.engine.member.events;

import workF.engine.member.FlowObject;
import workF.engine.member.funcations.RunFunction;
import workF.engine.member.funcations.StartFunction;

/**
 * @author:wones
 * @desc:开始事件
 * @date:2022/9/9 9:33
 */
public class StartEvent extends Event{

    public StartEvent(FlowObject flowObject){
        super(1,"开始事件");
        this.setFlowObject(flowObject);
        this.setRunFunction(new StartFunction());
    }
}
