package org.example;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;



public class Test {
    public static final String ACCOUNT_SID = "token";
    public static final String AUTH_TOKEN = "token";

    public static void main(String[] args) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message message = Message.creator(
                new com.twilio.type.PhoneNumber("whatsapp:+Aici era numarul meu de telefon"),
                new com.twilio.type.PhoneNumber("whatsapp:+14155238886"),
                "Traieste !!").create();

        System.out.println(message.getSid());
        System.out.println(message.getBody());
    }
}