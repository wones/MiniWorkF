package workF.engine.member.events;

import workF.engine.member.Connect;
import workF.engine.member.FlowObject;
import workF.engine.member.Node;
import workF.engine.member.funcations.RunFunction;

/**
 * @author:wones
 * @desc:定义事件属性与方法
 * @date:2022/9/9 9:31
 */
public class Event extends Node {
    private int type; //1开始事件  2.结束事件  3.中间事件
    private String desc;

    public Event(){
    }
    public Event(int type, String desc) {
        this.type = type;
        this.desc = desc;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
