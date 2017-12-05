package chen;

import java.util.Iterator;

import utils.MailUtils;

public class Test {
	public static void main(String[] args) {
//		MailUtils.setBase("smtp.mxhichina.com", "drools@sinowaycredit.com", "dataResolve!");
//		MailUtils.setAddress("drools@sinowaycredit.com", "bc.dong@sinowaycredit.com", "测试");
//		MailUtils.setContent("测试数据");
//		MailUtils.setContent("<html><head></head><body><div><ol><li>1</li><li>1</li><li>1</li><li>1</li></ol></div></body></html>");
//		MailUtils.send(true);
		
		String ss = "a>4||b<45&&c<100||d>12";
		String [] a = ss.split("[\\&\\&||]");
		for (String string : a) {
			System.out.println(string);
			String []b = string.split("[< > == != <= >=]");
				for (String string2 : b) {
					System.out.println(string2);
				}
//				System.out.println(b[0]);
//				System.out.println(b[1]);
//				System.out.println(b[2]);
		}
	}
}
