package pvt.ws.request;

public class WsMessageRequest {

	private String name;

	public WsMessageRequest() {
	}

	public WsMessageRequest(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
