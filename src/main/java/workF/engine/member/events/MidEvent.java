package workF.engine.member.events;

import workF.engine.member.funcations.RunFunction;

/**
 * @author:wones
 * @desc:中间事件类
 * @date:2022/9/9 14:12
 */
public class MidEvent extends Event{
    public MidEvent() {
        super(3,"中间事件");
    }
    public void setUserFunction(RunFunction function){
        this.setRunFunction(function);
    }
    public MidEvent(RunFunction function){
        super(3,"中间事件");
        this.setRunFunction(function);
    }
}
