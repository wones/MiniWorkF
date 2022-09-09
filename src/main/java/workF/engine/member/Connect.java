package workF.engine.member;

/**
 * @author:wones
 * @desc:连接类
 * @date:2022/9/9 8:23
 */
public class Connect {
    private Node leftNode;
    private Node rightNode;
    private FlowObject flowObject;
    public Connect(){}
    public Connect(Node leftNode, Node rightNode, FlowObject flowObject) {
        this.leftNode = leftNode;
        this.rightNode = rightNode;
        this.flowObject = flowObject;
    }

    public FlowObject getFlowObject() {
        return flowObject;
    }

    public void setFlowObject(FlowObject flowObject) {
        this.flowObject = flowObject;
    }

    public Node getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(Node leftNode) {
        this.leftNode = leftNode;
    }

    public Node getRightNode() {
        return rightNode;
    }

    public void setRightNode(Node rightNode) {
        this.rightNode = rightNode;
    }

}
