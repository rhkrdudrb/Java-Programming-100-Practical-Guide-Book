package ch09.part01.main1;

import java.lang.reflect.Field;

public class DefaultVo {
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();

		/** Class 객체생성 */
		Class<? extends DefaultVo> clazz = this.getClass();
		sb.append(clazz.getName() + "정보");
		/** Field 객체생성 */
		Field[] declaredField = clazz.getDeclaredFields();
		for(Field f : declaredField ) {
			if(f!=null) {
				
				/**전역변수명 조회*/
				String name = f.getName();
				String desc = "";
				/**@Desc 어노테이션에 명시된 name() 값 조회 - 필드 항목명*/
				Desc anno = f.getDeclaredAnnotation(Desc.class);
				if(anno !=null) {desc = anno.name();}
				
				/**전역변수의 값 조회*/
				String value= "";
				try {
					
					/**접근권한부여 -> 전역변수 값 조회-> 접근권한복원*/
					boolean accessible = f.isAccessible();
					f.setAccessible(true);
					Object obj = f.get(this);
					if(obj !=null) {value = obj.toString();}
					f.setAccessible(accessible);
				} catch (IllegalArgumentException e ) {
					e.printStackTrace();
				} catch (IllegalAccessException e ) {
					e.printStackTrace();
				}
				
				/**앞의 문자열에 name, value, desc의 정보를 갖는 문자열 추가*/
				sb.append("\r\n\t" + name + " = " + value + "  [" + desc + "]");
				
				}
			}
		return sb.toString();
	}
  }