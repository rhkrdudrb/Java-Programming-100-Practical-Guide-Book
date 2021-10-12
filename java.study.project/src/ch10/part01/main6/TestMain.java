package ch10.part01.main6;

import java.io.File;
import java.io.FileNotFoundException;

public class TestMain {
	/**read() 함수정의 - [절차2] 예외를 위임*/
	public void read(String path) throws FileNotFoundException{
		
		/**파일관리를 위한 File 객체생성 및 존재여부 확인*/
		File file = new File(path);
		boolean exists = file.exists();
		if(exists == false) {
			System.out.println("파일 존재 안함");
			/**[절차1] 예외 발생시키기*/
			throw new FileNotFoundException("해당 파일이 존재하지 않습니다.");
		}else {
			System.out.println("파일존재함");
		}
	}
	public static void main(String[] args) {
		try {
			/** read() 함수를 사용 시 예외처리 - 존재하지 않는 파일을 설정*/
			new TestMain().read("d://test11.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}