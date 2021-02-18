package seleniumLibrary;

import java.security.spec.KeySpec;
import org.apache.commons.codec.binary.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESedeKeySpec;

public class AESUtil {

	private static final String UNICODE_FORMAT = "UTF8";
	public static final String DESEDE_ENCRYPTION_SCEME = "DESede";
	private KeySpec keySpec;
	private SecretKeyFactory keyFactory;
	private Cipher cipher;
	byte[] arrayBytes;
	private String encryptionKey;
	private String encryptionScheme;
	SecretKey key;

	public AESUtil() throws Exception {
		encryptionKey = "ThisIsSpartaThisIsSparta";
		encryptionScheme = DESEDE_ENCRYPTION_SCEME;
		arrayBytes = encryptionKey.getBytes(UNICODE_FORMAT);
		keySpec = new DESedeKeySpec(arrayBytes);
		keyFactory = SecretKeyFactory.getInstance(encryptionScheme);
		cipher = Cipher.getInstance(encryptionScheme);
		key = keyFactory.generateSecret(keySpec);

	}

	public String encrypt(String unencryptedString) {
		String encryptedString = null;
		try {
			cipher.init(Cipher.ENCRYPT_MODE, key);
			byte[] plainText = unencryptedString.getBytes(UNICODE_FORMAT);
			byte[] encryptedText = cipher.doFinal(plainText);
			encryptedString = new String(Base64.encodeBase64(encryptedText));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return encryptedString;

	}

	public String decrypt(String encryptedString) {
		String decryptedText = null;
		try {
			cipher.init(Cipher.DECRYPT_MODE, key);
			byte[] encryptedText = Base64.decodeBase64(encryptedString);
			byte[] plainText = cipher.doFinal(encryptedText);
			decryptedText = new String(plainText);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return decryptedText;

	}

}
