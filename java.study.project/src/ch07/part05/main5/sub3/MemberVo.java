package ch07.part05.main5.sub3;

public class MemberVo {
	private String memberId;
	private String memberName;

	public MemberVo(String memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}

	public Object[] getData() {
		return new Object[] { memberId, memberName };
	}

	public String[] getHeaderInfo() {
		return new String[] { "회원아이디", "회원명" };
	}
}