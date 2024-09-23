package org.example;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SendMessage {
    // Find your Account Sid and Token at twilio.com/console
    public static final String ACCOUNT_SID = "token";
    public static final String AUTH_TOKEN = "token";
    @PostMapping("/trimite-mesaj")
    public String sendMessage(String[] args) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message message = Message.creator(
                new com.twilio.type.PhoneNumber("whatsapp:+Aici era numarul meu de telefon"),
                new com.twilio.type.PhoneNumber("whatsapp:+14155238886"),
                "Fain Site !").create();

        System.out.println(message.getSid());
        System.out.println(message.getBody());
        return message.getBody();
    }
}
