import com.chensong.exception.CsException;
import com.chensong.util.DateUtil;


public class DateUtilTest {
	public static void main(String[] args) {
		try {
			System.out.println(DateUtil.getCurrentTime("yyyy-MM-dd hh:mm:ss"));
		} catch (CsException e) {
			e.printStackTrace();
		}
	}
}
