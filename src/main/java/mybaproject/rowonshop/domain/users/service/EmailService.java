package mybaproject.rowonshop.domain.users.service;

import mybaproject.rowonshop.global.dto.Mail;

public interface EmailService {

    String sendSimpleMessage(String to)throws Exception;
}
