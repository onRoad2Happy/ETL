import com.payegis.tools.string.NumberUtils;
import org.apache.log4j.Logger;

/**
 * company: 北京通付盾数据科技有限公司
 * user: chenzuoli
 * date: 2018/6/15
 * time: 10:45
 * description: 测试NumberUtils工具类
 */

public class TestNumberUtils {
    private static Logger logger = Logger.getLogger(TestNumberUtils.class);

    public static void main(String[] args) {
        t3();
    }

    private static void t1() {
        int num = 1;
        String s = NumberUtils.transformNumberToDouble(num);
        System.out.println(s);
        double d = 0.114454556;
        System.out.println(NumberUtils.transformNumberToDouble(d));
        System.out.println("---------------");
        System.out.println(NumberUtils.transformFloatStrToIntStr("0.9988"));
        System.out.println(NumberUtils.transformFloatStrToIntStr("0.11111"));
    }

    private static void t2() {
        double d1 = 0.2234566;
        double d2 = 0.5234566;
        System.out.println(NumberUtils.transformFloatStrToIntStr(String.valueOf(d1)));
        System.out.println(NumberUtils.transformFloatStrToIntStr(String.valueOf(d2)));
        System.out.println("-------------");
        System.out.println(NumberUtils.transformFloatStrToInt(String.valueOf(d1)));
        System.out.println(NumberUtils.transformFloatStrToInt(String.valueOf(d2)));
    }

    private static void t3(){
        String floatStr = "1.00";
        System.out.println(NumberUtils.transformFloatStrToIntStr(floatStr));
    }

}
