package org.fi.springbootcompleteapp.services;

public interface MailService {
	boolean sendMail(String from, String to, String subject,String message);

}
