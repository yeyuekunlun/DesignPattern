package pattern.adapter;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public class Adapter implements Target{
	private MessageDigest md5;
	
	public Adapter() throws NoSuchAlgorithmException {
		// TODO Auto-generated constructor stub
		md5 = MessageDigest.getInstance("MD5");
	}

	@Override
	public String encode(String str) {
		// TODO Auto-generated method stub
		md5.update(str.getBytes());  
        byte b[] = md5.digest();  

        int i;  

        StringBuffer buf = new StringBuffer("");  
        for (int offset = 0; offset < b.length; offset++) {  
            i = b[offset];  
            if (i < 0)  
                i += 256;  
            if (i < 16)  
                buf.append("0");  
            buf.append(Integer.toHexString(i));  
        }  
        //32位加密  
        return buf.toString();  
        // 16位的加密  
        //return buf.toString().substring(8, 24);  
	}
	
	
}
