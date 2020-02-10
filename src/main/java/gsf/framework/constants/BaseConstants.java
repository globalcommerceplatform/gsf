package gsf.framework.constants;

public class BaseConstants {

	public static final String	SYSTEM_BO						= "BO";						//backoffice
	public static final String	SYSTEM_FO						= "FO";						//front
	public static final String	SYSTEM_PO						= "PO";						//partner
	public static final String	SYSTEM_BATCH					= "BATCH";
	public static final String	SYSTEM_ADMIN						= "ADMIN";						//backoffice
	public static final String	SYSTEM_PARTNER						= "PARTNER";						//partner
	public static final String	SYSTEM_FRONT						= "FRONT";						//front
	
	
	public static final String	DEFAULT_STORE_ID				= "1001";
	
	//================================ session
	public static final String	SESSION_KEY_SYSTEM_TYPE				= "_system_type";				//system type (BO,FO,PO)
	public static final String 	SESSION_KEY_STORE_ID 				= "_storeId";
	public static final String 	SESSION_KEY_LANG_ID	 				= "_langId";
	
	public static final String 	SESSION_KEY_LOGIN_INFO 				= "loginInfo";
	public static final String 	SESSION_KEY_RETURN_URL 				= "returnUrl";
	public static final String 	SESSION_KEY_SYSTEM_LANG_ID_INFO 	= "sysLangIdInfo";
	public static final String 	SESSION_KEY_CART_NO_MEMBER 			= "cartNoMember";
	public static final String 	SESSION_KEY_HTTPSESSION_ID 			= "httpSessionId";
	public static final String 	SESSION_KEY_BEFORE_LANG_ID_INFO 	= "beforeLangIdInfo";
	public static final String	SESSION_KEY_BLACK_LIST_URL			= "_blackListUrl_";
	public static final String	SESSION_KEY_TIME_ZONE				= "_time_zone";
	
	public static final int		SESSION_TIMEOUT_ERROR				= 901;
	public static final String	SESSION_TIMEOUT_ERROR_INFO			= "SESSION TIMEOUT";
	// 채널정보
	public static final String	SESSION_KEY_CHANNEL					= "CHANNEL_ID";

	public static final String	SESSION_KEY_MOBILE_ORDER			= "MOBILE_ORDER";
	public static final String	SESSION_KEY_CHECK_ORDER				= "SESSION_CHECK_ORDER";

	public static final String	SESSION_KEY_MOBILE_ORDER_REGULAR	= "MOBILE_ORDER_REGULAR";
	public static final String	SESSION_KEY_MOBILE_REGULAR_URL		= "MOBILE_REGULAR_RETURN_URL";

	public static final String	WAREHOUSE_ID						= "1";
	
	public static final String		SYSTEM_USER_AGENT						= "User-Agent";
	public static final String[]	SYSTEM_MOBILE_OS						= new String[] { "iPhone", "iPod", "iPad", "Android",
			"BlackBerry", "Windows CE", "Nokia", "Webos", "Opera Mini", "SonyEricsson", "Opera Mobi", "IEMobile",
			"zerotosevenapp" };
	public static final String[]	SYSTEM_MOBILE_IOS						= new String[] { "iPhone", "iPod", "iPad"};

	public static final String[]	SYSTEM_MOBILE_APP						= new String[] { "zerotosevenapp" };
}
