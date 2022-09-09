package workF.engine.member.events;

import workF.engine.member.FlowObject;
import workF.engine.member.funcations.RunFunction;

import static java.lang.Thread.sleep;

/**
 * @author:wones
 * @desc:计时器类
 * @date:2022/9/9 10:54
 */
public class Timer extends Event {
    public static int SECOND = 0; //秒
    public static int MINUTE = 1;//分
    public static int HOUR = 2;//时
    private int time;
    private int unit;
    public Timer(int time){
        this.time = time;
        init();
    }
    public Timer(int time,int unit){
        this.time = time;
        this.unit = unit;
        init();
    }
    private void init(){
        RunFunction runFunction = new RunFunction() {
            @Override
            public void doRun(FlowObject flowObject) throws InterruptedException {
                System.out.println("启动计时器:"+time);
                if(unit == 0){
                    sleep(time * 1000);
                }else if(unit == 1){
                    sleep(time * 60 * 1000);
                }else if(unit == 2){
                    sleep(time * 60 * 60 * 1000);
                }
            }
        };
        this.setRunFunction(runFunction);
    }

}
