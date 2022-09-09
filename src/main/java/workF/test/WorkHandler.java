package workF.test;

/**
 * @author:wones
 * @desc:描述类的功能
 * @date:2022/9/8 0:31
 */
public class WorkHandler extends Handler{
    public WorkHandler(String handerName, int minDay, int maxDay) {
        super(handerName, minDay, maxDay);
    }

    public WorkHandler(String handerName, int maxDay) {
        super(handerName, maxDay);
    }
}
