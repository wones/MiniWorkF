package workF.engine.member.events;

import workF.engine.member.FlowObject;
import workF.engine.member.funcations.EndFunction;
import workF.engine.member.funcations.RunFunction;

/**
 * @author:wones
 * @desc:结束事件类
 * @date:2022/9/9 9:38
 */
public class EndEvent extends Event {
    public EndEvent(){
        super(2,"结束事件");

        this.setRunFunction(new EndFunction());
    }
}
