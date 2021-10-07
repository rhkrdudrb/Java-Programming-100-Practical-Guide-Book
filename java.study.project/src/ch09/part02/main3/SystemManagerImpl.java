package ch09.part02.main3;

public class SystemManagerImpl implements ISystemManager {
	/** 추상메소드 기능목록 재정의 */
	@Override
	public void start() {
		/** 시스템 start로직구성*/
		System.out.println("system start()");
	}

	@Override
	public void stop() {
		/** 시스템 stop로직구성*/		
		System.out.println("system stop()");
	}

	@Override
	public void status() {
		/** 시스템 상태 로직구성*/
		System.out.println("system status()");
	}
	public static void main(String [] args) {
		SystemManagerImpl systemManager = new SystemManagerImpl();
		systemManager.start();
		systemManager.stop();
		systemManager.status();
	}
	

}
