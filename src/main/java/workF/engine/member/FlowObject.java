package workF.engine.member;

/**
 * @author:wones
 * @desc:流动对象类
 * @date:2022/9/9 8:22
 */
public class FlowObject {
    private String name;
    private int type;
    private Object data;
    public FlowObject(){}

    public FlowObject(String name, int type, Object data) {
        this.name = name;
        this.type = type;
        this.data = data;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
