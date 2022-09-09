package workF.test;

/**
 * @author:wones
 * @desc:具体处理类
 * @date:2022/9/8 0:25
 */
public class GroupHandler extends Handler{
    public GroupHandler(String handerName, int minDay, int maxDay) {
        super(handerName, minDay, maxDay);
    }

    public GroupHandler(String handerName, int maxDay) {
        super(handerName, maxDay);
    }
}
