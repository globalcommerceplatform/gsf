package gsf.framework.vo;

import java.io.File;

import lombok.Data;

@Data
public class FileInfoVO {

	/** The path. */
	private String dir;

	/** The original file name. */
	private String fileName;

	private String organizedFileName;

	private String fullPath;
	private String tempFullPath;
	private Long fileSize;

	private File file;

	private String system;
	private String biz;
	private String target; //id
	private String subDir;
	
	private String usePkInFileName;	// 특정 pk를 파일명에 사용시 세팅 (파일명 맨앞에 세팅 ex] '1_' )
	private String useCd;	// 특정 코드를 파일명에 사용시 세팅

	private String referer;

	private boolean isSuccess = true;
	private boolean isResize = false;
	private boolean isTempUpload = true;
	private boolean isInnerRepository = false;	// 저장공간의 위치여부
	
}
