package cisdi.mes.im.common.enums;

public enum BGExecuteStatusEnum {
	 Success("success"), //执行成功
	Error("error");//执行失败
	private final String value;
	private BGExecuteStatusEnum(String value) {
		this.value = value;
	}
	public String value() {
		return this.value;
	}
	
}
