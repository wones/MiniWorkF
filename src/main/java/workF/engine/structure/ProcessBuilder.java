package workF.engine.structure;

import workF.engine.member.Connect;
import workF.engine.member.FlowObject;
import workF.engine.member.Node;
import workF.engine.member.events.EndEvent;
import workF.engine.member.events.StartEvent;

import java.util.ArrayList;
import java.util.List;

/**
 * @author:wones
 * @desc:流程构造类
 * @date:2022/9/9 8:40
 */
public class ProcessBuilder {

    public static void makeConnect(Node node, Connect input, Connect output) {
        node.setLeftConnect(input);
        node.setRightConnect(output);
        if(input != null){
            input.setRightNode(node);
        }
        if(output != null){
            output.setLeftNode(node);
        }
        return;
    }

    public static void executeAndDeliver(Node node) throws InterruptedException {
        if(node != null) {
            if (node instanceof StartEvent) {
                node.run();
                if (node.getRightConnect() != null) {
                    node.getRightConnect().setFlowObject(node.getFlowObject());
                }
                if (node.getRightConnect().getRightNode() != null)
                    executeAndDeliver(node.getRightConnect().getRightNode());
            } else if (node instanceof EndEvent) {
                FlowObject flowObject = node.getLeftConnect().getFlowObject();
                node.run();
                return;
            } else {
                node.setFlowObject(node.getLeftConnect().getFlowObject());
                node.run();
                if (node.getRightConnect() != null) {
                    node.transport();
                }
                if (node.getRightConnect().getRightNode() != null)
                    executeAndDeliver(node.getRightConnect().getRightNode());
            }
        }

    }
}
