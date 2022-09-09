package workF.test;

/**
 * @author:wones
 * @desc:请求类
 * @date:2022/9/7 23:31
 */
public class Request {
    private int day;
    private String name;
    private String desc;
    private boolean flag;

    public Request(int day, String name, String desc) {
        this.day = day;
        this.name = name;
        this.desc = desc;
    }

    public int getDay() {
        return day;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
