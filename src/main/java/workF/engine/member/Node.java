package workF.engine.member;

import workF.engine.member.funcations.RunFunction;

/**
 * @author:wones
 * @desc:节点类
 * @date:2022/9/9 8:21
 */
public class Node {
    private int id;//编号
    private int type;//节点类型

    private Connect leftConnect; //左边端口绑定的线
    private Connect rightConnect;//右边端口绑定的线

    private FlowObject flowObject; //流件
    private RunFunction runFunction;//节点执行的方法

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public RunFunction getRunFunction() {
        return runFunction;
    }

    public void setRunFunction(RunFunction runFunction) {
        this.runFunction = runFunction;
    }

    public FlowObject getFlowObject() {
        return flowObject;
    }

    public void setFlowObject(FlowObject flowObject) {
        this.flowObject = flowObject;
    }

    public void run() throws InterruptedException {
        runFunction.doRun(flowObject);
    }
    public Node(){
    }

    public Node(int type, Connect leftConnect, Connect rightConnect) {
        this.type = type;
        this.leftConnect = leftConnect;
        this.rightConnect = rightConnect;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Connect getLeftConnect() {
        return leftConnect;
    }

    public void setLeftConnect(Connect leftConnect) {
        this.leftConnect = leftConnect;
    }

    public Connect getRightConnect() {
        return rightConnect;
    }

    public void setRightConnect(Connect rightConnect) {
        this.rightConnect = rightConnect;
    }
    public void transport(){
        this.rightConnect.setFlowObject(this.flowObject);
    }
}
