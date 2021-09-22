package ch07.part05.main5.sub4;

public class MemberVo extends DefaultVo{

	/** 속성 정의 */
	private String memberId;
	private String memberName;

	/** 생성자함수 정의 */
	public MemberVo(String memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}

	/** 자료의 정보를 반환하는 함수 정의 */
	public Object[] getData() {
		return new Object[] { memberId, memberName };
	}

	/** 테이블의 헤더정보를 반환하는 함수 정의 */
	public String[] getHeaderInfo() {
		return new String[] { "회원아이디", "회원명" };
	}
}