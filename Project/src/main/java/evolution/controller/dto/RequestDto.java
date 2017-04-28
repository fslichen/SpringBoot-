package evolution.controller.dto;

public class RequestDto {
	private String name;

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "RequestDto [name=" + name + "]";
	}

	public void setName(String name) {
		this.name = name;
	}
}
