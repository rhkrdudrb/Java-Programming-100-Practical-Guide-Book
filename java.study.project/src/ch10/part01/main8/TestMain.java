package ch10.part01.main8;

public class TestMain {
	/** static method1() 함수 정의 - 고의 예외발생*/
	public static void method1() throws Exception{
		throw new Exception("method1 예외발생 테스트");
	}
	
	/**static method2() 함수정의*/
	public static void method2() {
		try {
			/**method1() 함수호출에 의해 고의 예외발생되며 catch 문으로 이동*/
			method1();
		} catch (Exception e) {
			
			/**Exception 예외발생 시 처리로직 구간
			  - 예외처리 주요함수로 e.printStackTrace() 구현하기
			  - 콘솔에 저장되는 내용을 String으로 저장하기
			  */
			String errMessage = "";
			
			/** 클래스명, 에러메시지 조회*/
			String name = e.getClass().getName();
			String message = e.getMessage();
			errMessage += name + ":" + message + "\r\n";
			
			StackTraceElement [] stackTrace = e.getStackTrace();
			for(StackTraceElement s : stackTrace){
				
				/**클래스, 함수, 파일, 라인정보를 조회*/
				String className = s.getClassName();
				String methodName = s.getMethodName();
				String fileName = s.getFileName();
				int lineNumber = s.getLineNumber();
				
				errMessage += "\t at " + className + "." + methodName;
				errMessage += "(" + fileName + ":" + lineNumber + ")\r\n";
				
			}
			/**해당 에러 정보를 DB또는 파일에 저장하면 된다*/
			System.out.println(errMessage);
		}
	}
	public static void main(String[] args) { 
		/**method2() 함수호출*/
		method2();
	}
}