package com.demo.chathistory;

import java.util.Arrays;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import ai.active.fulfillment.webhook.WebhookUtil;
import ai.active.fulfillment.webhook.data.response.MorfeusWebhookResponse;
import ai.active.fulfillment.webhook.data.response.TextMessage;

/**
 * Controller
 */
@RestController
public class Controller {

    @PostMapping(path = "/history", consumes = "application/json", produces = "application/json")
    public MorfeusWebhookResponse name(@RequestBody String body,
    @RequestHeader(name = "X-Hub-Signature", required = true) String signature) throws Exception {
        System.out.println(body);
        if (!WebhookUtil.generateSignature(body, "secret").equals(signature)) {
            throw new Exception("Signature mismatch");
          }

        //   <YOUR CODE HERE>

          MorfeusWebhookResponse messageWrapper = new MorfeusWebhookResponse();
          TextMessage textMessage = new TextMessage();
          textMessage.setContent("Sure our agent will contact you!");
          textMessage.setType("text");
          messageWrapper.setMessages(Arrays.asList(textMessage));
          messageWrapper.setExpectedEntities(Arrays.asList("NONE"));
          return messageWrapper;
    }
    
}