package workF.engine.test;

import workF.engine.member.Connect;
import workF.engine.member.FlowObject;
import workF.engine.member.events.EndEvent;
import workF.engine.member.events.MidEvent;
import workF.engine.member.events.StartEvent;
import workF.engine.member.events.Timer;
import workF.engine.member.funcations.Foo;
import workF.engine.member.funcations.Foo2;
import workF.engine.structure.ProcessBuilder;

import java.util.ArrayList;
import java.util.List;

/**
 * @author:wones
 * @desc:测试工作流引擎
 * @date:2022/9/9 10:18
 */
public class WorkFTest {
    public static void main(String[] args) throws InterruptedException {
        //创建流对象
        FlowObject flowObject = new FlowObject("test",1,new Object());
        //创建开始事件
        StartEvent startEvent = new StartEvent(flowObject);
        //创建连接对象
        Connect c1 = new Connect();
        //进行连接
        ProcessBuilder.makeConnect(startEvent,null,c1);
        //创建计时器
        Timer timer = new Timer(5,Timer.SECOND);
        //创建连接对象
        Connect c2 = new Connect();
        //进行连接
        ProcessBuilder.makeConnect(timer,c1,c2);
        //创建中间事件
        MidEvent midEvent1 = new MidEvent();
        //设置中间事件功能
        midEvent1.setRunFunction(new Foo());
        //创建连接对象
        Connect c3 = new Connect();
        //进行连接
        ProcessBuilder.makeConnect(midEvent1,c2,c3);

        //创建结束事件
        EndEvent endEvent = new EndEvent();
        //进行连接
        ProcessBuilder.makeConnect(endEvent,c3,null);

        System.out.println("流对象初始值为："+flowObject.getName());
        //开始执行流程
        ProcessBuilder.executeAndDeliver(startEvent);
        System.out.println("更改后流对象的值为:"+flowObject.getName());
    }
}
