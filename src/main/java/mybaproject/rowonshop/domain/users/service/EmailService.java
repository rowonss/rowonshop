package mybaproject.rowonshop.domain.users.service;

import mybaproject.rowonshop.global.dto.Mail;

public interface EmailService {

    void sendSimpleMessage(String to)throws Exception;
}
