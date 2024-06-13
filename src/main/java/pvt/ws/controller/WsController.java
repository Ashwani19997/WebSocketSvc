package pvt.ws.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

import pvt.ws.commn.Getting;
import pvt.ws.request.WsMessageRequest;

@Controller
public class WsController {

	@MessageMapping("/hello")
	@SendTo("/topic/greetings")
	public Getting greeting(WsMessageRequest message) throws Exception {
		Thread.sleep(1000); // simulated delay
		return new Getting("Hello, " + HtmlUtils.htmlEscape(message.getName()) + "!");
	}
}
